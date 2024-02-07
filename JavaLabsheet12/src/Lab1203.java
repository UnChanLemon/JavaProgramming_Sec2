import java.io.IOException;
import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = " ";
		int countBook = 0,i=0;
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			
			System.out.println(data[0]+" ("+data[1]+"), Rating"+data[2]+" publish on "+
			data[5]);
				countBook++;
				i++;
		}
		System.out.println("=============================================");
		System.out.println("Total number of book : " +countBook);
		readFile.close();
	}

}
