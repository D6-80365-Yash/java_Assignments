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

public class Apple extends Fruit{
	
	
public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	
	}
public Apple() {
	
}

@Override
public String taste() {
	String taste="sweet n sour";
	return taste;
}
@Override
	public void acceptdata() {
		super.acceptdata();
	}
@Override
	public String toString() {
	
		return super.toString();
	}
 
	
}
