import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		// Read Scanner class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//Memberlogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next(); // read name data to fname variable
			String Iname = readFile.next();// read surname data to lname variable
			readFile.next(); // read password
			String email = readFile.next().toLowerCase(); // read email data to variable
			
			System.out.println(fname+" "+"("+email+")");
			
		}
		readFile.close();
	}

}
