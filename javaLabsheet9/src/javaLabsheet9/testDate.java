package javaLabsheet9;

public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(2023,2,8);
		System.out.println(d1);
		
		//test
		d1.setyear(2023);
		d1.setmonth(12);
		d1.setday(21);
		System.out.println(d1);
		System.out.println("Year is: "+d1.getyear());
		System.out.println("Month is: "+d1.getmonth());
		System.out.println("Day is: "+d1.getday());
		
		d1.setDate(2024, 1, 2);
		System.out.println("The date of odject d1: "+d1);
	}

}
