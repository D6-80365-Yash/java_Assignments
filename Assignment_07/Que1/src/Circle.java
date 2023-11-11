
public class Circle extends BoundedShape {
	private int radius;
	
    @Override
    public double calcArea() {
    	double area=3.14*radius*radius;
    	return area;
    }

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
}
