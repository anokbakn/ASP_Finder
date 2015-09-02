 

import javax.swing.JFrame;

/** A Frame to support our main Panel
 * @author ARMAND NOKBAK-NYEMBE
 */
public class Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		JFrame frame1 = new JFrame ("SUDOKU Wizard by Armand Nokbak a.k.a. VISION (easy Sudoku puzzles level done in 5 days)");
	      frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	      Panel panel = new Panel();
	      frame1.add(panel);

	      frame1.pack();
	      frame1.setVisible(true);
	}

}

