package javaLabsheet4;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int currentNumber ,PreviousNumber;
		
		System.out.print("In put number : ");
		PreviousNumber = scan.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if (currentNumber < PreviousNumber) {
			break ;
			}
			currentNumber=PreviousNumber;
		}
		
		
		
		/*System.out.print("In put number : ");
		currentNumber = scan.nextInt();*/
		
		
		/*if (currentNumber < PreviousNumber) {
			System.out.print("Bye Bye ");*/
		
		
			
		}
		

	

}

