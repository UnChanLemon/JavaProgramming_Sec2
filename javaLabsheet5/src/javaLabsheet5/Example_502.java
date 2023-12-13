package javaLabsheet5;
import java.util.*;

import javax.swing.JOptionPane;
public class Example_502 {

	public static void main(String[] args) {
		//1. input email from dialog box
		String youremail= JOptionPane.showInputDialog("Input you e-mail:");
		//2.check email start with @ or space bar or not 
		while(youremail.startsWith("@")|| youremail.startsWith(" ")) {
			youremail= JOptionPane.showInputDialog("Input you e-mail, again:");
		}
		//3.check email end with hotmail.com or gmail.com or not
		if(youremail.endsWith("hotmail.com")||youremail.endsWith("gmail.com") ) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+ youremail);
		}else {
			JOptionPane.showMessageDialog(null,
					"Your e-mail not hotmail or gmail .com  ");
		}
		
	}

}
