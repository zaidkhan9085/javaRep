//create package "anudip" to store "Bankcustomer" class  details and access into another package "anudip2"?
package Anudip;
import java.util.*;
public class Bankcustomer
{
	Scanner sc = new Scanner(System.in);
	String accType;
	int amount;
	int accNo;
	public void BankDetails()
	{
		 accType = sc.next(); 
		 amount = sc.nextInt();
		 accNo = sc.nextInt();
	}
}

