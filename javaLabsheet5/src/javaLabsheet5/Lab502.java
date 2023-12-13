package javaLabsheet5;
import java.util.*;
import java.util.Scanner;

public class Lab502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence ;
		System.out.print("Input some sentence : ");
		sentence = scan.nextLine();
	
		while  (!sentence.endsWith(".")) {
			System.out.print("the sentence must end with full stop point  : ");
			sentence = scan.nextLine();
			break;
		}
		System.out.println();
		for(int i=0;i<=sentence.length()-1;i++)
			{
				if (  sentence.charAt(i)== ' ' )
				{
					System.out.println();
					
				}else {
				System.out.print(sentence.charAt(i));	
				}
				}
			}
		
	}


