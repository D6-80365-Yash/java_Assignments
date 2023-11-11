package q1;

import java.util.Scanner;

public class Date implements Cloneable {
   private int day;
   private int month;
   private int year;
   
   
public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}



public Date() {
	super();
	// TODO Auto-generated constructor stub
}



public int getDay() {
	return day;
}


public void setDay(int day) {
	this.day = day;
}


public int getMonth() {
	return month;
}


public void setMonth(int month) {
	this.month = month;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


@Override
public String toString() {
	return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}
Scanner sc=new Scanner(System.in);
@Override
	public Object clone() throws CloneNotSupportedException {
		Date temp =(Date) super.clone();
		return temp;
	}

public void acceptDate()
{
   System.out.println("enter day");
   day=sc.nextInt();
   System.out.println("enter month");
   month=sc.nextInt();
   System.out.println("enter year");
   year=sc.nextInt();
}
   
   
   
   
}
