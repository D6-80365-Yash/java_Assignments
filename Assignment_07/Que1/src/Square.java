
public class Square extends Polygon {
private int side;


public Square() {
	super();
	
}


public Square(int numberOfSides) {
	super(numberOfSides);
	
}


public Square(int numberOfSides, int side) {
	super(numberOfSides);
	this.side = side;
}


@Override
	public double calcArea() {
		double area=side*side;
		return area;
	}
}
