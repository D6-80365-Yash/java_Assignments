package q6;

public interface Emp {
    double getSal();
    default double calcIncentives()
    {
    	return 0.0;
    }
    static double calcTotalIncome(Emp arr[])
    {
    	double totalsalary=0.0;
    	for(Emp ele:arr)
    	{
    		totalsalary=totalsalary+ele.getSal()+ele.calcIncentives();
    	}
    	return totalsalary;
    			
    }
}
