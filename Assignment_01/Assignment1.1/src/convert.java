import java.util.Scanner;

public class convert {
        public static void main(String[] args)
        {
        	int num;
        	 Scanner sc= new Scanner (System.in);
        	 System.out.println("enter number");
              			 
        	 num=sc.nextInt();
        System.out.println("given number "+num); 
        String s=Integer.toBinaryString(num);
        System.out.println("Binary equivalent :"+s);
        s=Integer.toOctalString(num);
        System.out.println("Octalexadecimal equivalent :"+s);
        }
}
