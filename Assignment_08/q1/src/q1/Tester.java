package q1;

import java.util.Scanner;

public class Tester {
	Scanner sc = new Scanner(System.in);

	public static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("1-add Book");
		System.out.println("2-add Album");
		System.out.println("3-add Toy");
		System.out.println("4-display bill");
		System.out.println("5-display revenue");

		choice = sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		int indexOfarr=0;
         shop arr[]= new shop[5];
//          arr[0]=new Book();
//          arr[0].acceptData();
//          arr[1]=new Album();
//          arr[1].acceptData();
//          arr[1].displayData();
          
         while((choice=menu())!=0)
         {
        	 switch (choice) {
			case 1:
				if(indexOfarr==5)
				{
					System.out.println("you cannot add more than 5 products!");
				}
				else {
				 arr[indexOfarr]=new Book();
					arr[indexOfarr].acceptData();
				 indexOfarr++;
				}
				break;
			case 2:
				if(indexOfarr==5)
				{
					System.out.println("you cannot add more than 5 products!");
				}
				else {
					arr[indexOfarr]=new Album();
					arr[indexOfarr].acceptData();
					 indexOfarr++;
				}
				break;
			case 3:
				if(indexOfarr==5)
				{
					System.out.println("you cannot add more than 5 products!");
				}
				else {
					arr[indexOfarr]=new Toy();
					arr[indexOfarr].acceptData();
					 indexOfarr++;
				}

				break;
			case 4:
				double totalSum=0;
				for(int i=0;i<indexOfarr;i++)
				{
					totalSum=totalSum + arr[i].totalBill(true);
				}
				System.out.println("total amount is :"+totalSum);
			break;
        	 case 5:
        		 double totalRevenue=0;
        		 for(int i=0;i<indexOfarr;i++)
 				{
 					totalRevenue=totalRevenue + arr[i].totalBill(false);
 				}
 				System.out.println("total revenue is :"+totalRevenue);
         }
          
         
	}
         
	}
	
}

