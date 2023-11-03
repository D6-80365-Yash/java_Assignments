//In treeset duplicate values will not be added in treeset (NOT NEED TO WRITE EQUALS AND HASHCODE METHOD)
//but you need to override Tocampare method for sorting purpose beacause treeset will print result in sorting order
package q4;

import java.util.Iterator;
import java.util.TreeSet;



public class TestTreeSetfunctionality {

	public static void main(String[] args) {
		TreeSet<Book> t= new TreeSet();
		 Book b1=new Book("ISBN1",4.5,"ajay kumar",100,1);
		   Book b2=new Book("ISBN2",8.3,"yash",200,2);
		   Book b3=new Book("ISBN3",7.5,"amar",1040,3);
		   Book b4=new Book("ISBN4",6.5,"mehul",1900,4);
		   Book b5=new Book("ISBN5",5.5,"pratik",500,5);
	      Book b6 =new Book("ISBN5",5.5,"pratik",500,5);
	      t.add(b5);
	      t.add(b4);
	      t.add(b1);
		   t.add(b2);
		   t.add(b3);
		   t.add(b6);
		   
		   Iterator<Book> itr= t.iterator();
		   while(itr.hasNext())
		   {
			 Book ele=  itr.next();
			 System.out.println(ele);
		   }
	}

}
