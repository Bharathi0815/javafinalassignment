package org.bharathi;
import java.util.Scanner;

public class Assignment2 {

	

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int i=scan.nextInt();
		while(i<0)
		{
			System.out.println("You entered Negative number "+i);	
			System.out.println("Enter an Integer");
			i=scan.nextInt();
		}
		
		System.out.println("Number you entered is "+i);	
		
}
}