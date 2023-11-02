//. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven (do-while + switch-case) program to
//1. Add new book in list.
//2. Display all books in forward order.
//3. Delete book of given id
//4. Check if book with given isbn is in list or not
//5. Delete all books in list
//6. Display number of books in list

package q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Tester {
	
	public static Collection<Book> populate()
	{
		Collection<Book> c = new ArrayList<Book>();
		c.add(new Book("ab", 3,"aa", 3, 1));
		c.add(new Book("ab", 3,"aa", 3, 2));
		c.add(new Book("ab", 3,"aa", 3, 3));
		c.add(new Book("ab", 3,"aa", 3, 4));
       return c;
	}
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;

		System.out.println("1-add new book");
		System.out.println("2-Diplay all books");
		System.out.println("3-Delete secific book");
		System.out.println("4-check secific book");
		System.out.println("5-Delete all books");
       System.out.println("6-Display number of books");
		System.out.println("enter choice");
		choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		Collection<Book> c = populate();
		Scanner sc = new Scanner(System.in);

		int choice;
		int counter=0;
		
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Book b = new Book();
				b.acceptData();
				c.add(b);
				counter++;
				break;
			case 2:
				Iterator<Book> itr=c.iterator();
				
				while(itr.hasNext())
				{
					Book ele =itr.next();
					System.out.println(ele.toString());
				}
				break;
			case 3:
				System.out.println("enter id of book u want to delete");
				int id=sc.nextInt();
				Iterator<Book> itr1=c.iterator();
				while(itr1.hasNext())
				{
					Book ele =itr1.next();
					if(ele.getId()==id)
						{
							c.remove(ele);
						}
				}
//
//				for(Book ele:c)
//				{
//					if(ele.getId()==id)
//					{
//						c.remove(ele);
//					}
//				}
//				

				
			case 4:
				System.out.println("enter id of book you want to check");
			      id=sc.nextInt();
			      for(Book ele:c)
			      {
			    	  if(ele.getId()==id)
			    	  {
			    		  System.out.println("Book found");
			    		  System.out.println(ele.toString());
			    	  }
			    	  else
			    	  {
			    		  System.out.println("not found");
			    		  break;
			    	  }
			      }
			      
				break;
			case 5:
				  c.clear();
				  System.out.println(" All books are deleted !");
				  counter=0;
			case 6:
				System.out.println("There are "+counter+" Books");
			default:
				break;
			}
		}

	}

}
