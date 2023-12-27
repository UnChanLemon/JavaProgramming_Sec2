package javaLabsheet7;
import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int odd = 0;
		int[] num = new int[7];
		
		for (int i =0; i < num.length; i++) {
			 System.out.print("Input number "+(i+1)+" : ");
			 num[i] = scan.nextInt();
			if (num[i] %2 >0) {
				odd++;
			}
		}
		/*for (int _num:num) {
			 System.out.print("Input number"+(i+1)+" : ");
			 _num = scan.nextInt();
			if (_num %2 !=0) {
				odd++;
			}
			 i++;
		 }*/
	System.out.println(" ");
		System.out.println("There are "+odd+" of odd number.");
	System.out.print("List of odd number : ");
	for (int o :num ) {
		if (o%2>0) {
			System.out.print(o + " ");
		}
	}
	
	}

}
