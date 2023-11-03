package q5;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>
{

private String ISBN;
private double price;
private String authorName;
private int quantity;
private int id;
Scanner sc= new Scanner(System.in);






public Book(String iSBN, double price, String authorName, int quantity, int id) {
	super();
	ISBN = iSBN;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
	this.id = id;
}


  @Override
	public int compareTo(Book o) {
		    
		         int diff=this.ISBN.compareTo(o.ISBN);
		return diff;
	}


//@Override
//public int hashCode() {
//	return Objects.hash(ISBN);
//}
//
//
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(ISBN, other.ISBN);
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Book() {
	super();
	
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


@Override
public String toString() {
	return "Book [ISBN=" + ISBN + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + ", id="
			+ id + "]";
}

public void acceptData()
{
	System.out.println("Enter id");
	id= sc.nextInt();
	System.out.println("Enter ISBN no");
	ISBN= sc.next();
	System.out.println("Enter author name");
	authorName= sc.next();
	System.out.println("Enter price");
	price= sc.nextDouble();
	System.out.println("Enter qty");
	quantity= sc.nextInt();
}


}

