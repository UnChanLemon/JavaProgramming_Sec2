import  java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	 private String name;
	 private String dept;
	 
	 public void insert() throws IOException{
		 //create object for input data from keyboard(console)
		 Scanner scan = new Scanner(System.in);
		 
		 PrintStream witeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		 String answer;
		 do {
			header();
			 System.out.print("Enter name: ");
			 name = scan.next();
			 System.out.print("Enter department: ");
			 dept = scan.next();
			 witeFile.println(name+"\t"+dept);
			 System.out.print("Enter data again? : ");
			 answer = scan.next().toLowerCase();
		 }while(answer.equals("y"));
		
	 }
	 public void read( ) {
		 try {
			 int i = 1,p=0;
			 //create object
			 Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			 boolean check = false;
			 header();
			 while(readFile.hasNext()) {
				 name = readFile.next();
				 dept = readFile.next();
				 if(dept.equalsIgnoreCase(super.getDept())) {
					 System.out.println(i+")"+name);
					 check = true;
					 i++;
					 p++;
				 }
				
			 } readFile.close();
			 if(check == true) {
				 header();
				 System.out.println("Employee in dept " +super.getDept() + " is " + p +" person. "  );
			 }
			 if(check == false) {
					  header();
					 System.out.println("\nSorry, no department: "+super.getDept()+"in File");
					
				 }
		 }catch(IOException e ) {
			 System.out.println("\nSorry, file not found...");
		 }
	 }
}
