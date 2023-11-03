package q1;

public class Testfunctionality {

	 public static void main(String args[])
	    {
//	    	Collection<String> c = new ArrayList<>(); null allowed
//	 	      Collection<String> c = new HashSet<>(); only one null allowed come at first in sorted order
//	    	Collection<String> c = new LinkedHashSet<>(); only one null allowed
//	    	Collection<String> c = new TreeSet<>(); null pointer exception
	    	c.add("B");
	    	c.add("D");
	    	c.add("A");
	    	c.add("C");
	    	c.add(null);
	    	c.add(null);
	    	c.add(null);
	    	System.out.println(c.toString());	
	    }

}
