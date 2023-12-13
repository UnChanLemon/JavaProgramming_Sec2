package javaLabsheet5;
import java.util.*;

import javax.swing.JOptionPane;
public class Example_503_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence= JOptionPane.showInputDialog("Input a sentence: ");
		
		while(sentence.endsWith(" ")) {
			sentence= JOptionPane.showInputDialog("Input a sentence, again:");
		}
		int countSpace = 0;
		for(int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				 countSpace+=1;
			}
			JOptionPane.showMessageDialog(null, "This sentence has "+countSpace+" spacesbar.");
			JOptionPane.showMessageDialog(null, "This sentence has "+(countSpace+1)+" word.");
		}
		}
		

}
