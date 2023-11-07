package point2d;
import java.util.Objects;
import java.util.Scanner;
public class point2D {
 int x;
 int y;
 Scanner sc= new Scanner(System.in);
public point2D(int x, int y) {
	
	this.x = x;
	this.y = y;
}
public String getDetails()
{
	String s="coordinate "+"("+x+","+y+")";
	return s;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
 public void acceptPoint()
 {
	 System.out.println("enter x co ordeinate");
      this.x=sc.nextInt();
      System.out.println("enter y co ordinate");
      this.y=sc.nextInt();
 }

}


