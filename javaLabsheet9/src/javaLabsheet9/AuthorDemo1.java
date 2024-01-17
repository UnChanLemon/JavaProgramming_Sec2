package javaLabsheet9;
import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		
	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name: ");
	     String name = scan.nextLine();
	    System.out.print("Input author e-mail : ");
	    String email = scan.next();
	    System.out.print("Input publish gender : ");
	    char gender = scan.next().charAt(0);
	    System.out.println(" ");
	    	
	    Author a1 = new Author(name, email, gender);
	    System.out.println(a1);

	}

}
