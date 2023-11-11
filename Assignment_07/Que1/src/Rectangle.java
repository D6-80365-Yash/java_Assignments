
public class Rectangle extends Polygon {
	private int length;
	private int breadth;
	
	@Override
	public double calcArea() {
	   double area=2*(length+breadth);
		return area;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int numberOfSides) {
		super(numberOfSides);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int numberOfSides, int length, int breadth) {
		super(numberOfSides);
		this.length = length;
		this.breadth = breadth;
	}

}
