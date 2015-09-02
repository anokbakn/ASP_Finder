import java.util.ArrayList;


public class Cell 
{
	ArrayList<Integer> possibilities = new ArrayList<Integer>();
	private int v;
	
	public Cell()
	{
		v=0;
		possibilities.add(1);
		possibilities.add(2);
		possibilities.add(3);
		possibilities.add(4);
		possibilities.add(5);
		possibilities.add(6);
		possibilities.add(7);
		possibilities.add(8);
		possibilities.add(9);
		
	}
	/** use linear search here
	 * 
	 * @return
	 */
	public int searchNumber(int v)
	{
		this.v=v;
		for (int element:possibilities)
			if (element == v)
				return possibilities.indexOf(element);
		return -1;
	}
	public void adjustPossibilities()
	{
		if (searchNumber(v)==-1)
		{
			
		}
		else
		{
			possibilities.remove(searchNumber(v));
		}
		
	}
}
