package exercise2;

import java.util.Scanner;

/**
 * @author Waynell Lovell
 *
 */
public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		
		Account defaultaccount = new Account(1001,"Bill",100.00);
		
		System.out.println(defaultaccount.getAccountInfo());
		
		System.out.print("Account Options: (1) Withdraw from account; (2) Deposit from account: ");
		switch (userinput.nextInt())
		{
		case 1:
			System.out.print("How much do you want to withdraw from Account?:");
			if(defaultaccount.withdraw(userinput.nextInt()))
			{
				System.out.println(defaultaccount.getAccountInfo());
			}
			else
			{
				System.out.println("Withdrawl amount exceeded account balance");
			}
			break;
		case 2:
			System.out.print("How much do you want to deposit to Account?:");
			if(defaultaccount.deposit(userinput.nextInt()))
			{
				System.out.println(defaultaccount.getAccountInfo());
			}
			else
			{
				System.out.println("Incorrect amount.\nPlease try again");
			}
			break;
		default:
			System.out.println("You did not chose an option");
			break;
		}
	}

}
