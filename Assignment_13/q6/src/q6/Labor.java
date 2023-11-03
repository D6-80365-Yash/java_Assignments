package q6;

public class Labor  implements Emp{
   int hour;
   double rate;
   @Override
	public double getSal() {
		// TODO Auto-generated method stub
		return hour*rate;
	}
   @Override
	public double calcIncentives() {
		if(hour>300)
		{
			return 0.5*hour*rate;
		}
		return 0.0;
	}
public Labor(int hour, double rate) {
	super();
	this.hour = hour;
	this.rate = rate;
}
}
