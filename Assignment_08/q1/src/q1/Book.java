package q1;
//ISBN, title, price, author, and subject

import java.util.Scanner;

public class Book extends shop {
	private int INBN;
	private int price;
	private String Title;
	private String author;
	private String subject;
	private int qty;
	Scanner sc = new Scanner(System.in);

	public int getINBN() {
		return INBN;
	}

	public void setINBN(int iNBN) {
		INBN = iNBN;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
	  double totalBill(boolean b) {
		 
       double billOfBook=qty*price;
       if(b==true) {
       return billOfBook;
       }
       else
       {
    	   return billOfBook;
       }
	}

	@Override
	void acceptData() {
		System.out.println("Enter ISBN :");
		setINBN(sc.nextInt());
		System.out.println("Enter Title :");
		setTitle(sc.next());
		System.out.println("Enter Price :");
		setPrice(sc.nextInt());
		System.out.println("Enter author :");
		setAuthor(sc.next());
		System.out.println("Enter Subject :");
		setSubject(sc.next());
		System.out.println("Enter Qty :");
		setQty(sc.nextInt());
	}
   @Override
void displayData() {
	System.out.println("ISBN: "+getINBN());
	System.out.println("Title :"+getTitle());
	System.out.println("Price:"+getPrice());
	System.out.println("Author :"+getAuthor());
	System.out.println("Subject :"+getSubject());
	System.out.println("Qty :"+getQty());
	
}
}
