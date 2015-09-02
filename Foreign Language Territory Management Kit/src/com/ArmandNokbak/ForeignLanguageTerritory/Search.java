/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ArmandNokbak.ForeignLanguageTerritory;

/**
 *
 * @author Armand Nokbak
 */
import static com.ArmandNokbak.ForeignLanguageTerritory.Home.lastNamesList;
import static com.ArmandNokbak.ForeignLanguageTerritory.Home.searchZip4;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Search extends Thread {

    private String found;
    private String state = "";
    int count = 0;

    public Search() {
       Home.foundLbl.setText("Searching ...");
    }
    LinkedList<HouseHold> results = new LinkedList<HouseHold>();

    @Override
    public void run() {
        
        state = (String) Home.statesComboBox.getSelectedItem();
        for (Object zipCode : Home.zipCodesList) {
            for (Object lastName : Home.lastNamesList) {

                try {
                    Connection.Response loginForm = Jsoup.connect("http://wp.superpages.com/")
                            .method(Connection.Method.GET)
                            .execute();

                    Document document = Jsoup.connect("http://wp.superpages.com/redirect.php")
                            .data("qn", (String) lastName)
                            .data("qloc", Home.cityField.getText() + ", " + Home.statesComboBox.getSelectedItem()
                                    + " " + (String) zipCode)
                            .data("submit", "Search")
                            //.cookies(loginForm.cookies())
                            .post();

                    Elements names = document.getElementsByAttributeValueMatching("itemtype", "http://schema.org/Person");
                    for (Element person : names) {
                        String name = person.getElementsByAttributeValue("itemprop", "name").text();
                        String address = person.getElementsByAttributeValue("itemprop", "streetAddress").text();
                        String city = person.getElementsByAttributeValue("itemprop", "addressLocality").text();
                        String state = person.getElementsByAttributeValue("itemprop", "addressRegion").text();
                        String zip = person.getElementsByAttributeValue("itemprop", "postalCode").text();
                        String tel = person.getElementsByAttributeValue("itemprop", "telephone").text();

                        if (zip.equals(zipCode)) {
                            // Display the results
                            Home.resultsTextPane.setText(Home.resultsTextPane.getText() + "\n" + name + ", " + address
                                    + ", " + city + ", " + state + ", " + zip + ", " + tel);
                            // New HouseHold object.
                            HouseHold house = new HouseHold();
                            house.setName(name);
                            house.setStreet(address);
                            house.setCity(city);
                            house.setState(state);
                            house.setZip(zip);
                            house.setTel(tel);

                            // add the house to the results list
                            results.add(house);
                            count++;
                            Home.foundLbl.setText(Integer.toString(count)+" found, still searching...");

                            /**
                             * //SIMULTANEOUS ZIP+4 SEARCH START HERE
                             *
                             *
                             *
                             * try { /// Begin the search for ZIP+4 from
                             * usps.com loginForm =
                             * Jsoup.connect("https://tools.usps.com/go/ZipLookupAction!input.action")
                             * .method(Connection.Method.POST) .execute();
                             *
                             * document =
                             * Jsoup.connect("https://tools.usps.com/go/ZipLookupAction.action")
                             * //.data("mode", "0") .data("tAddress",
                             * house.getStreet()) .data("tCity",
                             * house.getCity()) .data("zip", house.getZip())
                             * .data("lookupZipFindbtn", "Find") //.wait(2000)
                             * .userAgent("Mozilla/5.0 (Windows; U; WindowsNT
                             * 5.1; en-US; rv1.8.1.6) Gecko/20070725
                             * Firefox/2.0.0.6") //
                             * .referrer("http://www.google.com")
                             *
                             * .post();
                             *
                             * Elements yield =
                             * document.getElementsByClass("zip4"); // if
                             * (yield.size() > 0) { String newZip =
                             * house.getZip() + "-" + yield.text();
                             * house.setZip(newZip);
                             * Home.resultsTextPane.setText(Home.resultsTextPane.getText()
                             * + "\n" + house.toString());
                             *
                             * count++;
                             * Home.foundLbl.setText(Integer.toString(count));
                             * /** } else {
                             * Home.resultsTextPane.setText(Home.resultsTextPane.getText()
                             * + "\n" + "Zip not found"); }
                             *
                             */
                            /**
                             * } catch (IOException ex) {
                             * //Logger.getLogger(Search.class.getName()).log(Level.SEVERE,
                             * null, ex); }
                             *
                             *
                             *
                             * // SIMULTANEOUS ZIP+4 ENDS HERE
                             *
                             */

                        }
                    }

                } catch (IOException ex) {
                    //JOptionPane.showMessageDialog(null, "Couldn't connect to web ");
                }

            }
        }
        Home.foundLbl.setText(Integer.toString(count) + " found..Search is Over..");

        String message = "Do you approve of the results so the Zip+4s can be harvested?";
        int reply = JOptionPane.showConfirmDialog(null, message, "Zip+4 harvest", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
           searchZip4 = new SearchZip4();
        searchZip4.start();
        } else {

        }
    }

}
