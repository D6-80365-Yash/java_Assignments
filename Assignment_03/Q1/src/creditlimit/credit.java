package creditlimit;
import java.util.Scanner;
public class credit {
    int accountNumber;
    int pendingBalance;
    int charges;
    int credits;
    int newBalance;
    int allowedCredit;
	public int getAllowedCredit() {
		return allowedCredit;
	}
	public void setAllowedCredit(int allowedCredit) {
		this.allowedCredit = allowedCredit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPendingBalance() {
		return pendingBalance;
	}
	public void setPendingBalance(int pendingBalance) {
		this.pendingBalance = pendingBalance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(int newBalance) {
		this.newBalance = newBalance;
	}
	Scanner sc= new Scanner(System.in);
	 public void Acceptdata()
	 {
		 System.out.println("enter account number");
		 accountNumber= sc.nextInt();
		 setAccountNumber(accountNumber);
		 System.out.println("enter pending balance: ");
		 pendingBalance=sc.nextInt();
		 setPendingBalance(pendingBalance);
		 System.out.println("enter charges ");
		 charges=sc.nextInt();
		 setCharges(charges);
		 System.out.println("enter credits applied");
		 credits=sc.nextInt();
		 setCredits(credits);
		 System.out.println("enter allowed credit");
		 allowedCredit=sc.nextInt();
		 setAllowedCredit(allowedCredit);
	 }
	public void check()
	{
	   newBalance=	pendingBalance+charges-credits;
	   if(newBalance<allowedCredit)
	   {
		System.out.println("new balance "+newBalance+"   :allowed");   
	   }
	   else
	   {
		   System.out.println("new balance"+newBalance);
		   System.out.println("credit limit exceed");
	   }
	}
    
    
}
