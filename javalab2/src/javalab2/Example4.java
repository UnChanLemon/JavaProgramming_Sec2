package javalab2;
import java.text.DecimalFormat;

import javax.swing.*;
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00"); 
		String productname = JOptionPane.showInputDialog("Input product name : ");
        
        /*String StrUnit = JOptionPane.showInputDialog("Input product Unit : ");
        int unitPrice = Integer.parseInt(StrUnit);*/
        
        int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product Unit"));
       float PricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input product per Unit"));
       double totalPrice = unitPrice * PricePerUnit;
       double vat = totalPrice + (totalPrice*7/100);
       
       JOptionPane.showMessageDialog(null, "Total Price is "
       		+ frm.format(totalPrice )+ " bath."
       				+ "\n Add VAT 7 % is "+ frm.format(vat) + " bath.");
	}

}
