package javaLabsheet11;

import java.time.Year;

public class FictionBook implements Author,Book{
		private String author_name ;
		private String email ;
		private String title; 
		private int publicYear;
		private int space ;
		 FictionBook(String title, int pulicYear) {
			this.title = title;
			this.publicYear = publicYear;
		}
		public void setAuthourName(String name) {
			this.author_name = name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public boolean checkFormatName() {
			if (author_name.indexOf(" ") != -1) {
				return true;
			}else return false;
		}
		
		
		public String getLastName() {
			space = author_name.indexOf(" ");
			String lastName = author_name.substring(space+1);
		return lastName.toUpperCase() ;
			
		}	
		public String getFirstName() {
			space = author_name.indexOf(" ");
			String firstName = author_name.substring(0,space);
			return firstName.toUpperCase();
		
		}
		public boolean checkemail() {
			if (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
				return true;
			}else return false;
		}	
		public int totalPublicYear() {
		 return Year.now().getValue()-this.publicYear;	
		 
		}
	public String toString() {
			return title + " write by "+getLastName().substring(0,1)+"."+ getFirstName()+
					"(" +email+") Published for "+totalPublicYear()+"years"; 
		}
	@Override
	public String getTitle() {
		
		return title;
	}
}
