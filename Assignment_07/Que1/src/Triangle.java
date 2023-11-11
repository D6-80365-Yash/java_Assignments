import java.lang.Math;
public class Triangle extends Polygon {
    private int side1;
    private int side2;
    private int side3;
    @Override
    
    public double calcArea() {
    	double s=(side1+side2+side3)/2;
    	double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    	return area;
    }
	public Triangle(int side1, int side2, int side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
}
