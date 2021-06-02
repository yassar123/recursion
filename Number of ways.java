import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	
	public static int ways(int sum, int start, int currSum){
		if(currSum == sum){ //possible combination
			return 1;
		}
		else if(currSum > sum){ //impossible combination
			return 0;
		}

		int res = 0;
		
		for(int i = start; i <= sum-currSum; i++){
			res += ways(sum, i+1, currSum+i); 
		}
		return res;
	}

	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- >0){
			int N = scn.nextInt();
			int res = ways(N, 0, 0);
			System.out.println(res/2);
		}
	}
}
