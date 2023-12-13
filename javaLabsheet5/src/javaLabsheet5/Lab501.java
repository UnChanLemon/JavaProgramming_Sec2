package javaLabsheet5;
import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name ;
		System.out.print("Full Name: ");
		 name = scan.nextLine();
		//String firstname ;
		//String lastname;
		int num = name.indexOf(' ') ;
		//System.out.print(num);
		if(num == -1) {
				System.out.print("Incorrect Name");
			}
		else {
				 String firstname= name.substring(0,num);
				String lastname= name.substring(num);
				System.out.println("First Name: "+firstname);
				System.out.println("Last Name: "+lastname);
				
				
			}
			
		
		
	}

}
