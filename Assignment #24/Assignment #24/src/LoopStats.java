//(c) A+ Computer Science
//www.apluscompsci.com
//Name



public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
	}

	public LoopStats(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;

	}

	public int EvenCount()
	{
		int evenCount=0;
		for (int x = start; x <= stop; x++){
			if (x % 2 ==0) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public int OddCount()
	{
		int oddCount=0;
		for (int x = start; x <= stop; x++){
			if (x % 2 !=0) {
				oddCount++;
			}
		}




		return oddCount;
	}

	public int Total()
	{
		int total=0;
		for (int x = start; x <= stop; x++){
			total += x;
		}



		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}