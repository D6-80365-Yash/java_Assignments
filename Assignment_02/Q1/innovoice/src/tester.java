import java.util.Scanner;

import innovoice.*;
public class tester {

  
	public static void main(String[] args) {
	
	Invoice iv=new Invoice("xfg","xdgf",14,500);
    	iv.acceptData();
    
  System.out.println(iv.displayBill());
	}

}
