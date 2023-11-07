package point2d;
import java.lang.Math;


public class tester {
	 public static boolean isEqualpoint(point2D p1,point2D p2)
		{ 
		 
		if(p1.getX()==p2.getX() && p1.getY()==p2.getY())
		{
			System.out.println("points are same!");
		return true;	
		}
		else return false;
		}
	 public static double calculateDistance(point2D p1,point2D p2)
	 {
      double distance=  ( Math.sqrt(  Math.pow((p1.x-p2.x), 2) +(Math.pow((p1.y-p2.y), 2))));
      return distance;		 
	 }
	
	public static void main(String[] args) {
		point2D p1=new point2D(0,0);
		p1.acceptPoint();
		String s=p1.getDetails();
		System.out.println(s);
		
		point2D p2=new point2D(0,0);
		p2.acceptPoint();
		s=p2.getDetails();
		System.out.println(s);
	    if(false== isEqualpoint(p1,p2))
	    {
	    	 double distance=calculateDistance( p1, p2);
	    	 System.out.println("distance between "+p1.getDetails()+"and "+p2.getDetails()+" is "+distance);
	    }
	    
	   
	    
	}

}
