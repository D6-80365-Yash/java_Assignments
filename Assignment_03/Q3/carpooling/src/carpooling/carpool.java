package carpooling;
import java.util.Scanner;
public class carpool {
 int miles;
  static int costPerGallon;
  int averageperGallon;
  static int parkingFee=50;
  static int tollFee=20;
public int getMiles() {
	return miles;
}
public void setMiles(int miles) {
	this.miles = miles;
}
public static int getCostPerGallon() {
	return costPerGallon;
}
public static void setCostPerGallon(int costPerGallon) {
	carpool.costPerGallon = costPerGallon;
}
public int getAverageperGallon() {
	return averageperGallon;
}
public void setAverageperGallon(int averageperGallon) {
	this.averageperGallon = averageperGallon;
}
Scanner sc=new Scanner(System.in);
public void acceptData()
{
	System.out.println("enter total miles driven per day");
	miles=sc.nextInt();
	setMiles(miles);
	System.out.println("enter cost per gallon");
	costPerGallon=sc.nextInt();
	setCostPerGallon(costPerGallon);
	System.out.println("enter average per gallon");
	averageperGallon=sc.nextInt();
	setAverageperGallon(averageperGallon);
}
 
public void displayCost()
{
	double finalcost=(costPerGallon*miles)/averageperGallon+parkingFee+tollFee;
	System.out.println("total cost is "+finalcost);
}
}
