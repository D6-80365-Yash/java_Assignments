
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Polygon p=new Triangle(6,8,10);
      System.out.println(p.calcArea());
      p=new Square(4,16);
      System.out.println(p.calcArea());
      p=new Rectangle(2,4,5);
      System.out.println(p.calcArea());
      
	}

}
