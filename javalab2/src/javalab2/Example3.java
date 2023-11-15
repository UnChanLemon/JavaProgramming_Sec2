package javalab2;
import java.util.*;//1. import library for input data from keyboard(console)
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //2. define object for scanner class
		
		Scanner console = new Scanner(System.in);
		System.out.print("Input product name : ");
		String productName = console.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = console.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit = console.nextFloat();
		System.out.println();
		float totalprice = productUnit*pricePerUnit;
		float vat = totalprice+(totalprice*7/100);
		System.out.println("Total Price is "+totalprice+" bath.");
		System.out.println("Add VAT 7% is  "+vat+" bath.");



	}

}
