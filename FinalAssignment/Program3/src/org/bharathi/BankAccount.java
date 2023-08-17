package org.bharathi;
import java.util.Scanner;

public class BankAccount {
	
	static Integer amount=0;
	static Integer deposit=0;
	static Integer withdraw=0;
	static Integer balance=0;
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Our Bank ");
		
		operations();
	}
	
	public  static void operations()
	{
		
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance check");
		int option=scan.nextInt();
		if(option==1)
		{
			System.out.println("Enter the amount to deposit ");
			 deposit=scan.nextInt();
			 balance=deposit+balance;
			 
		}
			else if(option==2)	
			{
				System.out.println("Enter the amount to withdraw ");
			 withdraw=scan.nextInt();
				balance=balance-withdraw;
			}
			
			else if(option==3)
			{
				
				System.out.println("Balance amount is "+balance);
				
				
				
			}
		System.out.println("Do you want to perform anyother operation Y/N");
		
		String c=scan.next();
	 if( c.equalsIgnoreCase("y"))
	 {
		 operations();
		 
	 }
	 else
	 {
		 System.out.println("Press Y or N ");
		 operations();
	 }
		
	 
	 
		
		
	}
	
	
	

}
