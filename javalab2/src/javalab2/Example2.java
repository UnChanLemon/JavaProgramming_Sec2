package javalab2;
import java.text.*;//1.Import library for format number
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. define object call Decimalformat class
		DecimalFormat frm = new DecimalFormat("#,###.00"); 
		final int Buffa = 299;
		int Numberofcustomers =5;
		
		float totalprice = Buffa*Numberofcustomers;
		//3. apply frm object to totalPrice
		System.out.println("Buffet of "+Numberofcustomers + 
				" customers is "+frm.format(totalprice));
		float servicecharge = totalprice + (totalprice*3/100);
		System.out.println("Add service Charge 3% is "+frm.format(servicecharge));
	}

}
