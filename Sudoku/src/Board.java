import java.util.ArrayList;


public class Board {
	
	int count;
	
	ArrayList<Integer> numbers = new ArrayList<Integer>(9);
	ArrayList<Cell> sudokuBoard = new ArrayList<Cell>(81);
	ArrayList<Integer> cellNumbers = new ArrayList<Integer>(81);
	ArrayList<Integer> column1 = new ArrayList<Integer>(9);
	ArrayList<Integer> column2 = new ArrayList<Integer>(9);
	ArrayList<Integer> column3 = new ArrayList<Integer>(9);
	ArrayList<Integer> column4 = new ArrayList<Integer>(9);
	ArrayList<Integer> column5 = new ArrayList<Integer>(9);
	ArrayList<Integer> column6 = new ArrayList<Integer>(9);
	ArrayList<Integer> column7 = new ArrayList<Integer>(9);
	ArrayList<Integer> column8 = new ArrayList<Integer>(9);
	ArrayList<Integer> column9 = new ArrayList<Integer>(9);
	ArrayList<Integer> box1 = new ArrayList<Integer>(9);
	ArrayList<Integer> box2 = new ArrayList<Integer>(9);
	ArrayList<Integer> box3 = new ArrayList<Integer>(9);
	ArrayList<Integer> box4 = new ArrayList<Integer>(9);
	ArrayList<Integer> box5 = new ArrayList<Integer>(9);
	ArrayList<Integer> box6 = new ArrayList<Integer>(9);
	ArrayList<Integer> box7 = new ArrayList<Integer>(9);
	ArrayList<Integer> box8 = new ArrayList<Integer>(9);
	ArrayList<Integer> box9 = new ArrayList<Integer>(9);
	ArrayList<Integer> line1 = new ArrayList<Integer>(9);
	ArrayList<Integer> line2 = new ArrayList<Integer>(9);
	ArrayList<Integer> line3 = new ArrayList<Integer>(9);
	ArrayList<Integer> line4 = new ArrayList<Integer>(9);
	ArrayList<Integer> line5 = new ArrayList<Integer>(9);
	ArrayList<Integer> line6 = new ArrayList<Integer>(9);
	ArrayList<Integer> line7 = new ArrayList<Integer>(9);
	ArrayList<Integer> line8 = new ArrayList<Integer>(9);
	ArrayList<Integer> line9 = new ArrayList<Integer>(9);
	
	public Board()
	{
		count=0;
		
		Cell cell1 = new Cell();
		sudokuBoard.add(cell1);
		Cell cell2 = new Cell();
		sudokuBoard.add(cell2);
		Cell cell3 = new Cell();
		sudokuBoard.add(cell3);
		Cell cell4 = new Cell();
		sudokuBoard.add(cell4);
		Cell cell5 = new Cell();
		sudokuBoard.add(cell5);
		Cell cell6 = new Cell();
		sudokuBoard.add(cell6);
		Cell cell7 = new Cell();
		sudokuBoard.add(cell7);
		Cell cell8 = new Cell();
		sudokuBoard.add(cell8);
		Cell cell9 = new Cell();
		sudokuBoard.add(cell9);
		Cell cell10 = new Cell();
		sudokuBoard.add(cell10);
		Cell cell11 = new Cell();
		sudokuBoard.add(cell11);
		Cell cell12 = new Cell();
		sudokuBoard.add(cell12);
		Cell cell13 = new Cell();
		sudokuBoard.add(cell13);
		Cell cell14 = new Cell();
		sudokuBoard.add(cell14);
		Cell cell15 = new Cell();
		sudokuBoard.add(cell15);
		Cell cell16 = new Cell();
		sudokuBoard.add(cell16);
		Cell cell17 = new Cell();
		sudokuBoard.add(cell17);
		Cell cell18 = new Cell();
		sudokuBoard.add(cell18);
		Cell cell19 = new Cell();
		sudokuBoard.add(cell19);
		Cell cell20 = new Cell();
		sudokuBoard.add(cell20);
		Cell cell21 = new Cell();
		sudokuBoard.add(cell21);
		Cell cell22 = new Cell();
		sudokuBoard.add(cell22);
		Cell cell23 = new Cell();
		sudokuBoard.add(cell23);
		Cell cell24 = new Cell();
		sudokuBoard.add(cell24);
		Cell cell25 = new Cell();
		sudokuBoard.add(cell25);
		Cell cell26 = new Cell();
		sudokuBoard.add(cell26);
		Cell cell27 = new Cell();
		sudokuBoard.add(cell27);
		Cell cell28 = new Cell();
		sudokuBoard.add(cell28);
		Cell cell29 = new Cell();
		sudokuBoard.add(cell29);
		Cell cell30 = new Cell();
		sudokuBoard.add(cell30);
		Cell cell31 = new Cell();
		sudokuBoard.add(cell31);
		Cell cell32 = new Cell();
		sudokuBoard.add(cell32);
		Cell cell33 = new Cell();
		sudokuBoard.add(cell33);
		Cell cell34 = new Cell();
		sudokuBoard.add(cell34);
		Cell cell35 = new Cell();
		sudokuBoard.add(cell35);
		Cell cell36 = new Cell();
		sudokuBoard.add(cell36);
		Cell cell37 = new Cell();
		sudokuBoard.add(cell37);
		Cell cell38 = new Cell();
		sudokuBoard.add(cell38);
		Cell cell39 = new Cell();
		sudokuBoard.add(cell39);
		Cell cell40 = new Cell();
		sudokuBoard.add(cell40);
		Cell cell41 = new Cell();
		sudokuBoard.add(cell41);
		Cell cell42 = new Cell();
		sudokuBoard.add(cell42);
		Cell cell43 = new Cell();
		sudokuBoard.add(cell43);
		Cell cell44 = new Cell();
		sudokuBoard.add(cell44);
		Cell cell45 = new Cell();
		sudokuBoard.add(cell45);
		Cell cell46 = new Cell();
		sudokuBoard.add(cell46);
		Cell cell47 = new Cell();
		sudokuBoard.add(cell47);
		Cell cell48 = new Cell();
		sudokuBoard.add(cell48);
		Cell cell49 = new Cell();
		sudokuBoard.add(cell49);
		Cell cell50 = new Cell();
		sudokuBoard.add(cell50);
		Cell cell51 = new Cell();
		sudokuBoard.add(cell51);
		Cell cell52 = new Cell();
		sudokuBoard.add(cell52);
		Cell cell53 = new Cell();
		sudokuBoard.add(cell53);
		Cell cell54 = new Cell();
		sudokuBoard.add(cell54);
		Cell cell55 = new Cell();
		sudokuBoard.add(cell55);
		Cell cell56 = new Cell();
		sudokuBoard.add(cell56);
		Cell cell57 = new Cell();
		sudokuBoard.add(cell57);
		Cell cell58 = new Cell();
		sudokuBoard.add(cell58);
		Cell cell59 = new Cell();
		sudokuBoard.add(cell59);
		Cell cell60 = new Cell();
		sudokuBoard.add(cell60);
		Cell cell61 = new Cell();
		sudokuBoard.add(cell61);
		Cell cell62 = new Cell();
		sudokuBoard.add(cell62);
		Cell cell63 = new Cell();
		sudokuBoard.add(cell63);
		Cell cell64 = new Cell();
		sudokuBoard.add(cell64);
		Cell cell65 = new Cell();
		sudokuBoard.add(cell65);
		Cell cell66 = new Cell();
		sudokuBoard.add(cell66);
		Cell cell67 = new Cell();
		sudokuBoard.add(cell67);
		Cell cell68 = new Cell();
		sudokuBoard.add(cell68);
		Cell cell69 = new Cell();
		sudokuBoard.add(cell69);
		Cell cell70 = new Cell();
		sudokuBoard.add(cell70);
		Cell cell71 = new Cell();
		sudokuBoard.add(cell71);
		Cell cell72 = new Cell();
		sudokuBoard.add(cell72);
		Cell cell73 = new Cell();
		sudokuBoard.add(cell73);
		Cell cell74 = new Cell();
		sudokuBoard.add(cell74);
		Cell cell75 = new Cell();
		sudokuBoard.add(cell75);
		Cell cell76 = new Cell();
		sudokuBoard.add(cell76);
		Cell cell77 = new Cell();
		sudokuBoard.add(cell77);
		Cell cell78 = new Cell();
		sudokuBoard.add(cell78);
		Cell cell79 = new Cell();
		sudokuBoard.add(cell79);
		Cell cell80 = new Cell();
		sudokuBoard.add(cell80);
		Cell cell81 = new Cell();
		sudokuBoard.add(cell81);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		
		column1.add(0);
		column1.add(9);
		column1.add(18);
		column1.add(27);
		column1.add(36);
		column1.add(45);
		column1.add(54);
		column1.add(63);
		column1.add(72);
		
		column2.add(1);
		column2.add(10);
		column2.add(19);
		column2.add(28);
		column2.add(37);
		column2.add(46);
		column2.add(55);
		column2.add(64);
		column2.add(73);
		
		column3.add(2);
		column3.add(11);
		column3.add(20);
		column3.add(29);
		column3.add(38);
		column3.add(47);
		column3.add(56);
		column3.add(65);
		column3.add(74);
		
		column4.add(3);
		column4.add(12);
		column4.add(21);
		column4.add(30);
		column4.add(39);
		column4.add(48);
		column4.add(57);
		column4.add(66);
		column4.add(75);
		
		column5.add(4);
		column5.add(13);
		column5.add(22);
		column5.add(31);
		column5.add(40);
		column5.add(49);
		column5.add(58);
		column5.add(67);
		column5.add(76);
		
		column6.add(5);
		column6.add(14);
		column6.add(23);
		column6.add(32);
		column6.add(41);
		column6.add(50);
		column6.add(59);
		column6.add(68);
		column6.add(77);
		
		column7.add(6);
		column7.add(15);
		column7.add(24);
		column7.add(33);
		column7.add(42);
		column7.add(51);
		column7.add(60);
		column7.add(69);
		column7.add(78);
		
		column8.add(7);
		column8.add(16);
		column8.add(25);
		column8.add(34);
		column8.add(43);
		column8.add(52);
		column8.add(61);
		column8.add(70);
		column8.add(79);
		
		column9.add(8);
		column9.add(17);
		column9.add(26);
		column9.add(35);
		column9.add(44);
		column9.add(53);
		column9.add(62);
		column9.add(71);
		column9.add(80);
		
		box1.add(0);
		box1.add(1);
		box1.add(2);
		box1.add(9);
		box1.add(10);
		box1.add(11);
		box1.add(18);
		box1.add(19);
		box1.add(20);
		
		box2.add(3);
		box2.add(4);
		box2.add(5);
		box2.add(12);
		box2.add(13);
		box2.add(14);
		box2.add(21);
		box2.add(22);
		box2.add(23);
		
		box3.add(6);
		box3.add(7);
		box3.add(8);
		box3.add(15);
		box3.add(16);
		box3.add(17);
		box3.add(24);
		box3.add(25);
		box3.add(26);
		
		box4.add(27);
		box4.add(28);
		box4.add(29);
		box4.add(36);
		box4.add(37);
		box4.add(38);
		box4.add(45);
		box4.add(46);
		box4.add(47);
		
		box5.add(30);
		box5.add(31);
		box5.add(32);
		box5.add(39);
		box5.add(40);
		box5.add(41);
		box5.add(48);
		box5.add(49);
		box5.add(50);
		
		box6.add(33);
		box6.add(34);
		box6.add(35);
		box6.add(42);
		box6.add(43);
		box6.add(44);
		box6.add(51);
		box6.add(52);
		box6.add(53);
		
		box7.add(54);
		box7.add(55);
		box7.add(56);
		box7.add(63);
		box7.add(64);
		box7.add(65);
		box7.add(72);
		box7.add(73);
		box7.add(74);
		
		box8.add(57);
		box8.add(58);
		box8.add(59);
		box8.add(66);
		box8.add(67);
		box8.add(68);
		box8.add(75);
		box8.add(76);
		box8.add(77);
		
		box9.add(60);
		box9.add(61);
		box9.add(62);
		box9.add(69);
		box9.add(70);
		box9.add(71);
		box9.add(78);
		box9.add(79);
		box9.add(80);
		
		line1.add(0);
		line1.add(1);
		line1.add(2);
		line1.add(3);
		line1.add(4);
		line1.add(5);
		line1.add(6);
		line1.add(7);
		line1.add(8);
		
		line2.add(9);
		line2.add(10);
		line2.add(11);
		line2.add(12);
		line2.add(13);
		line2.add(14);
		line2.add(15);
		line2.add(16);
		line2.add(17);
		
		line3.add(18);
		line3.add(19);
		line3.add(20);
		line3.add(21);
		line3.add(22);
		line3.add(23);
		line3.add(24);
		line3.add(25);
		line3.add(26);
		
		line4.add(27);
		line4.add(28);
		line4.add(29);
		line4.add(30);
		line4.add(31);
		line4.add(32);
		line4.add(33);
		line4.add(34);
		line4.add(35);
		
		line5.add(36);
		line5.add(37);
		line5.add(38);
		line5.add(39);
		line5.add(40);
		line5.add(41);
		line5.add(42);
		line5.add(43);
		line5.add(44);
		
		line6.add(45);
		line6.add(46);
		line6.add(47);
		line6.add(48);
		line6.add(49);
		line6.add(50);
		line6.add(51);
		line6.add(52);
		line6.add(53);
		
		line7.add(54);
		line7.add(55);
		line7.add(56);
		line7.add(57);
		line7.add(58);
		line7.add(59);
		line7.add(60);
		line7.add(61);
		line7.add(62);
		
		line8.add(63);
		line8.add(64);
		line8.add(65);
		line8.add(66);
		line8.add(67);
		line8.add(68);
		line8.add(69);
		line8.add(70);
		line8.add(71);
		
		line9.add(72);
		line9.add(73);
		line9.add(74);
		line9.add(75);
		line9.add(76);
		line9.add(77);
		line9.add(78);
		line9.add(79);
		line9.add(80);
	}
	public void setPossibilities(int i, int v)
	{
		//i is the index
		//v the value
		sudokuBoard.get(i-1).possibilities.clear();
		sudokuBoard.get(i-1).possibilities.add(v);
	}
	public void adjustRow1()
	{
		for (int i=0; i<9; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(0).possibilities.size()==1))
				{
					sudokuBoard.get(0).searchNumber(z);
					sudokuBoard.get(0).adjustPossibilities();
				}
				if(!(sudokuBoard.get(1).possibilities.size()==1))
				{
					sudokuBoard.get(1).searchNumber(z);
					sudokuBoard.get(1).adjustPossibilities();
				}
				if(!(sudokuBoard.get(2).possibilities.size()==1))
				{
					sudokuBoard.get(2).searchNumber(z);
					sudokuBoard.get(2).adjustPossibilities();
				}
				if(!(sudokuBoard.get(3).possibilities.size()==1))
				{
					sudokuBoard.get(3).searchNumber(z);
					sudokuBoard.get(3).adjustPossibilities();
				}
				if(!(sudokuBoard.get(4).possibilities.size()==1))
				{
					sudokuBoard.get(4).searchNumber(z);
					sudokuBoard.get(4).adjustPossibilities();
				}
				if(!(sudokuBoard.get(5).possibilities.size()==1))
				{
					sudokuBoard.get(5).searchNumber(z);
					sudokuBoard.get(5).adjustPossibilities();
				}
				if(!(sudokuBoard.get(6).possibilities.size()==1))
				{
					sudokuBoard.get(6).searchNumber(z);
					sudokuBoard.get(6).adjustPossibilities();
				}
				if(!(sudokuBoard.get(7).possibilities.size()==1))
				{
					sudokuBoard.get(7).searchNumber(z);
					sudokuBoard.get(7).adjustPossibilities();
				}
				if(!(sudokuBoard.get(8).possibilities.size()==1))
				{
					sudokuBoard.get(8).searchNumber(z);
					sudokuBoard.get(8).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow2()
	{
		for (int i=9; i<18; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(9).possibilities.size()==1))
				{
					sudokuBoard.get(9).searchNumber(z);
					sudokuBoard.get(9).adjustPossibilities();
				}
				if(!(sudokuBoard.get(10).possibilities.size()==1))
				{
					sudokuBoard.get(10).searchNumber(z);
					sudokuBoard.get(10).adjustPossibilities();
				}
				if(!(sudokuBoard.get(11).possibilities.size()==1))
				{
					sudokuBoard.get(11).searchNumber(z);
					sudokuBoard.get(11).adjustPossibilities();
				}
				if(!(sudokuBoard.get(12).possibilities.size()==1))
				{
					sudokuBoard.get(12).searchNumber(z);
					sudokuBoard.get(12).adjustPossibilities();
				}
				if(!(sudokuBoard.get(13).possibilities.size()==1))
				{
					sudokuBoard.get(13).searchNumber(z);
					sudokuBoard.get(13).adjustPossibilities();
				}
				if(!(sudokuBoard.get(14).possibilities.size()==1))
				{
					sudokuBoard.get(14).searchNumber(z);
					sudokuBoard.get(14).adjustPossibilities();
				}
				if(!(sudokuBoard.get(15).possibilities.size()==1))
				{
					sudokuBoard.get(15).searchNumber(z);
					sudokuBoard.get(15).adjustPossibilities();
				}
				if(!(sudokuBoard.get(16).possibilities.size()==1))
				{
					sudokuBoard.get(16).searchNumber(z);
					sudokuBoard.get(16).adjustPossibilities();
				}
				if(!(sudokuBoard.get(17).possibilities.size()==1))
				{
					sudokuBoard.get(17).searchNumber(z);
					sudokuBoard.get(17).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow3()
	{
		for (int i=18; i<27; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(18).possibilities.size()==1))
				{
					sudokuBoard.get(18).searchNumber(z);
					sudokuBoard.get(18).adjustPossibilities();
				}
				if(!(sudokuBoard.get(19).possibilities.size()==1))
				{
					sudokuBoard.get(19).searchNumber(z);
					sudokuBoard.get(19).adjustPossibilities();
				}
				if(!(sudokuBoard.get(20).possibilities.size()==1))
				{
					sudokuBoard.get(20).searchNumber(z);
					sudokuBoard.get(20).adjustPossibilities();
				}
				if(!(sudokuBoard.get(21).possibilities.size()==1))
				{
					sudokuBoard.get(21).searchNumber(z);
					sudokuBoard.get(21).adjustPossibilities();
				}
				if(!(sudokuBoard.get(22).possibilities.size()==1))
				{
					sudokuBoard.get(22).searchNumber(z);
					sudokuBoard.get(22).adjustPossibilities();
				}
				if(!(sudokuBoard.get(23).possibilities.size()==1))
				{
					sudokuBoard.get(23).searchNumber(z);
					sudokuBoard.get(23).adjustPossibilities();
				}
				if(!(sudokuBoard.get(24).possibilities.size()==1))
				{
					sudokuBoard.get(24).searchNumber(z);
					sudokuBoard.get(24).adjustPossibilities();
				}
				if(!(sudokuBoard.get(25).possibilities.size()==1))
				{
					sudokuBoard.get(25).searchNumber(z);
					sudokuBoard.get(25).adjustPossibilities();
				}
				if(!(sudokuBoard.get(26).possibilities.size()==1))
				{
					sudokuBoard.get(26).searchNumber(z);
					sudokuBoard.get(26).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow4()
	{
		for (int i=27; i<36; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(27).possibilities.size()==1))
				{
					sudokuBoard.get(27).searchNumber(z);
					sudokuBoard.get(27).adjustPossibilities();
				}
				if(!(sudokuBoard.get(28).possibilities.size()==1))
				{
					sudokuBoard.get(28).searchNumber(z);
					sudokuBoard.get(28).adjustPossibilities();
				}
				if(!(sudokuBoard.get(29).possibilities.size()==1))
				{
					sudokuBoard.get(29).searchNumber(z);
					sudokuBoard.get(29).adjustPossibilities();
				}
				if(!(sudokuBoard.get(30).possibilities.size()==1))
				{
					sudokuBoard.get(30).searchNumber(z);
					sudokuBoard.get(30).adjustPossibilities();
				}
				if(!(sudokuBoard.get(31).possibilities.size()==1))
				{
					sudokuBoard.get(31).searchNumber(z);
					sudokuBoard.get(31).adjustPossibilities();
				}
				if(!(sudokuBoard.get(32).possibilities.size()==1))
				{
					sudokuBoard.get(32).searchNumber(z);
					sudokuBoard.get(32).adjustPossibilities();
				}
				if(!(sudokuBoard.get(33).possibilities.size()==1))
				{
					sudokuBoard.get(33).searchNumber(z);
					sudokuBoard.get(33).adjustPossibilities();
				}
				if(!(sudokuBoard.get(34).possibilities.size()==1))
				{
					sudokuBoard.get(34).searchNumber(z);
					sudokuBoard.get(34).adjustPossibilities();
				}
				if(!(sudokuBoard.get(35).possibilities.size()==1))
				{
					sudokuBoard.get(35).searchNumber(z);
					sudokuBoard.get(35).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow5()
	{
		for (int i=36; i<45; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(36).possibilities.size()==1))
				{
					sudokuBoard.get(36).searchNumber(z);
					sudokuBoard.get(36).adjustPossibilities();
				}
				if(!(sudokuBoard.get(37).possibilities.size()==1))
				{
					sudokuBoard.get(37).searchNumber(z);
					sudokuBoard.get(37).adjustPossibilities();
				}
				if(!(sudokuBoard.get(38).possibilities.size()==1))
				{
					sudokuBoard.get(38).searchNumber(z);
					sudokuBoard.get(38).adjustPossibilities();
				}
				if(!(sudokuBoard.get(39).possibilities.size()==1))
				{
					sudokuBoard.get(39).searchNumber(z);
					sudokuBoard.get(39).adjustPossibilities();
				}
				if(!(sudokuBoard.get(40).possibilities.size()==1))
				{
					sudokuBoard.get(40).searchNumber(z);
					sudokuBoard.get(40).adjustPossibilities();
				}
				if(!(sudokuBoard.get(41).possibilities.size()==1))
				{
					sudokuBoard.get(41).searchNumber(z);
					sudokuBoard.get(41).adjustPossibilities();
				}
				if(!(sudokuBoard.get(42).possibilities.size()==1))
				{
					sudokuBoard.get(42).searchNumber(z);
					sudokuBoard.get(42).adjustPossibilities();
				}
				if(!(sudokuBoard.get(43).possibilities.size()==1))
				{
					sudokuBoard.get(43).searchNumber(z);
					sudokuBoard.get(43).adjustPossibilities();
				}
				if(!(sudokuBoard.get(44).possibilities.size()==1))
				{
					sudokuBoard.get(44).searchNumber(z);
					sudokuBoard.get(44).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow6()
	{
		for (int i=45; i<54; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(45).possibilities.size()==1))
				{
					sudokuBoard.get(45).searchNumber(z);
					sudokuBoard.get(45).adjustPossibilities();
				}
				if(!(sudokuBoard.get(46).possibilities.size()==1))
				{
					sudokuBoard.get(46).searchNumber(z);
					sudokuBoard.get(46).adjustPossibilities();
				}
				if(!(sudokuBoard.get(47).possibilities.size()==1))
				{
					sudokuBoard.get(47).searchNumber(z);
					sudokuBoard.get(47).adjustPossibilities();
				}
				if(!(sudokuBoard.get(48).possibilities.size()==1))
				{
					sudokuBoard.get(48).searchNumber(z);
					sudokuBoard.get(48).adjustPossibilities();
				}
				if(!(sudokuBoard.get(49).possibilities.size()==1))
				{
					sudokuBoard.get(49).searchNumber(z);
					sudokuBoard.get(49).adjustPossibilities();
				}
				if(!(sudokuBoard.get(50).possibilities.size()==1))
				{
					sudokuBoard.get(50).searchNumber(z);
					sudokuBoard.get(50).adjustPossibilities();
				}
				if(!(sudokuBoard.get(51).possibilities.size()==1))
				{
					sudokuBoard.get(51).searchNumber(z);
					sudokuBoard.get(51).adjustPossibilities();
				}
				if(!(sudokuBoard.get(52).possibilities.size()==1))
				{
					sudokuBoard.get(52).searchNumber(z);
					sudokuBoard.get(52).adjustPossibilities();
				}
				if(!(sudokuBoard.get(53).possibilities.size()==1))
				{
					sudokuBoard.get(53).searchNumber(z);
					sudokuBoard.get(53).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow7()
	{
		for (int i=54; i<63; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(54).possibilities.size()==1))
				{
					sudokuBoard.get(54).searchNumber(z);
					sudokuBoard.get(54).adjustPossibilities();
				}
				if(!(sudokuBoard.get(55).possibilities.size()==1))
				{
					sudokuBoard.get(55).searchNumber(z);
					sudokuBoard.get(55).adjustPossibilities();
				}
				if(!(sudokuBoard.get(56).possibilities.size()==1))
				{
					sudokuBoard.get(56).searchNumber(z);
					sudokuBoard.get(56).adjustPossibilities();
				}
				if(!(sudokuBoard.get(57).possibilities.size()==1))
				{
					sudokuBoard.get(57).searchNumber(z);
					sudokuBoard.get(57).adjustPossibilities();
				}
				if(!(sudokuBoard.get(58).possibilities.size()==1))
				{
					sudokuBoard.get(58).searchNumber(z);
					sudokuBoard.get(58).adjustPossibilities();
				}
				if(!(sudokuBoard.get(59).possibilities.size()==1))
				{
					sudokuBoard.get(59).searchNumber(z);
					sudokuBoard.get(59).adjustPossibilities();
				}
				if(!(sudokuBoard.get(60).possibilities.size()==1))
				{
					sudokuBoard.get(60).searchNumber(z);
					sudokuBoard.get(60).adjustPossibilities();
				}
				if(!(sudokuBoard.get(61).possibilities.size()==1))
				{
					sudokuBoard.get(61).searchNumber(z);
					sudokuBoard.get(61).adjustPossibilities();
				}
				if(!(sudokuBoard.get(62).possibilities.size()==1))
				{
					sudokuBoard.get(62).searchNumber(z);
					sudokuBoard.get(62).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow8()
	{
		for (int i=63; i<72; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(63).possibilities.size()==1))
				{
					sudokuBoard.get(63).searchNumber(z);
					sudokuBoard.get(63).adjustPossibilities();
				}
				if(!(sudokuBoard.get(64).possibilities.size()==1))
				{
					sudokuBoard.get(64).searchNumber(z);
					sudokuBoard.get(64).adjustPossibilities();
				}
				if(!(sudokuBoard.get(65).possibilities.size()==1))
				{
					sudokuBoard.get(65).searchNumber(z);
					sudokuBoard.get(65).adjustPossibilities();
				}
				if(!(sudokuBoard.get(66).possibilities.size()==1))
				{
					sudokuBoard.get(66).searchNumber(z);
					sudokuBoard.get(66).adjustPossibilities();
				}
				if(!(sudokuBoard.get(67).possibilities.size()==1))
				{
					sudokuBoard.get(67).searchNumber(z);
					sudokuBoard.get(67).adjustPossibilities();
				}
				if(!(sudokuBoard.get(68).possibilities.size()==1))
				{
					sudokuBoard.get(68).searchNumber(z);
					sudokuBoard.get(68).adjustPossibilities();
				}
				if(!(sudokuBoard.get(69).possibilities.size()==1))
				{
					sudokuBoard.get(69).searchNumber(z);
					sudokuBoard.get(69).adjustPossibilities();
				}
				if(!(sudokuBoard.get(70).possibilities.size()==1))
				{
					sudokuBoard.get(70).searchNumber(z);
					sudokuBoard.get(70).adjustPossibilities();
				}
				if(!(sudokuBoard.get(71).possibilities.size()==1))
				{
					sudokuBoard.get(71).searchNumber(z);
					sudokuBoard.get(71).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustRow9()
	{
		for (int i=72; i<81; i++)
		{
			if (sudokuBoard.get(i).possibilities.size()==1)
			{
				int z= sudokuBoard.get(i).possibilities.get(0);
				if(!(sudokuBoard.get(72).possibilities.size()==1))
				{
					sudokuBoard.get(72).searchNumber(z);
					sudokuBoard.get(72).adjustPossibilities();
				}
				if(!(sudokuBoard.get(73).possibilities.size()==1))
				{
					sudokuBoard.get(73).searchNumber(z);
					sudokuBoard.get(73).adjustPossibilities();
				}
				if(!(sudokuBoard.get(74).possibilities.size()==1))
				{
					sudokuBoard.get(74).searchNumber(z);
					sudokuBoard.get(74).adjustPossibilities();
				}
				if(!(sudokuBoard.get(75).possibilities.size()==1))
				{
					sudokuBoard.get(75).searchNumber(z);
					sudokuBoard.get(75).adjustPossibilities();
				}
				if(!(sudokuBoard.get(76).possibilities.size()==1))
				{
					sudokuBoard.get(76).searchNumber(z);
					sudokuBoard.get(76).adjustPossibilities();
				}
				if(!(sudokuBoard.get(77).possibilities.size()==1))
				{
					sudokuBoard.get(77).searchNumber(z);
					sudokuBoard.get(77).adjustPossibilities();
				}
				if(!(sudokuBoard.get(78).possibilities.size()==1))
				{
					sudokuBoard.get(78).searchNumber(z);
					sudokuBoard.get(78).adjustPossibilities();
				}
				if(!(sudokuBoard.get(79).possibilities.size()==1))
				{
					sudokuBoard.get(79).searchNumber(z);
					sudokuBoard.get(79).adjustPossibilities();
				}
				if(!(sudokuBoard.get(80).possibilities.size()==1))
				{
					sudokuBoard.get(80).searchNumber(z);
					sudokuBoard.get(80).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn1()
	{
		for (int element:column1)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(0).possibilities.size()==1))
				{
					sudokuBoard.get(0).searchNumber(z);
					sudokuBoard.get(0).adjustPossibilities();
				}
				if(!(sudokuBoard.get(9).possibilities.size()==1))
				{
					sudokuBoard.get(9).searchNumber(z);
					sudokuBoard.get(9).adjustPossibilities();
				}
				if(!(sudokuBoard.get(18).possibilities.size()==1))
				{
					sudokuBoard.get(18).searchNumber(z);
					sudokuBoard.get(18).adjustPossibilities();
				}
				if(!(sudokuBoard.get(27).possibilities.size()==1))
				{
					sudokuBoard.get(27).searchNumber(z);
					sudokuBoard.get(27).adjustPossibilities();
				}
				if(!(sudokuBoard.get(36).possibilities.size()==1))
				{
					sudokuBoard.get(36).searchNumber(z);
					sudokuBoard.get(36).adjustPossibilities();
				}
				if(!(sudokuBoard.get(45).possibilities.size()==1))
				{
					sudokuBoard.get(45).searchNumber(z);
					sudokuBoard.get(45).adjustPossibilities();
				}
				if(!(sudokuBoard.get(54).possibilities.size()==1))
				{
					sudokuBoard.get(54).searchNumber(z);
					sudokuBoard.get(54).adjustPossibilities();
				}
				if(!(sudokuBoard.get(63).possibilities.size()==1))
				{
					sudokuBoard.get(63).searchNumber(z);
					sudokuBoard.get(63).adjustPossibilities();
				}
				if(!(sudokuBoard.get(72).possibilities.size()==1))
				{
					sudokuBoard.get(72).searchNumber(z);
					sudokuBoard.get(72).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn2()
	{
		for (int element:column2)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(1).possibilities.size()==1))
				{
					sudokuBoard.get(1).searchNumber(z);
					sudokuBoard.get(1).adjustPossibilities();
				}
				if(!(sudokuBoard.get(10).possibilities.size()==1))
				{
					sudokuBoard.get(10).searchNumber(z);
					sudokuBoard.get(10).adjustPossibilities();
				}
				if(!(sudokuBoard.get(19).possibilities.size()==1))
				{
					sudokuBoard.get(19).searchNumber(z);
					sudokuBoard.get(19).adjustPossibilities();
				}
				if(!(sudokuBoard.get(28).possibilities.size()==1))
				{
					sudokuBoard.get(28).searchNumber(z);
					sudokuBoard.get(28).adjustPossibilities();
				}
				if(!(sudokuBoard.get(37).possibilities.size()==1))
				{
					sudokuBoard.get(37).searchNumber(z);
					sudokuBoard.get(37).adjustPossibilities();
				}
				if(!(sudokuBoard.get(46).possibilities.size()==1))
				{
					sudokuBoard.get(46).searchNumber(z);
					sudokuBoard.get(46).adjustPossibilities();
				}
				if(!(sudokuBoard.get(55).possibilities.size()==1))
				{
					sudokuBoard.get(55).searchNumber(z);
					sudokuBoard.get(55).adjustPossibilities();
				}
				if(!(sudokuBoard.get(64).possibilities.size()==1))
				{
					sudokuBoard.get(64).searchNumber(z);
					sudokuBoard.get(64).adjustPossibilities();
				}
				if(!(sudokuBoard.get(73).possibilities.size()==1))
				{
					sudokuBoard.get(73).searchNumber(z);
					sudokuBoard.get(73).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn3()
	{
		for (int element:column3)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(2).possibilities.size()==1))
				{
					sudokuBoard.get(2).searchNumber(z);
					sudokuBoard.get(2).adjustPossibilities();
				}
				if(!(sudokuBoard.get(11).possibilities.size()==1))
				{
					sudokuBoard.get(11).searchNumber(z);
					sudokuBoard.get(11).adjustPossibilities();
				}
				if(!(sudokuBoard.get(20).possibilities.size()==1))
				{
					sudokuBoard.get(20).searchNumber(z);
					sudokuBoard.get(20).adjustPossibilities();
				}
				if(!(sudokuBoard.get(29).possibilities.size()==1))
				{
					sudokuBoard.get(29).searchNumber(z);
					sudokuBoard.get(29).adjustPossibilities();
				}
				if(!(sudokuBoard.get(38).possibilities.size()==1))
				{
					sudokuBoard.get(38).searchNumber(z);
					sudokuBoard.get(38).adjustPossibilities();
				}
				if(!(sudokuBoard.get(47).possibilities.size()==1))
				{
					sudokuBoard.get(47).searchNumber(z);
					sudokuBoard.get(47).adjustPossibilities();
				}
				if(!(sudokuBoard.get(56).possibilities.size()==1))
				{
					sudokuBoard.get(56).searchNumber(z);
					sudokuBoard.get(56).adjustPossibilities();
				}
				if(!(sudokuBoard.get(65).possibilities.size()==1))
				{
					sudokuBoard.get(65).searchNumber(z);
					sudokuBoard.get(65).adjustPossibilities();
				}
				if(!(sudokuBoard.get(74).possibilities.size()==1))
				{
					sudokuBoard.get(74).searchNumber(z);
					sudokuBoard.get(74).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn4()
	{
		for (int element:column4)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(3).possibilities.size()==1))
				{
					sudokuBoard.get(3).searchNumber(z);
					sudokuBoard.get(3).adjustPossibilities();
				}
				if(!(sudokuBoard.get(12).possibilities.size()==1))
				{
					sudokuBoard.get(12).searchNumber(z);
					sudokuBoard.get(12).adjustPossibilities();
				}
				if(!(sudokuBoard.get(21).possibilities.size()==1))
				{
					sudokuBoard.get(21).searchNumber(z);
					sudokuBoard.get(21).adjustPossibilities();
				}
				if(!(sudokuBoard.get(30).possibilities.size()==1))
				{
					sudokuBoard.get(30).searchNumber(z);
					sudokuBoard.get(30).adjustPossibilities();
				}
				if(!(sudokuBoard.get(39).possibilities.size()==1))
				{
					sudokuBoard.get(39).searchNumber(z);
					sudokuBoard.get(39).adjustPossibilities();
				}
				if(!(sudokuBoard.get(48).possibilities.size()==1))
				{
					sudokuBoard.get(48).searchNumber(z);
					sudokuBoard.get(48).adjustPossibilities();
				}
				if(!(sudokuBoard.get(57).possibilities.size()==1))
				{
					sudokuBoard.get(57).searchNumber(z);
					sudokuBoard.get(57).adjustPossibilities();
				}
				if(!(sudokuBoard.get(66).possibilities.size()==1))
				{
					sudokuBoard.get(66).searchNumber(z);
					sudokuBoard.get(66).adjustPossibilities();
				}
				if(!(sudokuBoard.get(75).possibilities.size()==1))
				{
					sudokuBoard.get(75).searchNumber(z);
					sudokuBoard.get(75).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn5()
	{
		for (int element:column5)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(4).possibilities.size()==1))
				{
					sudokuBoard.get(4).searchNumber(z);
					sudokuBoard.get(4).adjustPossibilities();
				}
				if(!(sudokuBoard.get(13).possibilities.size()==1))
				{
					sudokuBoard.get(13).searchNumber(z);
					sudokuBoard.get(13).adjustPossibilities();
				}
				if(!(sudokuBoard.get(22).possibilities.size()==1))
				{
					sudokuBoard.get(22).searchNumber(z);
					sudokuBoard.get(22).adjustPossibilities();
				}
				if(!(sudokuBoard.get(31).possibilities.size()==1))
				{
					sudokuBoard.get(31).searchNumber(z);
					sudokuBoard.get(31).adjustPossibilities();
				}
				if(!(sudokuBoard.get(40).possibilities.size()==1))
				{
					sudokuBoard.get(40).searchNumber(z);
					sudokuBoard.get(40).adjustPossibilities();
				}
				if(!(sudokuBoard.get(49).possibilities.size()==1))
				{
					sudokuBoard.get(49).searchNumber(z);
					sudokuBoard.get(49).adjustPossibilities();
				}
				if(!(sudokuBoard.get(58).possibilities.size()==1))
				{
					sudokuBoard.get(58).searchNumber(z);
					sudokuBoard.get(58).adjustPossibilities();
				}
				if(!(sudokuBoard.get(67).possibilities.size()==1))
				{
					sudokuBoard.get(67).searchNumber(z);
					sudokuBoard.get(67).adjustPossibilities();
				}
				if(!(sudokuBoard.get(76).possibilities.size()==1))
				{
					sudokuBoard.get(76).searchNumber(z);
					sudokuBoard.get(76).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn6()
	{
		for (int element:column6)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(5).possibilities.size()==1))
				{
					sudokuBoard.get(5).searchNumber(z);
					sudokuBoard.get(5).adjustPossibilities();
				}
				if(!(sudokuBoard.get(14).possibilities.size()==1))
				{
					sudokuBoard.get(14).searchNumber(z);
					sudokuBoard.get(14).adjustPossibilities();
				}
				if(!(sudokuBoard.get(23).possibilities.size()==1))
				{
					sudokuBoard.get(23).searchNumber(z);
					sudokuBoard.get(23).adjustPossibilities();
				}
				if(!(sudokuBoard.get(32).possibilities.size()==1))
				{
					sudokuBoard.get(32).searchNumber(z);
					sudokuBoard.get(32).adjustPossibilities();
				}
				if(!(sudokuBoard.get(41).possibilities.size()==1))
				{
					sudokuBoard.get(41).searchNumber(z);
					sudokuBoard.get(41).adjustPossibilities();
				}
				if(!(sudokuBoard.get(50).possibilities.size()==1))
				{
					sudokuBoard.get(50).searchNumber(z);
					sudokuBoard.get(50).adjustPossibilities();
				}
				if(!(sudokuBoard.get(59).possibilities.size()==1))
				{
					sudokuBoard.get(59).searchNumber(z);
					sudokuBoard.get(59).adjustPossibilities();
				}
				if(!(sudokuBoard.get(68).possibilities.size()==1))
				{
					sudokuBoard.get(68).searchNumber(z);
					sudokuBoard.get(68).adjustPossibilities();
				}
				if(!(sudokuBoard.get(77).possibilities.size()==1))
				{
					sudokuBoard.get(77).searchNumber(z);
					sudokuBoard.get(77).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn7()
	{
		for (int element:column7)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(6).possibilities.size()==1))
				{
					sudokuBoard.get(6).searchNumber(z);
					sudokuBoard.get(6).adjustPossibilities();
				}
				if(!(sudokuBoard.get(15).possibilities.size()==1))
				{
					sudokuBoard.get(15).searchNumber(z);
					sudokuBoard.get(15).adjustPossibilities();
				}
				if(!(sudokuBoard.get(24).possibilities.size()==1))
				{
					sudokuBoard.get(24).searchNumber(z);
					sudokuBoard.get(24).adjustPossibilities();
				}
				if(!(sudokuBoard.get(33).possibilities.size()==1))
				{
					sudokuBoard.get(33).searchNumber(z);
					sudokuBoard.get(33).adjustPossibilities();
				}
				if(!(sudokuBoard.get(42).possibilities.size()==1))
				{
					sudokuBoard.get(42).searchNumber(z);
					sudokuBoard.get(42).adjustPossibilities();
				}
				if(!(sudokuBoard.get(51).possibilities.size()==1))
				{
					sudokuBoard.get(51).searchNumber(z);
					sudokuBoard.get(51).adjustPossibilities();
				}
				if(!(sudokuBoard.get(60).possibilities.size()==1))
				{
					sudokuBoard.get(60).searchNumber(z);
					sudokuBoard.get(60).adjustPossibilities();
				}
				if(!(sudokuBoard.get(69).possibilities.size()==1))
				{
					sudokuBoard.get(69).searchNumber(z);
					sudokuBoard.get(69).adjustPossibilities();
				}
				if(!(sudokuBoard.get(78).possibilities.size()==1))
				{
					sudokuBoard.get(78).searchNumber(z);
					sudokuBoard.get(78).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn8()
	{
		for (int element:column8)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(7).possibilities.size()==1))
				{
					sudokuBoard.get(7).searchNumber(z);
					sudokuBoard.get(7).adjustPossibilities();
				}
				if(!(sudokuBoard.get(16).possibilities.size()==1))
				{
					sudokuBoard.get(16).searchNumber(z);
					sudokuBoard.get(16).adjustPossibilities();
				}
				if(!(sudokuBoard.get(25).possibilities.size()==1))
				{
					sudokuBoard.get(25).searchNumber(z);
					sudokuBoard.get(25).adjustPossibilities();
				}
				if(!(sudokuBoard.get(34).possibilities.size()==1))
				{
					sudokuBoard.get(34).searchNumber(z);
					sudokuBoard.get(34).adjustPossibilities();
				}
				if(!(sudokuBoard.get(43).possibilities.size()==1))
				{
					sudokuBoard.get(43).searchNumber(z);
					sudokuBoard.get(43).adjustPossibilities();
				}
				if(!(sudokuBoard.get(52).possibilities.size()==1))
				{
					sudokuBoard.get(52).searchNumber(z);
					sudokuBoard.get(52).adjustPossibilities();
				}
				if(!(sudokuBoard.get(61).possibilities.size()==1))
				{
					sudokuBoard.get(61).searchNumber(z);
					sudokuBoard.get(61).adjustPossibilities();
				}
				if(!(sudokuBoard.get(70).possibilities.size()==1))
				{
					sudokuBoard.get(70).searchNumber(z);
					sudokuBoard.get(70).adjustPossibilities();
				}
				if(!(sudokuBoard.get(79).possibilities.size()==1))
				{
					sudokuBoard.get(79).searchNumber(z);
					sudokuBoard.get(79).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustColumn9()
	{
		for (int element:column9)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(8).possibilities.size()==1))
				{
					sudokuBoard.get(8).searchNumber(z);
					sudokuBoard.get(8).adjustPossibilities();
				}
				if(!(sudokuBoard.get(17).possibilities.size()==1))
				{
					sudokuBoard.get(17).searchNumber(z);
					sudokuBoard.get(17).adjustPossibilities();
				}
				if(!(sudokuBoard.get(26).possibilities.size()==1))
				{
					sudokuBoard.get(26).searchNumber(z);
					sudokuBoard.get(26).adjustPossibilities();
				}
				if(!(sudokuBoard.get(35).possibilities.size()==1))
				{
					sudokuBoard.get(35).searchNumber(z);
					sudokuBoard.get(35).adjustPossibilities();
				}
				if(!(sudokuBoard.get(44).possibilities.size()==1))
				{
					sudokuBoard.get(44).searchNumber(z);
					sudokuBoard.get(44).adjustPossibilities();
				}
				if(!(sudokuBoard.get(53).possibilities.size()==1))
				{
					sudokuBoard.get(53).searchNumber(z);
					sudokuBoard.get(53).adjustPossibilities();
				}
				if(!(sudokuBoard.get(62).possibilities.size()==1))
				{
					sudokuBoard.get(62).searchNumber(z);
					sudokuBoard.get(62).adjustPossibilities();
				}
				if(!(sudokuBoard.get(71).possibilities.size()==1))
				{
					sudokuBoard.get(71).searchNumber(z);
					sudokuBoard.get(71).adjustPossibilities();
				}
				if(!(sudokuBoard.get(80).possibilities.size()==1))
				{
					sudokuBoard.get(80).searchNumber(z);
					sudokuBoard.get(80).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox1()
	{
		for (int element:box1)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(0).possibilities.size()==1))
				{
					sudokuBoard.get(0).searchNumber(z);
					sudokuBoard.get(0).adjustPossibilities();
				}
				if(!(sudokuBoard.get(1).possibilities.size()==1))
				{
					sudokuBoard.get(1).searchNumber(z);
					sudokuBoard.get(1).adjustPossibilities();
				}
				if(!(sudokuBoard.get(2).possibilities.size()==1))
				{
					sudokuBoard.get(2).searchNumber(z);
					sudokuBoard.get(2).adjustPossibilities();
				}
				if(!(sudokuBoard.get(9).possibilities.size()==1))
				{
					sudokuBoard.get(9).searchNumber(z);
					sudokuBoard.get(9).adjustPossibilities();
				}
				if(!(sudokuBoard.get(10).possibilities.size()==1))
				{
					sudokuBoard.get(10).searchNumber(z);
					sudokuBoard.get(10).adjustPossibilities();
				}
				if(!(sudokuBoard.get(11).possibilities.size()==1))
				{
					sudokuBoard.get(11).searchNumber(z);
					sudokuBoard.get(11).adjustPossibilities();
				}
				if(!(sudokuBoard.get(18).possibilities.size()==1))
				{
					sudokuBoard.get(18).searchNumber(z);
					sudokuBoard.get(18).adjustPossibilities();
				}
				if(!(sudokuBoard.get(19).possibilities.size()==1))
				{
					sudokuBoard.get(19).searchNumber(z);
					sudokuBoard.get(19).adjustPossibilities();
				}
				if(!(sudokuBoard.get(20).possibilities.size()==1))
				{
					sudokuBoard.get(20).searchNumber(z);
					sudokuBoard.get(20).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox2()
	{
		for (int element:box2)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(3).possibilities.size()==1))
				{
					sudokuBoard.get(3).searchNumber(z);
					sudokuBoard.get(3).adjustPossibilities();
				}
				if(!(sudokuBoard.get(4).possibilities.size()==1))
				{
					sudokuBoard.get(4).searchNumber(z);
					sudokuBoard.get(4).adjustPossibilities();
				}
				if(!(sudokuBoard.get(5).possibilities.size()==1))
				{
					sudokuBoard.get(5).searchNumber(z);
					sudokuBoard.get(5).adjustPossibilities();
				}
				if(!(sudokuBoard.get(12).possibilities.size()==1))
				{
					sudokuBoard.get(12).searchNumber(z);
					sudokuBoard.get(12).adjustPossibilities();
				}
				if(!(sudokuBoard.get(13).possibilities.size()==1))
				{
					sudokuBoard.get(13).searchNumber(z);
					sudokuBoard.get(13).adjustPossibilities();
				}
				if(!(sudokuBoard.get(14).possibilities.size()==1))
				{
					sudokuBoard.get(14).searchNumber(z);
					sudokuBoard.get(14).adjustPossibilities();
				}
				if(!(sudokuBoard.get(21).possibilities.size()==1))
				{
					sudokuBoard.get(21).searchNumber(z);
					sudokuBoard.get(21).adjustPossibilities();
				}
				if(!(sudokuBoard.get(22).possibilities.size()==1))
				{
					sudokuBoard.get(22).searchNumber(z);
					sudokuBoard.get(22).adjustPossibilities();
				}
				if(!(sudokuBoard.get(23).possibilities.size()==1))
				{
					sudokuBoard.get(23).searchNumber(z);
					sudokuBoard.get(23).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox3()
	{
		for (int element:box3)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(6).possibilities.size()==1))
				{
					sudokuBoard.get(6).searchNumber(z);
					sudokuBoard.get(6).adjustPossibilities();
				}
				if(!(sudokuBoard.get(7).possibilities.size()==1))
				{
					sudokuBoard.get(7).searchNumber(z);
					sudokuBoard.get(7).adjustPossibilities();
				}
				if(!(sudokuBoard.get(8).possibilities.size()==1))
				{
					sudokuBoard.get(8).searchNumber(z);
					sudokuBoard.get(8).adjustPossibilities();
				}
				if(!(sudokuBoard.get(15).possibilities.size()==1))
				{
					sudokuBoard.get(15).searchNumber(z);
					sudokuBoard.get(15).adjustPossibilities();
				}
				if(!(sudokuBoard.get(16).possibilities.size()==1))
				{
					sudokuBoard.get(16).searchNumber(z);
					sudokuBoard.get(16).adjustPossibilities();
				}
				if(!(sudokuBoard.get(17).possibilities.size()==1))
				{
					sudokuBoard.get(17).searchNumber(z);
					sudokuBoard.get(17).adjustPossibilities();
				}
				if(!(sudokuBoard.get(24).possibilities.size()==1))
				{
					sudokuBoard.get(24).searchNumber(z);
					sudokuBoard.get(24).adjustPossibilities();
				}
				if(!(sudokuBoard.get(25).possibilities.size()==1))
				{
					sudokuBoard.get(25).searchNumber(z);
					sudokuBoard.get(25).adjustPossibilities();
				}
				if(!(sudokuBoard.get(26).possibilities.size()==1))
				{
					sudokuBoard.get(26).searchNumber(z);
					sudokuBoard.get(26).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox4()
	{
		for (int element:box4)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(27).possibilities.size()==1))
				{
					sudokuBoard.get(27).searchNumber(z);
					sudokuBoard.get(27).adjustPossibilities();
				}
				if(!(sudokuBoard.get(28).possibilities.size()==1))
				{
					sudokuBoard.get(28).searchNumber(z);
					sudokuBoard.get(28).adjustPossibilities();
				}
				if(!(sudokuBoard.get(29).possibilities.size()==1))
				{
					sudokuBoard.get(29).searchNumber(z);
					sudokuBoard.get(29).adjustPossibilities();
				}
				if(!(sudokuBoard.get(36).possibilities.size()==1))
				{
					sudokuBoard.get(36).searchNumber(z);
					sudokuBoard.get(36).adjustPossibilities();
				}
				if(!(sudokuBoard.get(37).possibilities.size()==1))
				{
					sudokuBoard.get(37).searchNumber(z);
					sudokuBoard.get(37).adjustPossibilities();
				}
				if(!(sudokuBoard.get(38).possibilities.size()==1))
				{
					sudokuBoard.get(38).searchNumber(z);
					sudokuBoard.get(38).adjustPossibilities();
				}
				if(!(sudokuBoard.get(45).possibilities.size()==1))
				{
					sudokuBoard.get(45).searchNumber(z);
					sudokuBoard.get(45).adjustPossibilities();
				}
				if(!(sudokuBoard.get(46).possibilities.size()==1))
				{
					sudokuBoard.get(46).searchNumber(z);
					sudokuBoard.get(46).adjustPossibilities();
				}
				if(!(sudokuBoard.get(47).possibilities.size()==1))
				{
					sudokuBoard.get(47).searchNumber(z);
					sudokuBoard.get(47).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox5()
	{
		for (int element:box5)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(30).possibilities.size()==1))
				{
					sudokuBoard.get(30).searchNumber(z);
					sudokuBoard.get(30).adjustPossibilities();
				}
				if(!(sudokuBoard.get(31).possibilities.size()==1))
				{
					sudokuBoard.get(31).searchNumber(z);
					sudokuBoard.get(31).adjustPossibilities();
				}
				if(!(sudokuBoard.get(32).possibilities.size()==1))
				{
					sudokuBoard.get(32).searchNumber(z);
					sudokuBoard.get(32).adjustPossibilities();
				}
				if(!(sudokuBoard.get(39).possibilities.size()==1))
				{
					sudokuBoard.get(39).searchNumber(z);
					sudokuBoard.get(39).adjustPossibilities();
				}
				if(!(sudokuBoard.get(40).possibilities.size()==1))
				{
					sudokuBoard.get(40).searchNumber(z);
					sudokuBoard.get(40).adjustPossibilities();
				}
				if(!(sudokuBoard.get(41).possibilities.size()==1))
				{
					sudokuBoard.get(41).searchNumber(z);
					sudokuBoard.get(41).adjustPossibilities();
				}
				if(!(sudokuBoard.get(48).possibilities.size()==1))
				{
					sudokuBoard.get(48).searchNumber(z);
					sudokuBoard.get(48).adjustPossibilities();
				}
				if(!(sudokuBoard.get(49).possibilities.size()==1))
				{
					sudokuBoard.get(49).searchNumber(z);
					sudokuBoard.get(49).adjustPossibilities();
				}
				if(!(sudokuBoard.get(50).possibilities.size()==1))
				{
					sudokuBoard.get(50).searchNumber(z);
					sudokuBoard.get(50).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox6()
	{
		for (int element:box6)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(33).possibilities.size()==1))
				{
					sudokuBoard.get(33).searchNumber(z);
					sudokuBoard.get(33).adjustPossibilities();
				}
				if(!(sudokuBoard.get(34).possibilities.size()==1))
				{
					sudokuBoard.get(34).searchNumber(z);
					sudokuBoard.get(34).adjustPossibilities();
				}
				if(!(sudokuBoard.get(35).possibilities.size()==1))
				{
					sudokuBoard.get(35).searchNumber(z);
					sudokuBoard.get(35).adjustPossibilities();
				}
				if(!(sudokuBoard.get(42).possibilities.size()==1))
				{
					sudokuBoard.get(42).searchNumber(z);
					sudokuBoard.get(42).adjustPossibilities();
				}
				if(!(sudokuBoard.get(43).possibilities.size()==1))
				{
					sudokuBoard.get(43).searchNumber(z);
					sudokuBoard.get(43).adjustPossibilities();
				}
				if(!(sudokuBoard.get(44).possibilities.size()==1))
				{
					sudokuBoard.get(44).searchNumber(z);
					sudokuBoard.get(44).adjustPossibilities();
				}
				if(!(sudokuBoard.get(51).possibilities.size()==1))
				{
					sudokuBoard.get(51).searchNumber(z);
					sudokuBoard.get(51).adjustPossibilities();
				}
				if(!(sudokuBoard.get(52).possibilities.size()==1))
				{
					sudokuBoard.get(52).searchNumber(z);
					sudokuBoard.get(52).adjustPossibilities();
				}
				if(!(sudokuBoard.get(53).possibilities.size()==1))
				{
					sudokuBoard.get(53).searchNumber(z);
					sudokuBoard.get(53).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox7()
	{
		for (int element:box7)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(54).possibilities.size()==1))
				{
					sudokuBoard.get(54).searchNumber(z);
					sudokuBoard.get(54).adjustPossibilities();
				}
				if(!(sudokuBoard.get(55).possibilities.size()==1))
				{
					sudokuBoard.get(55).searchNumber(z);
					sudokuBoard.get(55).adjustPossibilities();
				}
				if(!(sudokuBoard.get(56).possibilities.size()==1))
				{
					sudokuBoard.get(56).searchNumber(z);
					sudokuBoard.get(56).adjustPossibilities();
				}
				if(!(sudokuBoard.get(63).possibilities.size()==1))
				{
					sudokuBoard.get(63).searchNumber(z);
					sudokuBoard.get(63).adjustPossibilities();
				}
				if(!(sudokuBoard.get(64).possibilities.size()==1))
				{
					sudokuBoard.get(64).searchNumber(z);
					sudokuBoard.get(64).adjustPossibilities();
				}
				if(!(sudokuBoard.get(65).possibilities.size()==1))
				{
					sudokuBoard.get(65).searchNumber(z);
					sudokuBoard.get(65).adjustPossibilities();
				}
				if(!(sudokuBoard.get(72).possibilities.size()==1))
				{
					sudokuBoard.get(72).searchNumber(z);
					sudokuBoard.get(72).adjustPossibilities();
				}
				if(!(sudokuBoard.get(73).possibilities.size()==1))
				{
					sudokuBoard.get(73).searchNumber(z);
					sudokuBoard.get(73).adjustPossibilities();
				}
				if(!(sudokuBoard.get(74).possibilities.size()==1))
				{
					sudokuBoard.get(74).searchNumber(z);
					sudokuBoard.get(74).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox8()
	{
		for (int element:box8)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(57).possibilities.size()==1))
				{
					sudokuBoard.get(57).searchNumber(z);
					sudokuBoard.get(57).adjustPossibilities();
				}
				if(!(sudokuBoard.get(58).possibilities.size()==1))
				{
					sudokuBoard.get(58).searchNumber(z);
					sudokuBoard.get(58).adjustPossibilities();
				}
				if(!(sudokuBoard.get(59).possibilities.size()==1))
				{
					sudokuBoard.get(59).searchNumber(z);
					sudokuBoard.get(59).adjustPossibilities();
				}
				if(!(sudokuBoard.get(66).possibilities.size()==1))
				{
					sudokuBoard.get(66).searchNumber(z);
					sudokuBoard.get(66).adjustPossibilities();
				}
				if(!(sudokuBoard.get(67).possibilities.size()==1))
				{
					sudokuBoard.get(67).searchNumber(z);
					sudokuBoard.get(67).adjustPossibilities();
				}
				if(!(sudokuBoard.get(68).possibilities.size()==1))
				{
					sudokuBoard.get(68).searchNumber(z);
					sudokuBoard.get(68).adjustPossibilities();
				}
				if(!(sudokuBoard.get(75).possibilities.size()==1))
				{
					sudokuBoard.get(75).searchNumber(z);
					sudokuBoard.get(75).adjustPossibilities();
				}
				if(!(sudokuBoard.get(76).possibilities.size()==1))
				{
					sudokuBoard.get(76).searchNumber(z);
					sudokuBoard.get(76).adjustPossibilities();
				}
				if(!(sudokuBoard.get(77).possibilities.size()==1))
				{
					sudokuBoard.get(77).searchNumber(z);
					sudokuBoard.get(77).adjustPossibilities();
				}
								
			}
		}
	}
	public void adjustBox9()
	{
		for (int element:box9)
		{
			if (sudokuBoard.get(element).possibilities.size()==1)
			{
				int z= sudokuBoard.get(element).possibilities.get(0);
				if(!(sudokuBoard.get(60).possibilities.size()==1))
				{
					sudokuBoard.get(60).searchNumber(z);
					sudokuBoard.get(60).adjustPossibilities();
				}
				if(!(sudokuBoard.get(61).possibilities.size()==1))
				{
					sudokuBoard.get(61).searchNumber(z);
					sudokuBoard.get(61).adjustPossibilities();
				}
				if(!(sudokuBoard.get(62).possibilities.size()==1))
				{
					sudokuBoard.get(62).searchNumber(z);
					sudokuBoard.get(62).adjustPossibilities();
				}
				if(!(sudokuBoard.get(69).possibilities.size()==1))
				{
					sudokuBoard.get(69).searchNumber(z);
					sudokuBoard.get(69).adjustPossibilities();
				}
				if(!(sudokuBoard.get(70).possibilities.size()==1))
				{
					sudokuBoard.get(70).searchNumber(z);
					sudokuBoard.get(70).adjustPossibilities();
				}
				if(!(sudokuBoard.get(71).possibilities.size()==1))
				{
					sudokuBoard.get(71).searchNumber(z);
					sudokuBoard.get(71).adjustPossibilities();
				}
				if(!(sudokuBoard.get(78).possibilities.size()==1))
				{
					sudokuBoard.get(78).searchNumber(z);
					sudokuBoard.get(78).adjustPossibilities();
				}
				if(!(sudokuBoard.get(79).possibilities.size()==1))
				{
					sudokuBoard.get(79).searchNumber(z);
					sudokuBoard.get(79).adjustPossibilities();
				}
				if(!(sudokuBoard.get(80).possibilities.size()==1))
				{
					sudokuBoard.get(80).searchNumber(z);
					sudokuBoard.get(80).adjustPossibilities();
				}
								
			}
		}
	}
	public void deepSearchBox1()
	{
		for(int element:box1)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(0).searchNumber(element1)==-1))
						{
							if(!(element==0))
							{
								y++;
							}
							if(element==0)
							{
								
							}
						}
						if(!(sudokuBoard.get(1).searchNumber(element1)==-1))
						{
							if(!(element==1))
							{
								y++;
							}
							if(element==1)
							{
								
							}
						}
						if(!(sudokuBoard.get(2).searchNumber(element1)==-1))
						{
							if(!(element==2))
							{
								y++;
							}
							if(element==2)
							{
								
							}
						}
						if(!(sudokuBoard.get(9).searchNumber(element1)==-1))
						{
							if(!(element==9))
							{
								y++;
							}
							if(element==9)
							{
								
							}
						}
						if(!(sudokuBoard.get(10).searchNumber(element1)==-1))
						{
							if(!(element==10))
							{
								y++;
							}
							if(element==10)
							{
								
							}
						}
						if(!(sudokuBoard.get(11).searchNumber(element1)==-1))
						{
							if(!(element==11))
							{
								y++;
							}
							if(element==11)
							{
								
							}
						}
						if(!(sudokuBoard.get(18).searchNumber(element1)==-1))
						{
							if(!(element==18))
							{
								y++;
							}
							if(element==18)
							{
								
							}
						}
						if(!(sudokuBoard.get(19).searchNumber(element1)==-1))
						{
							if(!(element==19))
							{
								y++;
							}
							if(element==19)
							{
								
							}
						}
						if(!(sudokuBoard.get(20).searchNumber(element1)==-1))
						{
							if(!(element==20))
							{
								y++;
							}
							if(element==20)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox2()
	{
		for(int element:box2)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(3).searchNumber(element1)==-1))
						{
							if(!(element==3))
							{
								y++;
							}
							if(element==3)
							{
								
							}
						}
						if(!(sudokuBoard.get(4).searchNumber(element1)==-1))
						{
							if(!(element==4))
							{
								y++;
							}
							if(element==4)
							{
								
							}
						}
						if(!(sudokuBoard.get(5).searchNumber(element1)==-1))
						{
							if(!(element==5))
							{
								y++;
							}
							if(element==5)
							{
								
							}
						}
						if(!(sudokuBoard.get(12).searchNumber(element1)==-1))
						{
							if(!(element==12))
							{
								y++;
							}
							if(element==12)
							{
								
							}
						}
						if(!(sudokuBoard.get(13).searchNumber(element1)==-1))
						{
							if(!(element==13))
							{
								y++;
							}
							if(element==13)
							{
								
							}
						}
						if(!(sudokuBoard.get(14).searchNumber(element1)==-1))
						{
							if(!(element==14))
							{
								y++;
							}
							if(element==14)
							{
								
							}
						}
						if(!(sudokuBoard.get(21).searchNumber(element1)==-1))
						{
							if(!(element==21))
							{
								y++;
							}
							if(element==21)
							{
								
							}
						}
						if(!(sudokuBoard.get(22).searchNumber(element1)==-1))
						{
							if(!(element==22))
							{
								y++;
							}
							if(element==22)
							{
								
							}
						}
						if(!(sudokuBoard.get(23).searchNumber(element1)==-1))
						{
							if(!(element==23))
							{
								y++;
							}
							if(element==23)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox3()
	{
		for(int element:box3)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(6).searchNumber(element1)==-1))
						{
							if(!(element==6))
							{
								y++;
							}
							if(element==6)
							{
								
							}
						}
						if(!(sudokuBoard.get(7).searchNumber(element1)==-1))
						{
							if(!(element==7))
							{
								y++;
							}
							if(element==7)
							{
								
							}
						}
						if(!(sudokuBoard.get(8).searchNumber(element1)==-1))
						{
							if(!(element==8))
							{
								y++;
							}
							if(element==8)
							{
								
							}
						}
						if(!(sudokuBoard.get(15).searchNumber(element1)==-1))
						{
							if(!(element==15))
							{
								y++;
							}
							if(element==15)
							{
								
							}
						}
						if(!(sudokuBoard.get(16).searchNumber(element1)==-1))
						{
							if(!(element==16))
							{
								y++;
							}
							if(element==16)
							{
								
							}
						}
						if(!(sudokuBoard.get(17).searchNumber(element1)==-1))
						{
							if(!(element==17))
							{
								y++;
							}
							if(element==17)
							{
								
							}
						}
						if(!(sudokuBoard.get(24).searchNumber(element1)==-1))
						{
							if(!(element==24))
							{
								y++;
							}
							if(element==24)
							{
								
							}
						}
						if(!(sudokuBoard.get(25).searchNumber(element1)==-1))
						{
							if(!(element==25))
							{
								y++;
							}
							if(element==25)
							{
								
							}
						}
						if(!(sudokuBoard.get(26).searchNumber(element1)==-1))
						{
							if(!(element==26))
							{
								y++;
							}
							if(element==26)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox4()
	{
		for(int element:box4)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(27).searchNumber(element1)==-1))
						{
							if(!(element==27))
							{
								y++;
							}
							if(element==27)
							{
								
							}
						}
						if(!(sudokuBoard.get(28).searchNumber(element1)==-1))
						{
							if(!(element==28))
							{
								y++;
							}
							if(element==28)
							{
								
							}
						}
						if(!(sudokuBoard.get(29).searchNumber(element1)==-1))
						{
							if(!(element==29))
							{
								y++;
							}
							if(element==29)
							{
								
							}
						}
						if(!(sudokuBoard.get(36).searchNumber(element1)==-1))
						{
							if(!(element==36))
							{
								y++;
							}
							if(element==36)
							{
								
							}
						}
						if(!(sudokuBoard.get(37).searchNumber(element1)==-1))
						{
							if(!(element==37))
							{
								y++;
							}
							if(element==37)
							{
								
							}
						}
						if(!(sudokuBoard.get(38).searchNumber(element1)==-1))
						{
							if(!(element==38))
							{
								y++;
							}
							if(element==38)
							{
								
							}
						}
						if(!(sudokuBoard.get(45).searchNumber(element1)==-1))
						{
							if(!(element==45))
							{
								y++;
							}
							if(element==45)
							{
								
							}
						}
						if(!(sudokuBoard.get(46).searchNumber(element1)==-1))
						{
							if(!(element==46))
							{
								y++;
							}
							if(element==46)
							{
								
							}
						}
						if(!(sudokuBoard.get(47).searchNumber(element1)==-1))
						{
							if(!(element==47))
							{
								y++;
							}
							if(element==47)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox5()
	{
		for(int element:box5)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(30).searchNumber(element1)==-1))
						{
							if(!(element==30))
							{
								y++;
							}
							if(element==30)
							{
								
							}
						}
						if(!(sudokuBoard.get(31).searchNumber(element1)==-1))
						{
							if(!(element==31))
							{
								y++;
							}
							if(element==31)
							{
								
							}
						}
						if(!(sudokuBoard.get(32).searchNumber(element1)==-1))
						{
							if(!(element==32))
							{
								y++;
							}
							if(element==32)
							{
								
							}
						}
						if(!(sudokuBoard.get(39).searchNumber(element1)==-1))
						{
							if(!(element==39))
							{
								y++;
							}
							if(element==39)
							{
								
							}
						}
						if(!(sudokuBoard.get(40).searchNumber(element1)==-1))
						{
							if(!(element==40))
							{
								y++;
							}
							if(element==40)
							{
								
							}
						}
						if(!(sudokuBoard.get(41).searchNumber(element1)==-1))
						{
							if(!(element==41))
							{
								y++;
							}
							if(element==41)
							{
								
							}
						}
						if(!(sudokuBoard.get(48).searchNumber(element1)==-1))
						{
							if(!(element==48))
							{
								y++;
							}
							if(element==48)
							{
								
							}
						}
						if(!(sudokuBoard.get(49).searchNumber(element1)==-1))
						{
							if(!(element==49))
							{
								y++;
							}
							if(element==49)
							{
								
							}
						}
						if(!(sudokuBoard.get(50).searchNumber(element1)==-1))
						{
							if(!(element==50))
							{
								y++;
							}
							if(element==50)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox6()
	{
		for(int element:box6)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(33).searchNumber(element1)==-1))
						{
							if(!(element==33))
							{
								y++;
							}
							if(element==33)
							{
								
							}
						}
						if(!(sudokuBoard.get(34).searchNumber(element1)==-1))
						{
							if(!(element==34))
							{
								y++;
							}
							if(element==34)
							{
								
							}
						}
						if(!(sudokuBoard.get(35).searchNumber(element1)==-1))
						{
							if(!(element==35))
							{
								y++;
							}
							if(element==35)
							{
								
							}
						}
						if(!(sudokuBoard.get(42).searchNumber(element1)==-1))
						{
							if(!(element==42))
							{
								y++;
							}
							if(element==42)
							{
								
							}
						}
						if(!(sudokuBoard.get(43).searchNumber(element1)==-1))
						{
							if(!(element==43))
							{
								y++;
							}
							if(element==43)
							{
								
							}
						}
						if(!(sudokuBoard.get(44).searchNumber(element1)==-1))
						{
							if(!(element==44))
							{
								y++;
							}
							if(element==44)
							{
								
							}
						}
						if(!(sudokuBoard.get(51).searchNumber(element1)==-1))
						{
							if(!(element==51))
							{
								y++;
							}
							if(element==51)
							{
								
							}
						}
						if(!(sudokuBoard.get(52).searchNumber(element1)==-1))
						{
							if(!(element==52))
							{
								y++;
							}
							if(element==52)
							{
								
							}
						}
						if(!(sudokuBoard.get(53).searchNumber(element1)==-1))
						{
							if(!(element==53))
							{
								y++;
							}
							if(element==53)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox7()
	{
		for(int element:box7)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(54).searchNumber(element1)==-1))
						{
							if(!(element==54))
							{
								y++;
							}
							if(element==54)
							{
								
							}
						}
						if(!(sudokuBoard.get(55).searchNumber(element1)==-1))
						{
							if(!(element==55))
							{
								y++;
							}
							if(element==55)
							{
								
							}
						}
						if(!(sudokuBoard.get(56).searchNumber(element1)==-1))
						{
							if(!(element==56))
							{
								y++;
							}
							if(element==56)
							{
								
							}
						}
						if(!(sudokuBoard.get(63).searchNumber(element1)==-1))
						{
							if(!(element==63))
							{
								y++;
							}
							if(element==63)
							{
								
							}
						}
						if(!(sudokuBoard.get(64).searchNumber(element1)==-1))
						{
							if(!(element==64))
							{
								y++;
							}
							if(element==64)
							{
								
							}
						}
						if(!(sudokuBoard.get(65).searchNumber(element1)==-1))
						{
							if(!(element==65))
							{
								y++;
							}
							if(element==65)
							{
								
							}
						}
						if(!(sudokuBoard.get(72).searchNumber(element1)==-1))
						{
							if(!(element==72))
							{
								y++;
							}
							if(element==72)
							{
								
							}
						}
						if(!(sudokuBoard.get(73).searchNumber(element1)==-1))
						{
							if(!(element==73))
							{
								y++;
							}
							if(element==73)
							{
								
							}
						}
						if(!(sudokuBoard.get(74).searchNumber(element1)==-1))
						{
							if(!(element==74))
							{
								y++;
							}
							if(element==74)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox8()
	{
		for(int element:box8)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(57).searchNumber(element1)==-1))
						{
							if(!(element==57))
							{
								y++;
							}
							if(element==57)
							{
								
							}
						}
						if(!(sudokuBoard.get(58).searchNumber(element1)==-1))
						{
							if(!(element==58))
							{
								y++;
							}
							if(element==58)
							{
								
							}
						}
						if(!(sudokuBoard.get(59).searchNumber(element1)==-1))
						{
							if(!(element==59))
							{
								y++;
							}
							if(element==59)
							{
								
							}
						}
						if(!(sudokuBoard.get(66).searchNumber(element1)==-1))
						{
							if(!(element==66))
							{
								y++;
							}
							if(element==66)
							{
								
							}
						}
						if(!(sudokuBoard.get(67).searchNumber(element1)==-1))
						{
							if(!(element==67))
							{
								y++;
							}
							if(element==67)
							{
								
							}
						}
						if(!(sudokuBoard.get(68).searchNumber(element1)==-1))
						{
							if(!(element==68))
							{
								y++;
							}
							if(element==68)
							{
								
							}
						}
						if(!(sudokuBoard.get(75).searchNumber(element1)==-1))
						{
							if(!(element==75))
							{
								y++;
							}
							if(element==75)
							{
								
							}
						}
						if(!(sudokuBoard.get(76).searchNumber(element1)==-1))
						{
							if(!(element==76))
							{
								y++;
							}
							if(element==76)
							{
								
							}
						}
						if(!(sudokuBoard.get(77).searchNumber(element1)==-1))
						{
							if(!(element==77))
							{
								y++;
							}
							if(element==77)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchBox9()
	{
		for(int element:box9)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(60).searchNumber(element1)==-1))
						{
							if(!(element==60))
							{
								y++;
							}
							if(element==60)
							{
								
							}
						}
						if(!(sudokuBoard.get(61).searchNumber(element1)==-1))
						{
							if(!(element==61))
							{
								y++;
							}
							if(element==61)
							{
								
							}
						}
						if(!(sudokuBoard.get(62).searchNumber(element1)==-1))
						{
							if(!(element==62))
							{
								y++;
							}
							if(element==62)
							{
								
							}
						}
						if(!(sudokuBoard.get(69).searchNumber(element1)==-1))
						{
							if(!(element==69))
							{
								y++;
							}
							if(element==69)
							{
								
							}
						}
						if(!(sudokuBoard.get(70).searchNumber(element1)==-1))
						{
							if(!(element==70))
							{
								y++;
							}
							if(element==70)
							{
								
							}
						}
						if(!(sudokuBoard.get(71).searchNumber(element1)==-1))
						{
							if(!(element==71))
							{
								y++;
							}
							if(element==71)
							{
								
							}
						}
						if(!(sudokuBoard.get(78).searchNumber(element1)==-1))
						{
							if(!(element==78))
							{
								y++;
							}
							if(element==78)
							{
								
							}
						}
						if(!(sudokuBoard.get(79).searchNumber(element1)==-1))
						{
							if(!(element==79))
							{
								y++;
							}
							if(element==79)
							{
								
							}
						}
						if(!(sudokuBoard.get(80).searchNumber(element1)==-1))
						{
							if(!(element==80))
							{
								y++;
							}
							if(element==80)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine1()
	{
		for(int element:line1)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(0).searchNumber(element1)==-1))
						{
							if(!(element==0))
							{
								y++;
							}
							if(element==0)
							{
								
							}
						}
						if(!(sudokuBoard.get(1).searchNumber(element1)==-1))
						{
							if(!(element==1))
							{
								y++;
							}
							if(element==1)
							{
								
							}
						}
						if(!(sudokuBoard.get(2).searchNumber(element1)==-1))
						{
							if(!(element==2))
							{
								y++;
							}
							if(element==2)
							{
								
							}
						}
						if(!(sudokuBoard.get(3).searchNumber(element1)==-1))
						{
							if(!(element==3))
							{
								y++;
							}
							if(element==3)
							{
								
							}
						}
						if(!(sudokuBoard.get(4).searchNumber(element1)==-1))
						{
							if(!(element==4))
							{
								y++;
							}
							if(element==4)
							{
								
							}
						}
						if(!(sudokuBoard.get(5).searchNumber(element1)==-1))
						{
							if(!(element==5))
							{
								y++;
							}
							if(element==5)
							{
								
							}
						}
						if(!(sudokuBoard.get(6).searchNumber(element1)==-1))
						{
							if(!(element==6))
							{
								y++;
							}
							if(element==6)
							{
								
							}
						}
						if(!(sudokuBoard.get(7).searchNumber(element1)==-1))
						{
							if(!(element==7))
							{
								y++;
							}
							if(element==7)
							{
								
							}
						}
						if(!(sudokuBoard.get(8).searchNumber(element1)==-1))
						{
							if(!(element==8))
							{
								y++;
							}
							if(element==8)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine2()
	{
		for(int element:line2)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(9).searchNumber(element1)==-1))
						{
							if(!(element==9))
							{
								y++;
							}
							if(element==9)
							{
								
							}
						}
						if(!(sudokuBoard.get(10).searchNumber(element1)==-1))
						{
							if(!(element==10))
							{
								y++;
							}
							if(element==10)
							{
								
							}
						}
						if(!(sudokuBoard.get(11).searchNumber(element1)==-1))
						{
							if(!(element==11))
							{
								y++;
							}
							if(element==11)
							{
								
							}
						}
						if(!(sudokuBoard.get(12).searchNumber(element1)==-1))
						{
							if(!(element==12))
							{
								y++;
							}
							if(element==12)
							{
								
							}
						}
						if(!(sudokuBoard.get(13).searchNumber(element1)==-1))
						{
							if(!(element==13))
							{
								y++;
							}
							if(element==13)
							{
								
							}
						}
						if(!(sudokuBoard.get(14).searchNumber(element1)==-1))
						{
							if(!(element==14))
							{
								y++;
							}
							if(element==14)
							{
								
							}
						}
						if(!(sudokuBoard.get(15).searchNumber(element1)==-1))
						{
							if(!(element==15))
							{
								y++;
							}
							if(element==15)
							{
								
							}
						}
						if(!(sudokuBoard.get(16).searchNumber(element1)==-1))
						{
							if(!(element==16))
							{
								y++;
							}
							if(element==16)
							{
								
							}
						}
						if(!(sudokuBoard.get(17).searchNumber(element1)==-1))
						{
							if(!(element==17))
							{
								y++;
							}
							if(element==17)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine3()
	{
		for(int element:line3)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(18).searchNumber(element1)==-1))
						{
							if(!(element==18))
							{
								y++;
							}
							if(element==18)
							{
								
							}
						}
						if(!(sudokuBoard.get(19).searchNumber(element1)==-1))
						{
							if(!(element==19))
							{
								y++;
							}
							if(element==19)
							{
								
							}
						}
						if(!(sudokuBoard.get(20).searchNumber(element1)==-1))
						{
							if(!(element==20))
							{
								y++;
							}
							if(element==20)
							{
								
							}
						}
						if(!(sudokuBoard.get(21).searchNumber(element1)==-1))
						{
							if(!(element==21))
							{
								y++;
							}
							if(element==21)
							{
								
							}
						}
						if(!(sudokuBoard.get(22).searchNumber(element1)==-1))
						{
							if(!(element==22))
							{
								y++;
							}
							if(element==22)
							{
								
							}
						}
						if(!(sudokuBoard.get(23).searchNumber(element1)==-1))
						{
							if(!(element==23))
							{
								y++;
							}
							if(element==23)
							{
								
							}
						}
						if(!(sudokuBoard.get(24).searchNumber(element1)==-1))
						{
							if(!(element==24))
							{
								y++;
							}
							if(element==24)
							{
								
							}
						}
						if(!(sudokuBoard.get(25).searchNumber(element1)==-1))
						{
							if(!(element==25))
							{
								y++;
							}
							if(element==25)
							{
								
							}
						}
						if(!(sudokuBoard.get(26).searchNumber(element1)==-1))
						{
							if(!(element==26))
							{
								y++;
							}
							if(element==26)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine4()
	{
		for(int element:line4)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(27).searchNumber(element1)==-1))
						{
							if(!(element==27))
							{
								y++;
							}
							if(element==27)
							{
								
							}
						}
						if(!(sudokuBoard.get(28).searchNumber(element1)==-1))
						{
							if(!(element==28))
							{
								y++;
							}
							if(element==28)
							{
								
							}
						}
						if(!(sudokuBoard.get(29).searchNumber(element1)==-1))
						{
							if(!(element==29))
							{
								y++;
							}
							if(element==29)
							{
								
							}
						}
						if(!(sudokuBoard.get(30).searchNumber(element1)==-1))
						{
							if(!(element==30))
							{
								y++;
							}
							if(element==30)
							{
								
							}
						}
						if(!(sudokuBoard.get(31).searchNumber(element1)==-1))
						{
							if(!(element==31))
							{
								y++;
							}
							if(element==31)
							{
								
							}
						}
						if(!(sudokuBoard.get(32).searchNumber(element1)==-1))
						{
							if(!(element==32))
							{
								y++;
							}
							if(element==32)
							{
								
							}
						}
						if(!(sudokuBoard.get(33).searchNumber(element1)==-1))
						{
							if(!(element==33))
							{
								y++;
							}
							if(element==33)
							{
								
							}
						}
						if(!(sudokuBoard.get(34).searchNumber(element1)==-1))
						{
							if(!(element==34))
							{
								y++;
							}
							if(element==34)
							{
								
							}
						}
						if(!(sudokuBoard.get(35).searchNumber(element1)==-1))
						{
							if(!(element==35))
							{
								y++;
							}
							if(element==35)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine5()
	{
		for(int element:line5)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(36).searchNumber(element1)==-1))
						{
							if(!(element==36))
							{
								y++;
							}
							if(element==36)
							{
								
							}
						}
						if(!(sudokuBoard.get(37).searchNumber(element1)==-1))
						{
							if(!(element==37))
							{
								y++;
							}
							if(element==37)
							{
								
							}
						}
						if(!(sudokuBoard.get(38).searchNumber(element1)==-1))
						{
							if(!(element==38))
							{
								y++;
							}
							if(element==38)
							{
								
							}
						}
						if(!(sudokuBoard.get(39).searchNumber(element1)==-1))
						{
							if(!(element==39))
							{
								y++;
							}
							if(element==39)
							{
								
							}
						}
						if(!(sudokuBoard.get(40).searchNumber(element1)==-1))
						{
							if(!(element==40))
							{
								y++;
							}
							if(element==40)
							{
								
							}
						}
						if(!(sudokuBoard.get(41).searchNumber(element1)==-1))
						{
							if(!(element==41))
							{
								y++;
							}
							if(element==41)
							{
								
							}
						}
						if(!(sudokuBoard.get(42).searchNumber(element1)==-1))
						{
							if(!(element==42))
							{
								y++;
							}
							if(element==42)
							{
								
							}
						}
						if(!(sudokuBoard.get(43).searchNumber(element1)==-1))
						{
							if(!(element==43))
							{
								y++;
							}
							if(element==43)
							{
								
							}
						}
						if(!(sudokuBoard.get(44).searchNumber(element1)==-1))
						{
							if(!(element==44))
							{
								y++;
							}
							if(element==44)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine6()
	{
		for(int element:line6)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(45).searchNumber(element1)==-1))
						{
							if(!(element==45))
							{
								y++;
							}
							if(element==45)
							{
								
							}
						}
						if(!(sudokuBoard.get(46).searchNumber(element1)==-1))
						{
							if(!(element==46))
							{
								y++;
							}
							if(element==46)
							{
								
							}
						}
						if(!(sudokuBoard.get(47).searchNumber(element1)==-1))
						{
							if(!(element==47))
							{
								y++;
							}
							if(element==47)
							{
								
							}
						}
						if(!(sudokuBoard.get(48).searchNumber(element1)==-1))
						{
							if(!(element==48))
							{
								y++;
							}
							if(element==48)
							{
								
							}
						}
						if(!(sudokuBoard.get(49).searchNumber(element1)==-1))
						{
							if(!(element==49))
							{
								y++;
							}
							if(element==49)
							{
								
							}
						}
						if(!(sudokuBoard.get(50).searchNumber(element1)==-1))
						{
							if(!(element==50))
							{
								y++;
							}
							if(element==50)
							{
								
							}
						}
						if(!(sudokuBoard.get(51).searchNumber(element1)==-1))
						{
							if(!(element==51))
							{
								y++;
							}
							if(element==51)
							{
								
							}
						}
						if(!(sudokuBoard.get(52).searchNumber(element1)==-1))
						{
							if(!(element==52))
							{
								y++;
							}
							if(element==52)
							{
								
							}
						}
						if(!(sudokuBoard.get(53).searchNumber(element1)==-1))
						{
							if(!(element==53))
							{
								y++;
							}
							if(element==53)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine7()
	{
		for(int element:line7)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(54).searchNumber(element1)==-1))
						{
							if(!(element==54))
							{
								y++;
							}
							if(element==54)
							{
								
							}
						}
						if(!(sudokuBoard.get(55).searchNumber(element1)==-1))
						{
							if(!(element==55))
							{
								y++;
							}
							if(element==55)
							{
								
							}
						}
						if(!(sudokuBoard.get(56).searchNumber(element1)==-1))
						{
							if(!(element==56))
							{
								y++;
							}
							if(element==56)
							{
								
							}
						}
						if(!(sudokuBoard.get(57).searchNumber(element1)==-1))
						{
							if(!(element==57))
							{
								y++;
							}
							if(element==57)
							{
								
							}
						}
						if(!(sudokuBoard.get(58).searchNumber(element1)==-1))
						{
							if(!(element==58))
							{
								y++;
							}
							if(element==58)
							{
								
							}
						}
						if(!(sudokuBoard.get(59).searchNumber(element1)==-1))
						{
							if(!(element==59))
							{
								y++;
							}
							if(element==59)
							{
								
							}
						}
						if(!(sudokuBoard.get(60).searchNumber(element1)==-1))
						{
							if(!(element==60))
							{
								y++;
							}
							if(element==60)
							{
								
							}
						}
						if(!(sudokuBoard.get(61).searchNumber(element1)==-1))
						{
							if(!(element==61))
							{
								y++;
							}
							if(element==61)
							{
								
							}
						}
						if(!(sudokuBoard.get(62).searchNumber(element1)==-1))
						{
							if(!(element==62))
							{
								y++;
							}
							if(element==62)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine8()
	{
		for(int element:line8)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(63).searchNumber(element1)==-1))
						{
							if(!(element==63))
							{
								y++;
							}
							if(element==63)
							{
								
							}
						}
						if(!(sudokuBoard.get(64).searchNumber(element1)==-1))
						{
							if(!(element==64))
							{
								y++;
							}
							if(element==64)
							{
								
							}
						}
						if(!(sudokuBoard.get(65).searchNumber(element1)==-1))
						{
							if(!(element==65))
							{
								y++;
							}
							if(element==65)
							{
								
							}
						}
						if(!(sudokuBoard.get(66).searchNumber(element1)==-1))
						{
							if(!(element==66))
							{
								y++;
							}
							if(element==66)
							{
								
							}
						}
						if(!(sudokuBoard.get(67).searchNumber(element1)==-1))
						{
							if(!(element==67))
							{
								y++;
							}
							if(element==67)
							{
								
							}
						}
						if(!(sudokuBoard.get(68).searchNumber(element1)==-1))
						{
							if(!(element==68))
							{
								y++;
							}
							if(element==68)
							{
								
							}
						}
						if(!(sudokuBoard.get(69).searchNumber(element1)==-1))
						{
							if(!(element==69))
							{
								y++;
							}
							if(element==69)
							{
								
							}
						}
						if(!(sudokuBoard.get(70).searchNumber(element1)==-1))
						{
							if(!(element==70))
							{
								y++;
							}
							if(element==70)
							{
								
							}
						}
						if(!(sudokuBoard.get(71).searchNumber(element1)==-1))
						{
							if(!(element==71))
							{
								y++;
							}
							if(element==71)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchLine9()
	{
		for(int element:line9)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(72).searchNumber(element1)==-1))
						{
							if(!(element==72))
							{
								y++;
							}
							if(element==72)
							{
								
							}
						}
						if(!(sudokuBoard.get(73).searchNumber(element1)==-1))
						{
							if(!(element==73))
							{
								y++;
							}
							if(element==73)
							{
								
							}
						}
						if(!(sudokuBoard.get(74).searchNumber(element1)==-1))
						{
							if(!(element==74))
							{
								y++;
							}
							if(element==74)
							{
								
							}
						}
						if(!(sudokuBoard.get(75).searchNumber(element1)==-1))
						{
							if(!(element==75))
							{
								y++;
							}
							if(element==75)
							{
								
							}
						}
						if(!(sudokuBoard.get(76).searchNumber(element1)==-1))
						{
							if(!(element==76))
							{
								y++;
							}
							if(element==76)
							{
								
							}
						}
						if(!(sudokuBoard.get(77).searchNumber(element1)==-1))
						{
							if(!(element==77))
							{
								y++;
							}
							if(element==77)
							{
								
							}
						}
						if(!(sudokuBoard.get(78).searchNumber(element1)==-1))
						{
							if(!(element==78))
							{
								y++;
							}
							if(element==78)
							{
								
							}
						}
						if(!(sudokuBoard.get(79).searchNumber(element1)==-1))
						{
							if(!(element==79))
							{
								y++;
							}
							if(element==79)
							{
								
							}
						}
						if(!(sudokuBoard.get(80).searchNumber(element1)==-1))
						{
							if(!(element==80))
							{
								y++;
							}
							if(element==80)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn1()
	{
		for(int element:column1)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(0).searchNumber(element1)==-1))
						{
							if(!(element==0))
							{
								y++;
							}
							if(element==0)
							{
								
							}
						}
						if(!(sudokuBoard.get(9).searchNumber(element1)==-1))
						{
							if(!(element==9))
							{
								y++;
							}
							if(element==9)
							{
								
							}
						}
						if(!(sudokuBoard.get(18).searchNumber(element1)==-1))
						{
							if(!(element==18))
							{
								y++;
							}
							if(element==18)
							{
								
							}
						}
						if(!(sudokuBoard.get(27).searchNumber(element1)==-1))
						{
							if(!(element==27))
							{
								y++;
							}
							if(element==27)
							{
								
							}
						}
						if(!(sudokuBoard.get(36).searchNumber(element1)==-1))
						{
							if(!(element==36))
							{
								y++;
							}
							if(element==36)
							{
								
							}
						}
						if(!(sudokuBoard.get(45).searchNumber(element1)==-1))
						{
							if(!(element==45))
							{
								y++;
							}
							if(element==45)
							{
								
							}
						}
						if(!(sudokuBoard.get(54).searchNumber(element1)==-1))
						{
							if(!(element==54))
							{
								y++;
							}
							if(element==54)
							{
								
							}
						}
						if(!(sudokuBoard.get(63).searchNumber(element1)==-1))
						{
							if(!(element==63))
							{
								y++;
							}
							if(element==63)
							{
								
							}
						}
						if(!(sudokuBoard.get(72).searchNumber(element1)==-1))
						{
							if(!(element==72))
							{
								y++;
							}
							if(element==72)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn2()
	{
		for(int element:column2)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(1).searchNumber(element1)==-1))
						{
							if(!(element==1))
							{
								y++;
							}
							if(element==1)
							{
								
							}
						}
						if(!(sudokuBoard.get(10).searchNumber(element1)==-1))
						{
							if(!(element==10))
							{
								y++;
							}
							if(element==10)
							{
								
							}
						}
						if(!(sudokuBoard.get(19).searchNumber(element1)==-1))
						{
							if(!(element==19))
							{
								y++;
							}
							if(element==19)
							{
								
							}
						}
						if(!(sudokuBoard.get(28).searchNumber(element1)==-1))
						{
							if(!(element==28))
							{
								y++;
							}
							if(element==28)
							{
								
							}
						}
						if(!(sudokuBoard.get(37).searchNumber(element1)==-1))
						{
							if(!(element==37))
							{
								y++;
							}
							if(element==37)
							{
								
							}
						}
						if(!(sudokuBoard.get(46).searchNumber(element1)==-1))
						{
							if(!(element==46))
							{
								y++;
							}
							if(element==46)
							{
								
							}
						}
						if(!(sudokuBoard.get(55).searchNumber(element1)==-1))
						{
							if(!(element==55))
							{
								y++;
							}
							if(element==55)
							{
								
							}
						}
						if(!(sudokuBoard.get(64).searchNumber(element1)==-1))
						{
							if(!(element==64))
							{
								y++;
							}
							if(element==64)
							{
								
							}
						}
						if(!(sudokuBoard.get(73).searchNumber(element1)==-1))
						{
							if(!(element==73))
							{
								y++;
							}
							if(element==73)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn3()
	{
		for(int element:column3)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(2).searchNumber(element1)==-1))
						{
							if(!(element==2))
							{
								y++;
							}
							if(element==2)
							{
								
							}
						}
						if(!(sudokuBoard.get(11).searchNumber(element1)==-1))
						{
							if(!(element==11))
							{
								y++;
							}
							if(element==11)
							{
								
							}
						}
						if(!(sudokuBoard.get(20).searchNumber(element1)==-1))
						{
							if(!(element==20))
							{
								y++;
							}
							if(element==20)
							{
								
							}
						}
						if(!(sudokuBoard.get(29).searchNumber(element1)==-1))
						{
							if(!(element==29))
							{
								y++;
							}
							if(element==29)
							{
								
							}
						}
						if(!(sudokuBoard.get(38).searchNumber(element1)==-1))
						{
							if(!(element==38))
							{
								y++;
							}
							if(element==38)
							{
								
							}
						}
						if(!(sudokuBoard.get(47).searchNumber(element1)==-1))
						{
							if(!(element==47))
							{
								y++;
							}
							if(element==47)
							{
								
							}
						}
						if(!(sudokuBoard.get(56).searchNumber(element1)==-1))
						{
							if(!(element==56))
							{
								y++;
							}
							if(element==56)
							{
								
							}
						}
						if(!(sudokuBoard.get(65).searchNumber(element1)==-1))
						{
							if(!(element==65))
							{
								y++;
							}
							if(element==65)
							{
								
							}
						}
						if(!(sudokuBoard.get(74).searchNumber(element1)==-1))
						{
							if(!(element==74))
							{
								y++;
							}
							if(element==74)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn4()
	{
		for(int element:column4)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(3).searchNumber(element1)==-1))
						{
							if(!(element==3))
							{
								y++;
							}
							if(element==3)
							{
								
							}
						}
						if(!(sudokuBoard.get(12).searchNumber(element1)==-1))
						{
							if(!(element==12))
							{
								y++;
							}
							if(element==12)
							{
								
							}
						}
						if(!(sudokuBoard.get(21).searchNumber(element1)==-1))
						{
							if(!(element==21))
							{
								y++;
							}
							if(element==21)
							{
								
							}
						}
						if(!(sudokuBoard.get(30).searchNumber(element1)==-1))
						{
							if(!(element==30))
							{
								y++;
							}
							if(element==30)
							{
								
							}
						}
						if(!(sudokuBoard.get(39).searchNumber(element1)==-1))
						{
							if(!(element==39))
							{
								y++;
							}
							if(element==39)
							{
								
							}
						}
						if(!(sudokuBoard.get(48).searchNumber(element1)==-1))
						{
							if(!(element==48))
							{
								y++;
							}
							if(element==48)
							{
								
							}
						}
						if(!(sudokuBoard.get(57).searchNumber(element1)==-1))
						{
							if(!(element==57))
							{
								y++;
							}
							if(element==57)
							{
								
							}
						}
						if(!(sudokuBoard.get(66).searchNumber(element1)==-1))
						{
							if(!(element==66))
							{
								y++;
							}
							if(element==66)
							{
								
							}
						}
						if(!(sudokuBoard.get(75).searchNumber(element1)==-1))
						{
							if(!(element==75))
							{
								y++;
							}
							if(element==75)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn5()
	{
		for(int element:column5)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(4).searchNumber(element1)==-1))
						{
							if(!(element==4))
							{
								y++;
							}
							if(element==4)
							{
								
							}
						}
						if(!(sudokuBoard.get(13).searchNumber(element1)==-1))
						{
							if(!(element==13))
							{
								y++;
							}
							if(element==13)
							{
								
							}
						}
						if(!(sudokuBoard.get(22).searchNumber(element1)==-1))
						{
							if(!(element==22))
							{
								y++;
							}
							if(element==22)
							{
								
							}
						}
						if(!(sudokuBoard.get(31).searchNumber(element1)==-1))
						{
							if(!(element==31))
							{
								y++;
							}
							if(element==31)
							{
								
							}
						}
						if(!(sudokuBoard.get(40).searchNumber(element1)==-1))
						{
							if(!(element==40))
							{
								y++;
							}
							if(element==40)
							{
								
							}
						}
						if(!(sudokuBoard.get(49).searchNumber(element1)==-1))
						{
							if(!(element==49))
							{
								y++;
							}
							if(element==49)
							{
								
							}
						}
						if(!(sudokuBoard.get(58).searchNumber(element1)==-1))
						{
							if(!(element==58))
							{
								y++;
							}
							if(element==58)
							{
								
							}
						}
						if(!(sudokuBoard.get(67).searchNumber(element1)==-1))
						{
							if(!(element==67))
							{
								y++;
							}
							if(element==67)
							{
								
							}
						}
						if(!(sudokuBoard.get(76).searchNumber(element1)==-1))
						{
							if(!(element==76))
							{
								y++;
							}
							if(element==76)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn6()
	{
		for(int element:column6)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(5).searchNumber(element1)==-1))
						{
							if(!(element==5))
							{
								y++;
							}
							if(element==5)
							{
								
							}
						}
						if(!(sudokuBoard.get(14).searchNumber(element1)==-1))
						{
							if(!(element==14))
							{
								y++;
							}
							if(element==14)
							{
								
							}
						}
						if(!(sudokuBoard.get(23).searchNumber(element1)==-1))
						{
							if(!(element==23))
							{
								y++;
							}
							if(element==23)
							{
								
							}
						}
						if(!(sudokuBoard.get(32).searchNumber(element1)==-1))
						{
							if(!(element==32))
							{
								y++;
							}
							if(element==32)
							{
								
							}
						}
						if(!(sudokuBoard.get(41).searchNumber(element1)==-1))
						{
							if(!(element==41))
							{
								y++;
							}
							if(element==41)
							{
								
							}
						}
						if(!(sudokuBoard.get(50).searchNumber(element1)==-1))
						{
							if(!(element==50))
							{
								y++;
							}
							if(element==50)
							{
								
							}
						}
						if(!(sudokuBoard.get(59).searchNumber(element1)==-1))
						{
							if(!(element==59))
							{
								y++;
							}
							if(element==59)
							{
								
							}
						}
						if(!(sudokuBoard.get(68).searchNumber(element1)==-1))
						{
							if(!(element==68))
							{
								y++;
							}
							if(element==68)
							{
								
							}
						}
						if(!(sudokuBoard.get(77).searchNumber(element1)==-1))
						{
							if(!(element==77))
							{
								y++;
							}
							if(element==77)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn7()
	{
		for(int element:column7)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(6).searchNumber(element1)==-1))
						{
							if(!(element==6))
							{
								y++;
							}
							if(element==6)
							{
								
							}
						}
						if(!(sudokuBoard.get(15).searchNumber(element1)==-1))
						{
							if(!(element==15))
							{
								y++;
							}
							if(element==15)
							{
								
							}
						}
						if(!(sudokuBoard.get(24).searchNumber(element1)==-1))
						{
							if(!(element==24))
							{
								y++;
							}
							if(element==24)
							{
								
							}
						}
						if(!(sudokuBoard.get(33).searchNumber(element1)==-1))
						{
							if(!(element==33))
							{
								y++;
							}
							if(element==33)
							{
								
							}
						}
						if(!(sudokuBoard.get(42).searchNumber(element1)==-1))
						{
							if(!(element==42))
							{
								y++;
							}
							if(element==42)
							{
								
							}
						}
						if(!(sudokuBoard.get(51).searchNumber(element1)==-1))
						{
							if(!(element==51))
							{
								y++;
							}
							if(element==51)
							{
								
							}
						}
						if(!(sudokuBoard.get(60).searchNumber(element1)==-1))
						{
							if(!(element==60))
							{
								y++;
							}
							if(element==60)
							{
								
							}
						}
						if(!(sudokuBoard.get(69).searchNumber(element1)==-1))
						{
							if(!(element==69))
							{
								y++;
							}
							if(element==69)
							{
								
							}
						}
						if(!(sudokuBoard.get(78).searchNumber(element1)==-1))
						{
							if(!(element==78))
							{
								y++;
							}
							if(element==78)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn8()
	{
		for(int element:column8)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(7).searchNumber(element1)==-1))
						{
							if(!(element==7))
							{
								y++;
							}
							if(element==7)
							{
								
							}
						}
						if(!(sudokuBoard.get(16).searchNumber(element1)==-1))
						{
							if(!(element==16))
							{
								y++;
							}
							if(element==16)
							{
								
							}
						}
						if(!(sudokuBoard.get(25).searchNumber(element1)==-1))
						{
							if(!(element==25))
							{
								y++;
							}
							if(element==25)
							{
								
							}
						}
						if(!(sudokuBoard.get(34).searchNumber(element1)==-1))
						{
							if(!(element==34))
							{
								y++;
							}
							if(element==34)
							{
								
							}
						}
						if(!(sudokuBoard.get(43).searchNumber(element1)==-1))
						{
							if(!(element==43))
							{
								y++;
							}
							if(element==43)
							{
								
							}
						}
						if(!(sudokuBoard.get(52).searchNumber(element1)==-1))
						{
							if(!(element==52))
							{
								y++;
							}
							if(element==52)
							{
								
							}
						}
						if(!(sudokuBoard.get(61).searchNumber(element1)==-1))
						{
							if(!(element==61))
							{
								y++;
							}
							if(element==61)
							{
								
							}
						}
						if(!(sudokuBoard.get(70).searchNumber(element1)==-1))
						{
							if(!(element==70))
							{
								y++;
							}
							if(element==70)
							{
								
							}
						}
						if(!(sudokuBoard.get(79).searchNumber(element1)==-1))
						{
							if(!(element==79))
							{
								y++;
							}
							if(element==79)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
	public void deepSearchColumn9()
	{
		for(int element:column9)
		{
			if(!(sudokuBoard.get(element).possibilities.size()==1))
			{
				for(int element1:numbers)
				{
					sudokuBoard.get(element).searchNumber(element1);
					int y=0;
					if(!(sudokuBoard.get(element).searchNumber(element1)==-1))
					{
						
						if(!(sudokuBoard.get(8).searchNumber(element1)==-1))
						{
							if(!(element==8))
							{
								y++;
							}
							if(element==8)
							{
								
							}
						}
						if(!(sudokuBoard.get(17).searchNumber(element1)==-1))
						{
							if(!(element==17))
							{
								y++;
							}
							if(element==17)
							{
								
							}
						}
						if(!(sudokuBoard.get(26).searchNumber(element1)==-1))
						{
							if(!(element==26))
							{
								y++;
							}
							if(element==26)
							{
								
							}
						}
						if(!(sudokuBoard.get(35).searchNumber(element1)==-1))
						{
							if(!(element==35))
							{
								y++;
							}
							if(element==35)
							{
								
							}
						}
						if(!(sudokuBoard.get(44).searchNumber(element1)==-1))
						{
							if(!(element==44))
							{
								y++;
							}
							if(element==44)
							{
								
							}
						}
						if(!(sudokuBoard.get(53).searchNumber(element1)==-1))
						{
							if(!(element==53))
							{
								y++;
							}
							if(element==53)
							{
								
							}
						}
						if(!(sudokuBoard.get(62).searchNumber(element1)==-1))
						{
							if(!(element==62))
							{
								y++;
							}
							if(element==62)
							{
								
							}
						}
						if(!(sudokuBoard.get(71).searchNumber(element1)==-1))
						{
							if(!(element==71))
							{
								y++;
							}
							if(element==71)
							{
								
							}
						}
						if(!(sudokuBoard.get(80).searchNumber(element1)==-1))
						{
							if(!(element==80))
							{
								y++;
							}
							if(element==80)
							{
								
							}
						}
						if(y==0)
						{
							sudokuBoard.get(element).possibilities.clear();
							sudokuBoard.get(element).possibilities.add(element1);
						}
					}
				}
			}
		}
			
	}
		
	public int loopSupport()
	{
		for(int i=0; i<81; i++)
		{
			if(!(sudokuBoard.get(i).possibilities.size()==1))
				this.count=count+1;
		}
		return this.count;
	}
	public void resetLoopSupport()
	{
		this.count=0;
	}
	public void displayOnGUI()
	{
		
		for(int i=0; i<81; i++)
			if(sudokuBoard.get(i).possibilities.size()==1)
				cellNumbers.add(i);
				
	}

	public String toString()
	{
		return "hey";
	}
}
