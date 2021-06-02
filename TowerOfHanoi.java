import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static void towerOfHanoi(int disks, String a, String b, String c){
		//base case
		if(disks == 0){
			return;
		}
		//move x-1 disks moved from src to helper with the help of dest
		//src - A, helper - B, dest - C
		//towerOfHanoi(disks-1, source, helper, destination);
		towerOfHanoi(disks-1, a, c, b);
		
		//move xth disk from source to destination
		//{DiskNumber}:{FromRod}->{ToRod} 
		System.out.println(disks + ":" + a + "->" + c);

		//move x-1 disks moved from helper to dest with the help of src
		//src - A, helper - B, dest - C
		//towerOfHanoi(disks-1, source, helper, destination);
		towerOfHanoi(disks-1, b, a, c);

	}
	public static void main (String[] args) {
                      // Your code here
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();

		towerOfHanoi(n, "A", "B", "C");
	}
}
