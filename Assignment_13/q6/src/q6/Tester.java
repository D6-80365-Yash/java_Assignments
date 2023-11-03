package q6;

public class Tester {

	public static void main(String[] args) {
	    Emp []arr=new Emp [3];
       
       arr[0]=new Manager(10000,500);
       arr[1]=new Labor(12,100);
       arr[2]=new Clerk(5000);
       System.out.println(Emp.calcTotalIncome(arr));
      
	}

}
