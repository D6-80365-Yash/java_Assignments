package q3;
//YOU  can solve the problem of duplicate values in Linkedhashset by overrriding EQUALS AND HASHCODE methon in class
//In displaying method you will get order in which you have inserted entry
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashset {

	public static void main(String[] args) {

		LinkedHashSet<Book> l = new LinkedHashSet<Book>();

		Book b1 = new Book("ISBN1", 4.5, "ajay kumar", 100, 1);
		Book b2 = new Book("ISBN2", 8.3, "yash", 200, 2);
		Book b3 = new Book("ISBN3", 7.5, "amar", 1040, 3);
		Book b4 = new Book("ISBN4", 6.5, "mehul", 1900, 4);
		Book b5 = new Book("ISBN5", 5.5, "pratika", 500, 5);
		Book b6 = new Book("ISBN5", 5.5, "pratik", 500, 5);

		l.add(b4);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b5);
		l.add(b6);
		Iterator<Book> itr= l.iterator();
		while(itr.hasNext())
		{
		   Book	ele=itr.next();
		   System.out.println(ele);
		}

	}

}
