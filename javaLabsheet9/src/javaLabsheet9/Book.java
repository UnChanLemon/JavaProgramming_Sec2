package javaLabsheet9;

import java.time.Year;

public class Book {
	 private String title;
	 private float price;
	 private int publishyear;

	 public void setTitle(String title) {
		 this.title=title;
	 }
	 public String getTitle() {
		 return title;
	 }
	 public void setPrice(float price) {
		 this.price=price;
	 }
	 public float getPrice() {
		 return price;
	 }
	 public void setPublishyear(int publishyear) {
		 this.publishyear=publishyear;
	 }
	 public int getPublishyear() {
		 return publishyear;
	 }
	 public int getTotalYear() {
		 return Year.now().getValue()-getPublishyear();
	 }
	 public String toString(){
		return ("Title: ["+this.title+"] published for ["+this.getTotalYear()+"] year ("+this.price+")");
	 }
}
