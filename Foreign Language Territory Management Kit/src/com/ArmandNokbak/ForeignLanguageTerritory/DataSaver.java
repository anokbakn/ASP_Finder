/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ArmandNokbak.ForeignLanguageTerritory;

import foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit;
import java.awt.EventQueue;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author anokbakn
 */
public class DataSaver extends Thread {
    
  
	private Thread t;
	
	Timer timer = new Timer() ;

	int nSeconds = 0;
	public DataSaver()
	{
	
		timer.schedule(new UpdateUITask(),0, 900000);// repeats every 15 minutes
	}
	
	private class UpdateUITask extends TimerTask {

		

        @Override
        public void run() {
            EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                	try {
                            ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream("care.bin"));
                            output1.writeObject(ForeignLanguageTerritoryManagementKit.dataList);
                            output1.close();
                            
                           // JOptionPane.showMessageDialog(null, "SAVING DATA");

                        } catch (IOException ex1) {
                            JOptionPane.showMessageDialog(null, "DATA SAVING UNSUCCESSFUL");
                        }
                }
            });
        }
    }
	
	@Override
	public void run() {
		DataSaver clock = new DataSaver();
		
	}


}

    
