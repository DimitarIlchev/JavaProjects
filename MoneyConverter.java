import java.util.Scanner;

public class MoneyConverter {
	
	public static void main(String[] args) 
	{
		/*Reads the Amount entered from the user and converts that amount to
		* dollar denominations.*/
		
		// Declaring variables to hold each currency
		double originalAmount = 0.0;
		int amountInPennies = 0;
		int remainBalance = 0;
		int tenDollar = 0;
		int fiveDollar = 0;
		int oneDollar = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		Scanner scan = new Scanner(System.in);
		
		//prints out Enter monetary amount: and user inputs the amount they desire.
		System.out.print("Enter monetary amount: ");
		originalAmount = scan.nextDouble();
		
		//Prints out That's the equivalent to:
		System.out.println("That's the equivalent to:");
		
		//convert original amount to pennies
		amountInPennies = (int) (originalAmount * 100); 
		//Find how many $10 bills
		tenDollar =  amountInPennies / 1000;
		//Find the remainder
		remainBalance = amountInPennies % 1000;
		//Print amount to user
		System.out.println(tenDollar + " ten dollar bills");
		
		//Find how many $5 bills
		fiveDollar = remainBalance / 500;
		//Find the remainder
		remainBalance = remainBalance % 500;
		//Print amount to user
		System.out.println(fiveDollar + " five dollar bills");
		
		//Find how many $1 bills
		oneDollar = remainBalance / 100;
		//Find the remainder
		remainBalance = remainBalance % 100;
		//Print amount to user
		System.out.println(oneDollar + " one dollar bills");
		
		//Find how many quarters
		quarter = remainBalance / 25;
		//Find the remainder
		remainBalance = remainBalance % 25;
		//Print amount to user
		System.out.println(quarter + " quarters");
		
		//Find how many dimes
		dime = remainBalance / 10;
		//Find the remainder
		remainBalance = remainBalance % 10;
		//Print amount to user
		System.out.println(dime + " dimes");
		
		//Find how many nickels
		nickel = remainBalance / 5;
		//Find the remainder
		remainBalance = remainBalance % 5;
		//Print amount to user
		System.out.println(nickel + " nickels");
		
		//Find how many pennies
		penny = remainBalance / 1;
		//Find the remainder
		remainBalance = remainBalance % 1;
		//Print amount to user
		System.out.println(penny + " pennies");
		
		
	}


}
