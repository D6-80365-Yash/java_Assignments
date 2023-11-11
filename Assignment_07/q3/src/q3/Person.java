package q1;

import java.util.Scanner;

public class Person implements Cloneable  {
	private String name;
	private int weight;
	private Date birth;
	public Person(String name, int weight, Date birth) {
		super();
		this.name = name;
		this.weight = weight;
		this.birth = birth;
	}
	Scanner sc=new Scanner(System.in);
	public void acceptData()
	{
	System.out.println("enter name :");	
	name=sc.next();
	System.out.println("enter weight  :");
	weight=sc.nextInt();
	birth.acceptDate();
	
	}
	public Person() {
		super();
		
	}
	public void setMonth(int month)
	{
		birth.setMonth(month);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", birth=" + birth + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp=(Person) super.clone();
		temp.birth=(Date) birth.clone();
		
		return temp;
	}
	
}
