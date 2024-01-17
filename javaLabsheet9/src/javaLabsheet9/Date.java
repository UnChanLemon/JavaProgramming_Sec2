package javaLabsheet9;

public class Date {
	private int year, month, day;
	
	Date(int year, int month, int day) {
		this.year= year;
		this.month=month;
		this.day = day;
	}
	public int getyear(){
		return year;
	}
	public int getmonth(){
		return month;
	}
	public int getday(){
		return day;
	}
	public void  setyear(int year){
		this.year=year;
	}
	public void  setmonth(int month){
		this.month=month;
	}
	public void  setday(int day){
		this.day=day;
	}
	
	
	public String toString() {
		return String.format("%02d/%02d/%4d", month,day,year);
	}
	
	
	
	
	public void setDate(int year,int month, int day) {
		this.year =year;
		this.month= month;
		this.day = day;
	}
	
	
	
	
	
	
	
	
	
}
