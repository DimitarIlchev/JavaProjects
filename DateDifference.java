import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) {
		
		//Declaring variables
		int firstYear, secondYear,firstYearNumber,secondYearNumber,
		firstMonthNumber = 0, secondMonthNumber = 0, yearsDif = 0, monthsDif = 0;
		String firstMonth, secondMonth;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		//Asks user to input data
		System.out.println("For the first date,");
		System.out.print("Enter month: ");
		firstMonth = scan.nextLine();
		System.out.print("Enter year: ");
		firstYear = scan.nextInt();
		
		System.out.println();
		
		System.out.println("For the second date,");
		System.out.print("Enter month: ");
		secondMonth = scan1.nextLine();
		System.out.print("Enter year: ");
		secondYear = scan1.nextInt();
		
		//First month conversion
		if ( firstMonth.equalsIgnoreCase("January"))
		{
			firstMonthNumber = 1;
		} 
		else if ( firstMonth.equalsIgnoreCase("February")) 
		{
			firstMonthNumber = 2;
		}
		else if ( firstMonth.equalsIgnoreCase("March")) 
		{
			firstMonthNumber = 3;
		}
		else if ( firstMonth.equalsIgnoreCase("April")) 
		{
			firstMonthNumber = 4;
		}
		else if ( firstMonth.equalsIgnoreCase("May")) 
		{
			firstMonthNumber = 5;
		}
		else if ( firstMonth.equalsIgnoreCase("June")) 
		{
			firstMonthNumber = 6;
		}
		else if ( firstMonth.equalsIgnoreCase("July")) 
		{
			firstMonthNumber = 7;
		}
		else if ( firstMonth.equalsIgnoreCase("August")) 
		{
			firstMonthNumber = 8;
		}
		else if ( firstMonth.equalsIgnoreCase("September")) 
		{
			firstMonthNumber = 9;
		}
		else if ( firstMonth.equalsIgnoreCase("October")) 
		{
			firstMonthNumber = 10;
		}
		else if ( firstMonth.equalsIgnoreCase("November")) 
		{
			firstMonthNumber = 11;
		}
		else if ( firstMonth.equalsIgnoreCase("December")) 
		{
			firstMonthNumber = 12;
		}
		
		//Second month conversion
		if ( secondMonth.equalsIgnoreCase("January"))
		{
			secondMonthNumber = 1;
		} 
		else if ( secondMonth.equalsIgnoreCase("February")) 
		{
			secondMonthNumber = 2;
		}
		else if ( secondMonth.equalsIgnoreCase("March")) 
		{
			secondMonthNumber = 3;
		}
		else if ( secondMonth.equalsIgnoreCase("April")) 
		{
			secondMonthNumber = 4;
		}
		else if ( secondMonth.equalsIgnoreCase("May")) 
		{
			secondMonthNumber = 5;
		}
		else if ( secondMonth.equalsIgnoreCase("June")) 
		{
			secondMonthNumber = 6;
		}
		else if ( secondMonth.equalsIgnoreCase("July")) 
		{
			secondMonthNumber = 7;
		}
		else if ( secondMonth.equalsIgnoreCase("August")) 
		{
			secondMonthNumber = 8;
		}
		else if ( secondMonth.equalsIgnoreCase("September")) 
		{
			secondMonthNumber = 9;
		}
		else if ( secondMonth.equalsIgnoreCase("October")) 
		{
			secondMonthNumber = 10;
		}
		else if ( secondMonth.equalsIgnoreCase("November")) 
		{
			secondMonthNumber = 11;
		}
		else if ( secondMonth.equalsIgnoreCase("December")) 
		{
			secondMonthNumber = 12;
		}
		
	
		//Year calculation
		if (firstYear < secondYear)
		{
			yearsDif = secondYear - firstYear;
		}
		else if (firstYear > secondYear)
		{
			yearsDif = firstYear - secondYear;
		}
		
		//Month calculation
		if (firstYear <= secondYear)
		{
			monthsDif = secondMonthNumber - firstMonthNumber;
		}
		else if (firstYear >= secondYear)
		{
			monthsDif = firstMonthNumber - secondMonthNumber;
		}
		if  (monthsDif < 0)
		{
			yearsDif = yearsDif - 1;
			monthsDif = monthsDif + 12;
		}
		
		//Prints out answer
		System.out.println();	
		System.out.print("These dates are " + yearsDif + " years and " + monthsDif + " months apart.");
	}

}
