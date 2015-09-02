import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class Panel extends JPanel
{
	int control =0;
	ArrayList<JTextField> textFields = new ArrayList<JTextField>(81);
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9, textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18, textField19, textField20, textField21, textField22, textField23, textField24, textField25, textField26, textField27, textField28, textField29, textField30, textField31, textField32, textField33, textField34, textField35, textField36, textField37, textField38, textField39, textField40, textField41, textField42, textField43, textField44, textField45, textField46, textField47, textField48, textField49, textField50, textField51, textField52, textField53, textField54, textField55, textField56, textField57, textField58, textField59, textField60, textField61, textField62, textField63, textField64, textField65, textField66, textField67, textField68, textField69, textField70, textField71, textField72, textField73, textField74, textField75, textField76, textField77, textField78, textField79, textField80, textField81;
	JButton decodeButton;
	private String display="";
	Board board = new Board();
	public Panel()
	{
		setPreferredSize(new Dimension(270, 230));
		
		JPanel subPanel1 = new JPanel();
		subPanel1.setLayout(new GridLayout(9, 9));
		
		textField1 = new JTextField(2);
		subPanel1.add(textField1);
		textField2 = new JTextField(2);
		subPanel1.add(textField2);
		textField3 = new JTextField(2);
		subPanel1.add(textField3);
		textField4 = new JTextField(2);
		subPanel1.add(textField4);
		textField5 = new JTextField(2);
		subPanel1.add(textField5);
		textField6 = new JTextField(2);
		subPanel1.add(textField6);
		textField7 = new JTextField(2);
		subPanel1.add(textField7);
		textField8 = new JTextField(2);
		subPanel1.add(textField8);
		textField9 = new JTextField(2);
		subPanel1.add(textField9);
		textField10 = new JTextField(2);
		subPanel1.add(textField10);
		textField11 = new JTextField(2);
		subPanel1.add(textField11);
		textField12 = new JTextField(2);
		subPanel1.add(textField12);
		textField13 = new JTextField(2);
		subPanel1.add(textField13);
		textField14 = new JTextField(2);
		subPanel1.add(textField14);
		textField15 = new JTextField(2);
		subPanel1.add(textField15);
		textField16 = new JTextField(2);
		subPanel1.add(textField16);
		textField17 = new JTextField(2);
		subPanel1.add(textField17);
		textField18 = new JTextField(2);
		subPanel1.add(textField18);
		textField19 = new JTextField(2);
		subPanel1.add(textField19);
		textField20 = new JTextField(2);
		subPanel1.add(textField20);
		textField21 = new JTextField(2);
		subPanel1.add(textField21);
		textField22 = new JTextField(2);
		subPanel1.add(textField22);
		textField23 = new JTextField(2);
		subPanel1.add(textField23);
		textField24 = new JTextField(2);
		subPanel1.add(textField24);
		textField25 = new JTextField(2);
		subPanel1.add(textField25);
		textField26 = new JTextField(2);
		subPanel1.add(textField26);
		textField27 = new JTextField(2);
		subPanel1.add(textField27);
		textField28 = new JTextField(2);
		subPanel1.add(textField28);
		textField29 = new JTextField(2);
		subPanel1.add(textField29);
		textField30 = new JTextField(2);
		subPanel1.add(textField30);
		textField31 = new JTextField(2);
		subPanel1.add(textField31);
		textField32 = new JTextField(2);
		subPanel1.add(textField32);
		textField33 = new JTextField(2);
		subPanel1.add(textField33);
		textField34 = new JTextField(2);
		subPanel1.add(textField34);
		textField35 = new JTextField(2);
		subPanel1.add(textField35);
		textField36 = new JTextField(2);
		subPanel1.add(textField36);
		textField37 = new JTextField(2);
		subPanel1.add(textField37);
		textField38 = new JTextField(2);
		subPanel1.add(textField38);
		textField39 = new JTextField(2);
		subPanel1.add(textField39);
		textField40 = new JTextField(2);
		subPanel1.add(textField40);
		textField41 = new JTextField(2);
		subPanel1.add(textField41);
		textField42 = new JTextField(2);
		subPanel1.add(textField42);
		textField43 = new JTextField(2);
		subPanel1.add(textField43);
		textField44 = new JTextField(2);
		subPanel1.add(textField44);
		textField45 = new JTextField(2);
		subPanel1.add(textField45);
		textField46 = new JTextField(2);
		subPanel1.add(textField46);
		textField47 = new JTextField(2);
		subPanel1.add(textField47);
		textField48 = new JTextField(2);
		subPanel1.add(textField48);
		textField49 = new JTextField(2);
		subPanel1.add(textField49);
		textField50 = new JTextField(2);
		subPanel1.add(textField50);
		textField51 = new JTextField(2);
		subPanel1.add(textField51);
		textField52 = new JTextField(2);
		subPanel1.add(textField52);
		textField53 = new JTextField(2);
		subPanel1.add(textField53);
		textField54 = new JTextField(2);
		subPanel1.add(textField54);
		textField55 = new JTextField(2);
		subPanel1.add(textField55);
		textField56 = new JTextField(2);
		subPanel1.add(textField56);
		textField57= new JTextField(2);
		subPanel1.add(textField57);
		textField58 = new JTextField(2);
		subPanel1.add(textField58);
		textField59 = new JTextField(2);
		subPanel1.add(textField59);
		textField60 = new JTextField(2);
		subPanel1.add(textField60);
		textField61 = new JTextField(2);
		subPanel1.add(textField61);
		textField62 = new JTextField(2);
		subPanel1.add(textField62);
		textField63 = new JTextField(2);
		subPanel1.add(textField63);
		textField64 = new JTextField(2);
		subPanel1.add(textField64);
		textField65 = new JTextField(2);
		subPanel1.add(textField65);
		textField66 = new JTextField(2);
		subPanel1.add(textField66);
		textField67 = new JTextField(2);
		subPanel1.add(textField67);
		textField68 = new JTextField(2);
		subPanel1.add(textField68);
		textField69 = new JTextField(2);
		subPanel1.add(textField69);
		textField70 = new JTextField(2);
		subPanel1.add(textField70);
		textField71 = new JTextField(2);
		subPanel1.add(textField71);
		textField72 = new JTextField(2);
		subPanel1.add(textField72);
		textField73 = new JTextField(2);
		subPanel1.add(textField73);
		textField74 = new JTextField(2);
		subPanel1.add(textField74);
		textField75 = new JTextField(2);
		subPanel1.add(textField75);
		textField76 = new JTextField(2);
		subPanel1.add(textField76);
		textField77 = new JTextField(2);
		subPanel1.add(textField77);
		textField78= new JTextField(2);
		subPanel1.add(textField78);
		textField79 = new JTextField(2);
		subPanel1.add(textField79);
		textField80 = new JTextField(2);
		subPanel1.add(textField80);
		textField81 = new JTextField(2);
		subPanel1.add(textField81);
							
		
		JPanel subPanel3 = new JPanel();
		subPanel3.setLayout(new BorderLayout());
		subPanel3.add(subPanel1);
		JPanel subPanel2 = new JPanel();
		decodeButton = new JButton("DECODE SUDOKU");
		decodeButton.addActionListener(new ButtonListener());
		subPanel2.add(decodeButton);
		subPanel3.add(subPanel2, BorderLayout.SOUTH);
		add(subPanel3);
		
		textFields.add(textField1);
		textFields.add(textField2);
		textFields.add(textField3);
		textFields.add(textField4);
		textFields.add(textField5);
		textFields.add(textField6);
		textFields.add(textField7);
		textFields.add(textField8);
		textFields.add(textField9);
		textFields.add(textField10);
		textFields.add(textField11);
		textFields.add(textField12);
		textFields.add(textField13);
		textFields.add(textField14);
		textFields.add(textField15);
		textFields.add(textField16);
		textFields.add(textField17);
		textFields.add(textField18);
		textFields.add(textField19);
		textFields.add(textField20);
		textFields.add(textField21);
		textFields.add(textField22);
		textFields.add(textField23);
		textFields.add(textField24);
		textFields.add(textField25);
		textFields.add(textField26);
		textFields.add(textField27);
		textFields.add(textField28);
		textFields.add(textField29);
		textFields.add(textField30);
		textFields.add(textField31);
		textFields.add(textField32);
		textFields.add(textField33);
		textFields.add(textField34);
		textFields.add(textField35);
		textFields.add(textField36);
		textFields.add(textField37);
		textFields.add(textField38);
		textFields.add(textField39);
		textFields.add(textField40);
		textFields.add(textField41);
		textFields.add(textField42);
		textFields.add(textField43);
		textFields.add(textField44);
		textFields.add(textField45);
		textFields.add(textField46);
		textFields.add(textField47);
		textFields.add(textField48);
		textFields.add(textField49);
		textFields.add(textField50);
		textFields.add(textField51);
		textFields.add(textField52);
		textFields.add(textField53);
		textFields.add(textField54);
		textFields.add(textField55);
		textFields.add(textField56);
		textFields.add(textField57);
		textFields.add(textField58);
		textFields.add(textField59);
		textFields.add(textField60);
		textFields.add(textField61);
		textFields.add(textField62);
		textFields.add(textField63);
		textFields.add(textField64);
		textFields.add(textField65);
		textFields.add(textField66);
		textFields.add(textField67);
		textFields.add(textField68);
		textFields.add(textField69);
		textFields.add(textField70);
		textFields.add(textField71);
		textFields.add(textField72);
		textFields.add(textField73);
		textFields.add(textField74);
		textFields.add(textField75);
		textFields.add(textField76);
		textFields.add(textField77);
		textFields.add(textField78);
		textFields.add(textField79);
		textFields.add(textField80);
		textFields.add(textField81);
	}
	
	public void checkTextFields()
	{
		if (!textField1.getText().equals(""))
		{
			board.setPossibilities(1, Integer.parseInt(textField1.getText()));	
			textFields.get(0).setBackground(Color.cyan);
			textFields.get(0).setEditable(false);
		}
		if (!textField2.getText().equals(""))
		{
			board.setPossibilities(2, Integer.parseInt(textField2.getText()));
			textFields.get(1).setBackground(Color.cyan);
			textFields.get(1).setEditable(false);
		}
		if (!textField3.getText().equals(""))
		{
			board.setPossibilities(3, Integer.parseInt(textField3.getText()));		
			textFields.get(2).setBackground(Color.cyan);
			textFields.get(2).setEditable(false);
		}
		if (!textField4.getText().equals(""))
		{
			board.setPossibilities(4, Integer.parseInt(textField4.getText()));	
			textFields.get(3).setBackground(Color.cyan);
			textFields.get(3).setEditable(false);
		}
		if (!textField5.getText().equals(""))
		{
			board.setPossibilities(5, Integer.parseInt(textField5.getText()));	
			textFields.get(4).setBackground(Color.cyan);
			textFields.get(4).setEditable(false);
		}
		if (!textField6.getText().equals(""))
		{
			board.setPossibilities(6, Integer.parseInt(textField6.getText()));	
			textFields.get(5).setBackground(Color.cyan);
			textFields.get(5).setEditable(false);
		}
		if (!textField7.getText().equals(""))
		{
			board.setPossibilities(7, Integer.parseInt(textField7.getText()));			
		}
		if (!textField8.getText().equals(""))
		{
			board.setPossibilities(8, Integer.parseInt(textField8.getText()));			
		}
		if (!textField9.getText().equals(""))
		{
			board.setPossibilities(9, Integer.parseInt(textField9.getText()));			
		}
		if (!textField10.getText().equals(""))
		{
			board.setPossibilities(10, Integer.parseInt(textField10.getText()));			
		}
		if (!textField11.getText().equals(""))
		{
			board.setPossibilities(11, Integer.parseInt(textField11.getText()));			
		}
		if (!textField12.getText().equals(""))
		{
			board.setPossibilities(12, Integer.parseInt(textField12.getText()));			
		}
		if (!textField13.getText().equals(""))
		{
			board.setPossibilities(13, Integer.parseInt(textField13.getText()));			
		}
		if (!textField14.getText().equals(""))
		{
			board.setPossibilities(14, Integer.parseInt(textField14.getText()));			
		}
		if (!textField15.getText().equals(""))
		{
			board.setPossibilities(15, Integer.parseInt(textField15.getText()));			
		}
		if (!textField16.getText().equals(""))
		{
			board.setPossibilities(16, Integer.parseInt(textField16.getText()));			
		}
		if (!textField17.getText().equals(""))
		{
			board.setPossibilities(17, Integer.parseInt(textField17.getText()));			
		}
		if (!textField18.getText().equals(""))
		{
			board.setPossibilities(18, Integer.parseInt(textField18.getText()));			
		}
		if (!textField19.getText().equals(""))
		{
			board.setPossibilities(19, Integer.parseInt(textField19.getText()));			
		}
		if (!textField20.getText().equals(""))
		{
			board.setPossibilities(20, Integer.parseInt(textField20.getText()));			
		}
		if (!textField21.getText().equals(""))
		{
			board.setPossibilities(21, Integer.parseInt(textField21.getText()));			
		}
		if (!textField22.getText().equals(""))
		{
			board.setPossibilities(22, Integer.parseInt(textField22.getText()));			
		}
		if (!textField23.getText().equals(""))
		{
			board.setPossibilities(23, Integer.parseInt(textField23.getText()));			
		}
		if (!textField24.getText().equals(""))
		{
			board.setPossibilities(24, Integer.parseInt(textField24.getText()));			
		}
		if (!textField25.getText().equals(""))
		{
			board.setPossibilities(25, Integer.parseInt(textField25.getText()));			
		}
		if (!textField26.getText().equals(""))
		{
			board.setPossibilities(26, Integer.parseInt(textField26.getText()));			
		}
		if (!textField27.getText().equals(""))
		{
			board.setPossibilities(27, Integer.parseInt(textField27.getText()));			
		}
		if (!textField28.getText().equals(""))
		{
			board.setPossibilities(28, Integer.parseInt(textField28.getText()));			
		}
		if (!textField29.getText().equals(""))
		{
			board.setPossibilities(29, Integer.parseInt(textField29.getText()));			
		}
		if (!textField30.getText().equals(""))
		{
			board.setPossibilities(30, Integer.parseInt(textField30.getText()));			
		}
		if (!textField31.getText().equals(""))
		{
			board.setPossibilities(31, Integer.parseInt(textField31.getText()));			
		}
		if (!textField32.getText().equals(""))
		{
			board.setPossibilities(32, Integer.parseInt(textField32.getText()));			
		}
		if (!textField33.getText().equals(""))
		{
			board.setPossibilities(33, Integer.parseInt(textField33.getText()));			
		}
		if (!textField34.getText().equals(""))
		{
			board.setPossibilities(34, Integer.parseInt(textField34.getText()));			
		}
		if (!textField35.getText().equals(""))
		{
			board.setPossibilities(35, Integer.parseInt(textField35.getText()));			
		}
		if (!textField36.getText().equals(""))
		{
			board.setPossibilities(36, Integer.parseInt(textField36.getText()));			
		}
		if (!textField37.getText().equals(""))
		{
			board.setPossibilities(37, Integer.parseInt(textField37.getText()));			
		}
		if (!textField38.getText().equals(""))
		{
			board.setPossibilities(38, Integer.parseInt(textField38.getText()));			
		}
		if (!textField39.getText().equals(""))
		{
			board.setPossibilities(39, Integer.parseInt(textField39.getText()));			
		}
		if (!textField40.getText().equals(""))
		{
			board.setPossibilities(40, Integer.parseInt(textField40.getText()));			
		}
		if (!textField41.getText().equals(""))
		{
			board.setPossibilities(41, Integer.parseInt(textField41.getText()));			
		}
		if (!textField42.getText().equals(""))
		{
			board.setPossibilities(42, Integer.parseInt(textField42.getText()));			
		}
		if (!textField43.getText().equals(""))
		{
			board.setPossibilities(43, Integer.parseInt(textField43.getText()));			
		}
		if (!textField44.getText().equals(""))
		{
			board.setPossibilities(44, Integer.parseInt(textField44.getText()));			
		}
		if (!textField45.getText().equals(""))
		{
			board.setPossibilities(45, Integer.parseInt(textField45.getText()));			
		}
		if (!textField46.getText().equals(""))
		{
			board.setPossibilities(46, Integer.parseInt(textField46.getText()));			
		}
		if (!textField47.getText().equals(""))
		{
			board.setPossibilities(47, Integer.parseInt(textField47.getText()));			
		}
		if (!textField48.getText().equals(""))
		{
			board.setPossibilities(48, Integer.parseInt(textField48.getText()));			
		}
		if (!textField49.getText().equals(""))
		{
			board.setPossibilities(49, Integer.parseInt(textField49.getText()));			
		}
		if (!textField50.getText().equals(""))
		{
			board.setPossibilities(50, Integer.parseInt(textField50.getText()));			
		}
		if (!textField51.getText().equals(""))
		{
			board.setPossibilities(51, Integer.parseInt(textField51.getText()));			
		}
		if (!textField52.getText().equals(""))
		{
			board.setPossibilities(52, Integer.parseInt(textField52.getText()));			
		}
		if (!textField53.getText().equals(""))
		{
			board.setPossibilities(53, Integer.parseInt(textField53.getText()));			
		}
		if (!textField54.getText().equals(""))
		{
			board.setPossibilities(54, Integer.parseInt(textField54.getText()));			
		}
		if (!textField55.getText().equals(""))
		{
			board.setPossibilities(55, Integer.parseInt(textField55.getText()));			
		}
		if (!textField56.getText().equals(""))
		{
			board.setPossibilities(56, Integer.parseInt(textField56.getText()));			
		}
		if (!textField57.getText().equals(""))
		{
			board.setPossibilities(57, Integer.parseInt(textField57.getText()));			
		}
		if (!textField58.getText().equals(""))
		{
			board.setPossibilities(58, Integer.parseInt(textField58.getText()));			
		}
		if (!textField59.getText().equals(""))
		{
			board.setPossibilities(59, Integer.parseInt(textField59.getText()));			
		}
		if (!textField60.getText().equals(""))
		{
			board.setPossibilities(60, Integer.parseInt(textField60.getText()));			
		}
		if (!textField61.getText().equals(""))
		{
			board.setPossibilities(61, Integer.parseInt(textField61.getText()));			
		}
		if (!textField62.getText().equals(""))
		{
			board.setPossibilities(62, Integer.parseInt(textField62.getText()));			
		}
		if (!textField63.getText().equals(""))
		{
			board.setPossibilities(63, Integer.parseInt(textField63.getText()));			
		}
		if (!textField64.getText().equals(""))
		{
			board.setPossibilities(64, Integer.parseInt(textField64.getText()));			
		}
		if (!textField65.getText().equals(""))
		{
			board.setPossibilities(65, Integer.parseInt(textField65.getText()));			
		}
		if (!textField66.getText().equals(""))
		{
			board.setPossibilities(66, Integer.parseInt(textField66.getText()));			
		}
		if (!textField67.getText().equals(""))
		{
			board.setPossibilities(67, Integer.parseInt(textField67.getText()));			
		}
		if (!textField68.getText().equals(""))
		{
			board.setPossibilities(68, Integer.parseInt(textField68.getText()));			
		}
		if (!textField69.getText().equals(""))
		{
			board.setPossibilities(69, Integer.parseInt(textField69.getText()));			
		}
		if (!textField70.getText().equals(""))
		{
			board.setPossibilities(70, Integer.parseInt(textField70.getText()));			
		}
		if (!textField71.getText().equals(""))
		{
			board.setPossibilities(71, Integer.parseInt(textField71.getText()));			
		}
		if (!textField72.getText().equals(""))
		{
			board.setPossibilities(72, Integer.parseInt(textField72.getText()));			
		}
		if (!textField73.getText().equals(""))
		{
			board.setPossibilities(73, Integer.parseInt(textField73.getText()));			
		}
		if (!textField74.getText().equals(""))
		{
			board.setPossibilities(74, Integer.parseInt(textField74.getText()));			
		}
		if (!textField75.getText().equals(""))
		{
			board.setPossibilities(75, Integer.parseInt(textField75.getText()));			
		}
		if (!textField76.getText().equals(""))
		{
			board.setPossibilities(76, Integer.parseInt(textField76.getText()));			
		}
		if (!textField77.getText().equals(""))
		{
			board.setPossibilities(77, Integer.parseInt(textField77.getText()));			
		}
		if (!textField78.getText().equals(""))
		{
			board.setPossibilities(78, Integer.parseInt(textField78.getText()));			
		}
		if (!textField79.getText().equals(""))
		{
			board.setPossibilities(79, Integer.parseInt(textField79.getText()));			
		}
		if (!textField80.getText().equals(""))
		{
			board.setPossibilities(80, Integer.parseInt(textField80.getText()));			
		}
		if (!textField81.getText().equals(""))
		{
			board.setPossibilities(81, Integer.parseInt(textField81.getText()));			
		}
		else
		{
			
		}
	}
	public void displayOnGUI()
	{
		for(int element:board.cellNumbers)
		{
			textFields.get(element).setText(Integer.toString(board.sudokuBoard.get(element).possibilities.get(0)));
			textFields.get(element).setBackground(Color.pink);
			textFields.get(element).setEditable(false);
		}
	}
	
	
	private class ButtonListener implements ActionListener
	{	
			/** the actionPerformed
			 * @param ActionEvent e
			 */
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if(e.getSource()==decodeButton)
			  {
				 
				  checkTextFields();
				  do{
					  control++;
					  if(control<1000)
					  {
						  board.resetLoopSupport();
						  
						  board.adjustBox1();
						  board.adjustBox2();
						  board.adjustBox3();
						  board.adjustBox4();
						  board.adjustBox5();
						  board.adjustBox6();
						  board.adjustBox7();
						  board.adjustBox8();
						  board.adjustBox9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

						  board.adjustRow1();
						  board.adjustRow2();
						  board.adjustRow3();
						  board.adjustRow4();
						  board.adjustRow5();
						  board.adjustRow6();
						  board.adjustRow7();
						  board.adjustRow8();
						  board.adjustRow9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

						  board.adjustColumn1();
						  board.adjustColumn2();
						  board.adjustColumn3();
						  board.adjustColumn4();
						  board.adjustColumn5();
						  board.adjustColumn6();
						  board.adjustColumn7();
						  board.adjustColumn8();
						  board.adjustColumn9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

						  

						  board.loopSupport();
					  }
					  if(control>=1000)
					  {
						  board.deepSearchBox1();
						  board.deepSearchBox2();
						  board.deepSearchBox3();
						  board.deepSearchBox4();
						  board.deepSearchBox5();
						  board.deepSearchBox6();
						  board.deepSearchBox7();
						  board.deepSearchBox8();
						  board.deepSearchBox9();
						  
						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();
						  
						  board.deepSearchLine1();
						  board.deepSearchLine2();
						  board.deepSearchLine3();
						  board.deepSearchLine4();
						  board.deepSearchLine5();
						  board.deepSearchLine6();	
						  board.deepSearchLine7();
						  board.deepSearchLine8();
						  board.deepSearchLine9();
						  
						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();
						  
						  board.deepSearchColumn1();
						  board.deepSearchColumn2();
						  board.deepSearchColumn3();
						  board.deepSearchColumn4();
						  board.deepSearchColumn5();
						  board.deepSearchColumn6();
						  board.deepSearchColumn7();
						  board.deepSearchColumn8();
						  board.deepSearchColumn9();
						  
						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();
						  
						  board.adjustBox1();
						  board.adjustBox2();
						  board.adjustBox3();
						  board.adjustBox4();
						  board.adjustBox5();
						  board.adjustBox6();
						  board.adjustBox7();
						  board.adjustBox8();
						  board.adjustBox9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

						  board.adjustRow1();
						  board.adjustRow2();
						  board.adjustRow3();
						  board.adjustRow4();
						  board.adjustRow5();
						  board.adjustRow6();
						  board.adjustRow7();
						  board.adjustRow8();
						  board.adjustRow9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

						  board.adjustColumn1();
						  board.adjustColumn2();
						  board.adjustColumn3();
						  board.adjustColumn4();
						  board.adjustColumn5();
						  board.adjustColumn6();
						  board.adjustColumn7();
						  board.adjustColumn8();
						  board.adjustColumn9();

						  board.displayOnGUI();
						  displayOnGUI();
						  board.cellNumbers.clear();

					  }
					  if(control>=1500)
						  break;
						  
				  }while(!(board.loopSupport()==0));
				  
				  
					/**					
					System.out.println(board.sudokuBoard.size());
					board.sudokuBoard.get(0).searchNumber(6);
					board.sudokuBoard.get(0).adjustPossibilities();
					board.sudokuBoard.get(0).searchNumber(9);
					board.sudokuBoard.get(0).adjustPossibilities();
					System.out.println(board.sudokuBoard.get(0).possibilities);
					**/
				
			  }
		  }
	}

}
