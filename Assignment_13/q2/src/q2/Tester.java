package q2;
//YOU  can solve the problem of duplicate values in hashset by overrriding EQUALS AND HASHCODE methon in class
//you caanot get order of inserting hashset
import java.util.HashSet;
import java.util.Iterator;

public class Tester {
   public static void main(String args[])
   {
	   HashSet<Book> h= new HashSet<Book>();
	   Book b1=new Book("ISBN1",4.5,"ajay kumar",100,1);
	   Book b2=new Book("ISBN2",8.3,"yash",200,2);
	   Book b3=new Book("ISBN3",7.5,"amar",1040,3);
	   Book b4=new Book("ISBN4",6.5,"mehul",1900,4);
	   Book b5=new Book("ISBN5",5.5,"pratik",500,5);
      Book b6 =new Book("ISBN5",5.5,"pratik",500,5);
	   h.add(b1);
	   h.add(b2);
	   h.add(b3);
	   h.add(b4);
	   h.add(b5);
	   h.add(b6);
	   
	   h.add(b1);
	   Iterator<Book> itr=h.iterator();
	   while(itr.hasNext())
	   {
		   Book ele=itr.next();
		   System.out.println(ele);
	   }
     
       

   }
}
