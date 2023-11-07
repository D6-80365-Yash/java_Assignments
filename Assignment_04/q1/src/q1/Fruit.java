//Q1 Apply inheritance n polymorphism
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
//b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
//c) Add suitable constructors.
//d) Override toString correctly to return state of all fruits (including : name ,color , weight )
//e) Add a taste() method : public String taste()
//For Fruit : it should return "no specific taste"
//Apple : should return "sweet n sour"
//Mango : should return "sweet"
//Orange : should return "sour"
//f) Add all of above classes under the package "com.app.fruits"
//g) Create java application FruitBasket , with main method , as a tester
//h) Prompt user for the basket size n create suitable data structure and give options
package q1;

import java.util.Scanner;

public class Fruit {
	String color;
     double weight;
     String name;
     boolean isFresh =true;
     Scanner sc=new Scanner(System.in);
     public Fruit() {
 		super();
 		
 	}
     
     
 	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
 	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	 public String taste()
	 {
		 String taste="no specific taste";
		 return taste;
	 }
	  public void acceptdata()
	  {
		  System.out.println("Enter fruit name: ");
		  name=sc.next();
		  System.out.println("Enter color :");
		  color=sc.next();
		  System.out.println("Enter Weight:");
		  weight=sc.nextDouble();
	  }

	
}
