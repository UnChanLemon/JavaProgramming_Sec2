package javaLabsheet5;
import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String Message ;
		System.out.print("Message : ");
		Message = scan.nextLine();
		String mes = Message.toLowerCase();
		
		if(mes.indexOf("nichi")>=0){
			System.out.print("Nichi is a sentence ");
		}
		else {
			System.out.print(Message);
		}
	}

}
