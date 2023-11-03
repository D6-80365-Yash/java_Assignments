package q6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class TesterHashMap {

	public static void main(String[] args) {
		HashMap<String, Book> h = new HashMap<String, Book>();

		 Book b1=new Book("ISBN1",4.5,"ajay kumar",100,1);
		   Book b2=new Book("ISBN2",8.3,"yash",200,2);
		   Book b3=new Book("ISBN3",7.5,"amar",1040,3);
		   Book b4=new Book("ISBN4",6.5,"mehul",1900,4);
		   Book b5=new Book("ISBN5",5.5,"pratik",500,5);
	    Book b6 =new Book("ISBN5",5.5,"pratik",500,5);
         
	    h.put("ISBN1", b1);
	    h.put("ISBN2", b2);
	    h.put("ISBN3", b3);
	    h.put("ISBN4", b4);
	    h.put("ISBN5", b5);
	    
	      Set<Entry<String, Book>> entries   =h.entrySet();
	      for(  Entry<String,Book> en:entries)
	      {
	    	  System.out.println(en.getKey()+"---"+en.getValue());
	      }

	    
	   
	}

}
