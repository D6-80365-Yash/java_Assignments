package q6;

public class Clerk implements Emp{
   double salary;
   @Override
	public double getSal() {
		
		return salary;
	}
public Clerk(double salary) {
	super();
	this.salary = salary;
}
}
