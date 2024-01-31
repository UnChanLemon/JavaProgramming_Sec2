package javaLabsheet11;
import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Title : ");
		String title = sc.nextLine();
		
		System.out.print("Input PublicYear : ");
		int publicYear = sc.nextInt();
		
		FictionBook Book = new FictionBook(title,publicYear);
		sc.nextLine();
		do{System.out.print("Input Author name : ");
		String name = sc.nextLine();
		Book.setAuthourName(name);}
		while(!Book.checkFormatName());
		do {
		System.out.print("Input Email : ");
		String email = sc.nextLine();
		Book.setEmail(email);
		}while(!Book.checkFormatName());
			
		
			
			
			
			
		System.out.print(Book);
	}

}
