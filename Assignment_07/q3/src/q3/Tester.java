package q1;

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Date d1;// = new Date(1, 2, 2001);
		Person p1 = new Person("yash", 34, new Date(1,2,3));
		System.out.println(p1.toString());
//	System.out.println(d1.toString());
		
//		Date d2 = (Date) d1.clone(); 
//		System.out.println(d2.toString());
		Person p2= (Person)p1.clone();
		System.out.println(p2.toString());
		p1.setName("ayush");
		p1.setMonth(99);
System.out.println(p1.toString());
System.out.println(p2.toString());
		

	}

}
