//. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
//3rd level sorting should be on name (asc).
//class Student {
//private int roll;
//private String name;
//private String city;
//private double marks;
//// ...
//}
package q2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

 
 
 
		
		class camparatorforstudent implements Comparator<student>{
			
			@Override
			public int compare(student o1, student o2) {
			    int diff=o1.getCity().compareTo(o2.getCity());
			    if(diff==0)
			    {
			    	diff=-Double.compare(o1.getMarks(), o2.getMarks());
			    }
			    if(diff==0)
			    {
			    	diff=o1.getName().compareTo(o2.getName());
			    }
				return diff;
			}
		}
 
public class student {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public int getRoll() {
		return roll;
	}
	
	
	public student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		student []arr= new student[]{
			new student(1, "yash", "satara", 10.5),
			new student(1, "amar", "solapur", 20.5),
			new student(1, "pratik", "satara", 10.5),
			new student(1, "mehul", "satara", 10.7),
			new student(1, "ritesh", "jalgaon", 10.8),
			new student(1, "yash", "buldhana", 10.9)

		};
		
		
		Arrays.sort(arr,new camparatorforstudent() );
		for(student ele:arr)
		{
			System.out.println(ele);
		}
	

}
 }
