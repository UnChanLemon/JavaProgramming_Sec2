package javaLabsheet6;
import java.util.*;

import java.util.Scanner;

public class Lab604 {
		static Scanner scan = new Scanner (System.in);
		static String studentId, subjectID;
		static int  subjectId;
		
		public static void main(String[] args) {
			isITStudent();

		}//end
		public static void isITStudent() {
			do {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			subjectID = subjectId+"";
			}while(!(isLength(studentId,subjectID)));
				System.out.println();
			displayData(isITStudent(studentId),isITSubject(studentId));
		} //end
		
		public static boolean isLength(String id , String sub_id) {
			if(id.length()==10 && sub_id.length()==7) {
				return true;
			}else
				return false;
		} //end
		public static boolean isITStudent(String id) {
			if (id.substring(0,3).equals("211")&&id.substring(4,5).equals("311")) {
				return true;
			}else {
			return false;}
		}
		public static boolean isITSubject(String id) {
			if (id.substring(0,2).equals("21")&&id.substring(4,5).equals("1")) {
				return true;
			}else {
			return false;}
		}//end
		
		public static void displayData(boolean sid,boolean subid) {
			if(sid) {
				System.out.println("Student id:"+studentId+"1st year student in IT");
				
			}else {
				System.out.println("Student id:"+studentId+"1st not year student in IT");
			}
			if(subid) {
				System.out.println("Enroll in courses for Year 1");
			}else {
				System.out.println("Not enroll in courses for year 1");
			}
			
		}
		


	}


