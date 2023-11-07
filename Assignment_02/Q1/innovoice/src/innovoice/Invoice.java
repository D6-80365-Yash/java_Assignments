package innovoice;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Invoice {
	
    String part_number;
    String part_desc;
   int qty;
   double price;
   
 public  Invoice(String partNumber,String partDesc,int qty,double price)
   {
	   this.part_number=partNumber;
	   this.part_desc=partDesc;
	   this.qty=qty;
	   this.price=price;
	   
   }
  
   
    void setPartNumber( String part_number)
    {
     part_number= new Scanner(System.in).next();    	
    }
    
    String  getPartNumber()
    {
       return this.part_number;	
    }
    
    void setqty(int qty)
    {
    	if(qty<0)
    	{
    		this.qty=0;
    	}
     this.qty=qty;    	
    }
    
    int  getqty()
    {
       return this.qty;	
    }
    
    void setprice(double price)
    {
    	if(price<0)
    	{
    		this.price=0;
    	}
     this.price=price;    	
    }
    
    double  getprice()
    {
       return this.price;	
    }
    
   public   void acceptData()
    {
    	System.out.println("enter part number");
    	 this.part_number=new Scanner(System.in).next();
    	System.out.println("enter part qty");
    	this.qty=new Scanner(System.in).nextInt();
    	if(qty<0)
    	{
    		qty=0;
    	}
    	System.out.println("enter part price");
    	if(price<0)
    	{
    		price=0;
    	}
    	this.price=new Scanner(System.in).nextDouble();

    }
    
  public  double displayBill()
    {
    	return this.price*this.qty;
    }
    
    
    
}
