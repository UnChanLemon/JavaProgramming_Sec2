package javaLabsheet4;
import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frmid= new DecimalFormat("#,###.00");
		final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; 
		 Scanner scan = new Scanner(System.in);
		 
		 int sales; 
		 double salary;
			while(true) {
		 System.out.print("Enter sales in dollars  (or -1 to end): ");
		sales= scan.nextInt();
		salary= 1000+sales*COMMISSION_RATE;
		
		
		
		if(sales== SENTINEL) {
			System.out.println("bye");
			break;
		}
		
		System.out.println("Salary is: $"+frmid.format(salary));
		System.out.println("");
			}
		
	}

}
