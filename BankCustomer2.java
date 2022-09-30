//Bankcustomer class with acno,atype,amt fields using constructor overloading?
//Author = zaid khan
//date = 29/09/22
import java.util.*;
class BankAcc
{
	String atype;
	int accNo,amt; 
//first constructor
BankAcc()
	{
		System.out.println(" your Bank Details");
		
	}
	
	//second constructor
	BankAcc(int accNo,String atype, int amt)
	{
		 
		 this.accNo= accNo;
		 this.atype = atype;
		 this.amt = amt;
		
	}
	void printDetails()
	{
		 System.out.println(" account number:" + accNo);
		 System.out.println(" account type:" + atype);
		 System.out.println(" account amount:" + amt);
	}
}
	class BankCustomer2
	{
		public static void main(String [] args)
		{
			BankAcc a = new BankAcc();
			BankAcc b = new BankAcc(123456678,"saving",20000);
			
			b.printDetails();
			
			
		}
	}