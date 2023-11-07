package p1;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e1=null;
		System.out.println("enter first name");
		String firstname=sc.next();
		System.out.println("enter last name");
		String lastname=sc.next();
		System.out.println("enter salary");
		double salary = sc.nextDouble();


		if (salary > 0) {
		
		 e1 = new Employee(firstname, lastname, salary);
		} else {
			System.out.println("salary cannot be negative");
		}
		System.out.println("yearly salary : "+12*(e1.getSalary()));
	   	
		e1.setSalary((e1.getSalary())*10/100+e1.getSalary());
		System.out.println("updated salary :"+12*(e1.getSalary()));
	}
	
}
