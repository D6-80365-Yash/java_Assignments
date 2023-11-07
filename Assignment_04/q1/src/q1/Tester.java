package q1;

import java.util.Scanner;

public class Tester {
	public static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("0-EXIT");
		System.out.println("1-add mango");
		System.out.println("2-add apple");
		System.out.println("3-displat all names of fruits in basket");
		System.out.println("4-display name of fruits");
		System.out.println("5-dsiplay details of fresh fruit");
		System.out.println("6-Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("7-mark stale fruit");
		System.out.println("enter choice");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
//		Apple a=new Apple("red,",40,"apple",true);
//		a.acceptdata();
//		String s=a.toString();
//		System.out.println(s);
//        for(int i=0;i<noOfFruits;i++)
//        {
//        arr[i]=new Fruit();
//        arr[i].acceptdata();
//       String s= arr[i].toString();
//       System.out.println(s);

		System.out.println("Enter number of fruits you want to include");
		int noOfFruits = sc.nextInt();
		int indexOfarr = 0;
		Fruit arr[] = new Fruit[noOfFruits];
		while ((choice = menu()) != 0) {
			switch(choice) {

			case 1:
				if(noOfFruits==indexOfarr)
				{
					System.out.println("cannot add more fruits !");
					
				}
				else
				{
			
					arr[indexOfarr] = new Apple();
					arr[indexOfarr].acceptdata();
					
					indexOfarr++;
				
				}
				
				break;
			case 2:
				if(noOfFruits==indexOfarr)
				{
					System.out.println("cannot add more fruits !");
					
				}
				else {
				arr[indexOfarr] = new mango();
				arr[indexOfarr].acceptdata();
				indexOfarr++;
				}
				
			case 3:
				for (int i = 0; i < indexOfarr; i++) {
					System.out.println(arr[i]);
				}
				break;
			case 4:
				for (int i = 0; i < indexOfarr; i++) {
					System.out.println(arr[i].name);
				}
				break;
			case 5:
				
				for(int i=0;i<indexOfarr;i++)
				{
					if(arr[i].isFresh==true)
					{
						System.out.println(arr[i]);
					}
				}
				break;
			case 6:
				for(int i=0;i<indexOfarr;i++)
				{
					if(arr[i].isFresh==false)
					{
						System.out.println(arr[i].taste()+":"+arr[i].name);
					}
				}
				break;
			case 7:
				System.out.println("enter index of fruit which is stale: ");
				int stalefruit = sc.nextInt();
				arr[stalefruit].isFresh = false;
				System.out.println("Fruit of index "+stalefruit+"marked as stale fruit");
			default:
				break;
			}
		}
	}
}
