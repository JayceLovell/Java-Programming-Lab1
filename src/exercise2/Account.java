/**
 * 
 */
package exercise2;

/**
 * @author Waynell Lovell
 *
 */
public class Account {
	private int accountNumber;
	private String ownerName;
	private double balance;
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw(double amount)
	{
		if(balance<amount)
		{
			return false;
		}
		else
		{
			balance-=amount;
			return true;
		}
	}
	
	public boolean deposit(double amount)
	{
		if(amount<=0)
		{
			return false;	
		}
		else
		{
			balance+=amount;
			return true;
		}
	}
	//Constructor
	public Account(int number,String name,double bal)
	{
		accountNumber=number;
		ownerName=name;
		balance=bal;
	}
	
	public String getAccountInfo()
	{
		
		String msg = String.format("Initial Bank Account Information:\n"
				+ "Account Number	Name	Balance\n"
				+ "----------------------------------\n"
				+ "%12d %7s	$%6.2f", accountNumber,ownerName,balance);
		return msg;
	}
}
