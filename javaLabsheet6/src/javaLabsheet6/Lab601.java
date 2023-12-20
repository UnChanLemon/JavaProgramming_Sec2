package javaLabsheet6;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
		
		
		
	}//end main
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		//inputEmail = inputEmail.toLowerCase();
		boolean chkEmail= checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		//JOptionPane.showMessageDialog(null,"Your e-mail is"+inputEmail);
	
	
	
	}
	
	
	
	
	
	
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
		
	}
	public static  void displayEmail(boolean chEmail,String inEmail) {
		if(chEmail==true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is"+inEmail);
		}
	}

}
