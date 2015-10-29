import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	
		//Declaring variables
		int num1, num2, choice1; 
		double result = 0;
		final int ADDITION = 1, SUBTRACTION = 2, MULTIPLICATION = 3,DIVISION = 4, EXIT = 5;
		String sign1 = null;
		
		Scanner scan = new Scanner(System.in);
		
		//Set up loop so the code repeats until terminated.
		do {
		
		//Gives user 5 choices
		System.out.println("Choose from the following: ");
		System.out.println("1. Add 2 integers");
		System.out.println("2. Subtract 2 integers");
		System.out.println("3. Multiply 2 integers");
		System.out.println("4. Divide 2 integers");
		System.out.println("5. Exit");
		//Asks user to input choice
		System.out.print("Enter choice: ");
		choice1 = scan.nextInt();
		
		
		
		//Depending what choice they choose it will print out the proper operation sign.
		if (choice1 == 1)
		{
			sign1 = "+";
		} 
		else if (choice1 == 2)
		{
			sign1 = "-";
		}
		else if ( choice1 == 3) 
		{
			sign1 = "*";
		}
		else if ( choice1 == 4) 
		{
			sign1 = "/";
		}
		else if ( choice1 == 5)
		{
			break;
		}
		
		
		//Asks user to input 2 integers
		System.out.print("Enter first integer: ");
		num1 = scan.nextInt();
		System.out.print("Enter second integer: ");
		num2 = scan.nextInt();
		
		
		switch ( choice1){
	case 1:
		//Add 2 integers
        result= num1+num2;
        break;
    case 2:
    	//Subtract 2 integers
        result= num1-num2;
        break;
    case 3:
    	//Multiply 2 integers
        result= num1*num2;
        break;
    case 4:
    	//Divide 2 integers
        result = (double) num1/num2;
        break;
        }
		
		
		//Prints out the answer to the user
		System.out.println(num1 + " "+ sign1 +" " + num2 + " = " + result);
		System.out.println();
		
		}while (choice1 <= 4);
		
		

	}

}
