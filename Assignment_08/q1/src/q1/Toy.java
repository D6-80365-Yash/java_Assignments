//title, price, age group (string), type
package q1;

import java.util.Scanner;

public class Toy  extends shop{
   private String title;
   private String agegroup  ;
   private int price;
   private int qty;
   Scanner sc =new Scanner(System.in);
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAgegroup() {
	return agegroup;
}
public void setAgegroup(String agegroup) {
	this.agegroup = agegroup;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
 @Override
	void acceptData() {
	 System.out.println("Enter Title :");
		setTitle(sc.next());
		System.out.println("Enter Agegroup :");
		setAgegroup(sc.next());
		System.out.println("Enter Price :");
		setPrice(sc.nextInt());
		System.out.println("Enter qty :");
		setQty(sc.nextInt());
		
	}  
 @Override
	void displayData() {
		System.out.println("Title :"+getTitle());
		System.out.println("agegroup :"+getAgegroup());
		System.out.println("Price:"+getPrice());
		System.out.println("Qty :"+getQty());
	}
  
 @Override
	double totalBill(boolean b) {
	 double bill=qty*price;
	 if(b==true)
	 {
		 return bill+(qty*price*0.05);
	 }
	 else
	 {
		 return bill;
	 }
		
	}
   
}
