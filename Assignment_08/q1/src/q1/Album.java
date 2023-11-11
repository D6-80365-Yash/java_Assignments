package q1;

import java.util.Scanner;

// title, price, singer, and musician.
public class Album extends shop {
	private String title;
	private int price;
	private String singer;
	private String musician;
	private int qty;
   Scanner sc= new Scanner(System.in);
   
   
   
   
   public Album() {
	super();
	
}

public Album(String title, int price, String singer, String musician, int qty) {
	super();
	this.title = title;
	this.price = price;
	this.singer = singer;
	this.musician = musician;
	this.qty = qty;
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}
	

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	double totalBill(boolean b) {
		
         double bill=qty*price;
         if(b==true)
         {
        	 return bill+(qty*price*0.10);
         }
         else
         {
        	 return bill;
         }
	}

	@Override
	void acceptData() {
		System.out.println("Enter Title :");
		setTitle(sc.next());
		System.out.println("Enter Singer :");
		setSinger(sc.next());
		System.out.println("Enter Musician :");
		setMusician(sc.next());
		System.out.println("Enter Qty :");
		setQty(sc.nextInt());
		System.out.println("Enter Price :");
		setPrice(sc.nextInt());
		
	}

	@Override
	void displayData() {
		System.out.println("Title :"+getTitle());
		System.out.println("Singer :"+getSinger());
		System.out.println("muscian :"+getMusician());
		System.out.println("Title :"+getTitle());
		System.out.println("Price:"+getPrice());
		System.out.println("Qty :"+getQty());
	}

}
