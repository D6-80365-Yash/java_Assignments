import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	int choice;
	int num;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");
	num=sc.nextInt();
	System.out.println("enter you choice");
	
	
	System.out.println("0 exit");
	System.out.println("1 check");	
	
	choice=sc.nextInt();
	
   switch (choice) {
case 1:
	   if(num<0)
	   {
		   System.out.println("negative");
	   }
	   if (num>0) {
		System.out.println("positive");
	}
	break;

default:
	break;
}
	}

}
