package javaLabsheet6;
import java.util.*;


public class Lab603 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your name, separated by a space.\n: ");
		String fullname = scan.nextLine();
		String fistname = fullname.substring(0,fullname.indexOf(' '));
		System.out.println(abbreviatName(fullname)+fistname);
		
		
	// Robert John Downey	
				// int num = name.indexOf(' ') ;
	}//end
	public static String abbreviatName(String fullname) {
		String surname=" ";
		
		for(int i=0;i<=fullname.length()-1;i++) {
			if (  fullname.charAt(i)== ' ' ) {
				surname += fullname.charAt(i+1)+".";
				
			}
				
			
		}
		return surname ;
	}
		
	
	
}
