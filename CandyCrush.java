import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
	static long candyCrush(long n)
	{
		long cost = 0;
		if(n==0)
		{
			return cost;
		}
		long group;
		if(n % 3 == 0)
		{
			group = n/3;
		}
		else
		{
			group = n/3 + 1;
		}
		cost = group*group;
		cost += candyCrush(n - group);
		return cost;
	}
	public static void main (String[] args) {
        Scanner ipReader = new Scanner(System.in);
		int test = ipReader.nextInt();
		while(test-- != 0)
		{
			long n = ipReader.nextInt();
			
			System.out.println(candyCrush(n));
		}
	}
}
