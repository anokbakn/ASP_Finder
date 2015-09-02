/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ArmandNokbak.ForeignLanguageTerritory;

import foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit;
import static foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit.dataList;
import static foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit.user;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author anokbakn
 */
public class SearchZip4 extends Thread {

    Timer timer = new Timer();
    public int listSize;
    // ObjectOutputStream output;

    public SearchZip4() {
        //   ForeignLanguageTerritoryManagementKit.engageDataSaving.timer.cancel();
        //Setup a timer for a recurring task
        timer.schedule(new UpdateTask(), 0, 12000);
    }

    private class UpdateTask extends TimerTask {

        @Override
        public void run() {
            EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    /**
                     * int i = 0; for (HouseHold house : Home.search.results) {
                     * // this.timeout(10000); i++;
                     *
                     * if (i <= 10) {
                     *
                     */
                    

                    HouseHold house = Home.search.results.get(0);// the list from the "search" Thread
                    try {
                        /// Begin the search for ZIP+4 from www.zip-codes.com
                        Connection.Response loginForm = Jsoup.connect("http://www.zip-codes.com/search.asp")
                                .method(Connection.Method.GET)
                                .execute();

                        Map<String, String> loginCookies = loginForm.cookies();
                        final Map<String, String> cookies = loginForm.cookies();

                        Document document = Jsoup.connect("http://www.zip-codes.com/search.asp")
                                //.data("mode", "0")

                                .data("fld-address", house.getStreet())
                                .data("fld-city", house.getCity())
                                .data("fld-state", house.getState())
                                .data("srchButton", "Find Zip Code of this U.S. Address")
                                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                                .referrer("http://www.google.com")
                                //.cookies(loginCookies)
                                //.timeout(1200)
                                .followRedirects(true)
                                .get();

                        Elements yield = document.getElementsByTag("span");

                        String newZip = yield.get(6).text();
                        house.setZip(newZip);
                        Home.resultsTextPane.setText(Home.resultsTextPane.getText()
                                + "\n" + house.toString());
                        // Adding to the data linkedList from "care.bin"
                        ForeignLanguageTerritoryManagementKit.dataList.add(house);

                        // End of Adding to the data linkedList from "care.bin"
                        Home.search.count++;
                        Home.foundLbl.setText(Integer.toString(Home.search.count)+" found, still searching...");

                        Home.search.results.remove(0);
                        /**
                         * }
                         * else {
                         * Home.resultsTextPane.setText(Home.resultsTextPane.getText()
                         * + "\n" + "Zip not found"); }
                         *
                         */
                    } catch (IOException ex) {
                        Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                       // JOptionPane.showMessageDialog(null, "Can't retrieve ZIP+4(s)");
                    }
                    /**
                     * } else { i = 0; }
                     *
                     * }*
                     */
                    if (Home.search.results.size() == 0) {
                        Home.foundLbl.setText(Integer.toString(Home.search.count) + " Zip+4..Search is Over..");

                        timer.cancel();
                        Home.choseList = false;
                        //System.out.println(ForeignLanguageTerritoryManagementKit.dataList.toString());
                        try {
                            ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream("care.bin"));
                            output1.writeObject(ForeignLanguageTerritoryManagementKit.dataList);
                            output1.close();

                        } catch (IOException ex1) {
                            JOptionPane.showMessageDialog(null, "Login output stream not created.\n Contact developer.");
                        }

                        //Sorting the list now////////////////////////////////////////////////
                        Collections.sort(ForeignLanguageTerritoryManagementKit.dataList);
                    //End of sorting algorytm////////////////////////////////////

                    }
                }
            });
        }
    }

    @Override
    public void run() {
        Home.resultsTextPane.setText("");
        Home.search.count = 0;
        listSize = Home.search.results.size();
        SearchZip4 zip4Search = new SearchZip4();

    }

}
