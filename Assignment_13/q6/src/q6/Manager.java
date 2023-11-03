package q6;

public class Manager implements Emp {
  double basicSalary;
  double dearanceAllowance;
    @Override
    	public double getSal() {
    		// TODO Auto-generated method stub
    		return basicSalary+dearanceAllowance;
    	}
   @Override
	public double calcIncentives() {
		
		return (0.2)*basicSalary;
	}
public Manager(double basicSalary, double dearanceAllowance) {
	super();
	this.basicSalary = basicSalary;
	this.dearanceAllowance = dearanceAllowance;
}
   
}
