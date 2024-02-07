import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Head();
		Scanner readFile = new Scanner(new FileReader("d://txtFile//Student.txt"));
		String temp = " ";
		int i = 1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			int level = readFile.nextInt();
			System.out.println(i+"."+"\t\t "+id+"\t "+Level(id)+"\t "+fname+"."+lname+"\t\t "+grade+"\t"+Status(grade));
			i++;
			
		}
		readFile.close();
		
	}//end
	public static String Level(String id) {
		int stLevel = Integer.parseInt(id.substring(0,2));
		int stYear = 22-stLevel;
		return stYear+"th";
	}//end
	public static String Status(double grade) {
		if(grade>2.00) {
			return "Pass";
		}else if (grade>=1.00 && grade<=2.00) {
			return "Critical";
		}else return "Retried";
	}//end
	public static void Head() {
		System.out.println("No. \t\t ID \t\t Level \t Name \t\t\t Grade \t status");
		System.out.println("**************************************************************************************");
	}//end
}
