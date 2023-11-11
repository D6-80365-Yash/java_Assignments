import java.util.Scanner;

public class floatingnumbers {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner sc= new Scanner(System.in);
			
		 float num1=0;
		 float num2;
		 if(sc.hasNextFloat())
		 {
			  num1=sc.nextFloat();	 
		 }
		 else
		 {
			 System.out.println("enter float value");
		 }
		 System.out.println("enter second number");
		 if(sc.hasNextFloat())
		 {
			  num2=sc.nextFloat();
			 System.out.println("average is"+((num1+num2)/2));
		 }
		 else
		 {
			 System.out.println("enter float value");
		 }
		 
        
	}

}
