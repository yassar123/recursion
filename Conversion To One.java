import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int countways (long n){
		//base case
	
        if (n == 1)
            return 0;
        else if (n % 2 == 0)
            return 1 + countways(n / 2);
        else
            return 1 + Math.min(countways(n - 1), countways(n + 1));
	}
	public static void main (String[] args) {
        Scanner ipReader = new Scanner(System.in);
		int test = ipReader.nextInt();
		while(test-- != 0)
		{
			long n = ipReader.nextLong();
			System.out.println(countways(n));
		}
	}
}
