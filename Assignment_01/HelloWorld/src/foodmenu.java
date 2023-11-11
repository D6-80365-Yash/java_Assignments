import java.util.Scanner;

public class foodmenu {
  static int menu()
	{
	  int choice;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("exit 0");
	  System.out.println("1 Dosa");
	  System.out.println("2 samosa");
	  System.out.println("3 bill");
	
	  
	  System.out.println("enter choice");
	  choice=sc.nextInt();
	 return choice;	
	}

	public static void main(String[] args) {

		int choice;
		int total=0;
		Scanner sc= new Scanner(System.in);

      while((choice=menu())!=0)
      {
    	  switch (choice) {
		case 1:
		     System.out.println("dosa price :40");
		     System.out.println("Enter qty");
             int qty=sc.nextInt();
             total=total+40*qty;
			break;
		case 2:
		     System.out.println("Samosa price :20");
		     System.out.println("Enter qty");
            int qty1=sc.nextInt();
            total=total+20*qty1;
			break;
		case 3:
			System.out.println("total amount is "+total);
			break;
		default:
		}
      }
	

	}

}
