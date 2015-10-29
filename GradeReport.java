import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeReport {

	public static void main(String[] args){

		// Declaring variables
		int[] testOne = new int [4];		//Students' test one grades
		int[] testTwo = new int [4];		//Students' test two grades
		double[] average = new double [4];	//Students' average grades
		char[] grade = new char [4];		//Students' letter grades
		DecimalFormat form1 = new DecimalFormat("000");
		DecimalFormat form2 = new DecimalFormat("000.0");
		Scanner scan = new Scanner(System.in);
		
		// Ask for user input.
		System.out.println("For test 1,");
		for ( int i = 0; i < testOne.length; i++) 
		{ 
			System.out.print("Enter score " + (i + 1) + ": ");
			testOne[i] = scan.nextInt(); 
		}
		
		System.out.println();
		
		System.out.println("For test 2,");
		for ( int i = 0; i < testTwo.length; i++) 
		{ 
			System.out.print("Enter score " + (i + 1) + ": ");
			testTwo[i] = scan.nextInt(); 
		}
		for(int i=0;i<average.length;i++)
		{
			average[i] = ((testOne[i]+testTwo[i]) / 2.000);
		}
		
		//Letter grade
		for(int i=0;i<grade.length;i++)
		{
		if (average[i]>= 90 )
		{ grade[i] = 'A';}
		else if (average[i]>= 80 )
		{ grade[i] = 'B';}
		else if (average[i]>= 70 )
		{ grade[i] = 'C';}
		else
		{ grade[i] = 'F';}
		}
		
		System.out.println();
		System.out.println("Test 1		Test 2		Average		Grade");
		System.out.println("______		______		_______		_____");
		System.out.println(form1.format(testOne[0]) + "		" + form1.format(testTwo[0])
				+ "		" + form2.format(average[0]) + "		" + grade[0]);
		System.out.println(form1.format(testOne[1]) + "		" + form1.format(testTwo[1])
				+ "		" + form2.format(average[1]) + "		" + grade[1]);
		System.out.println(form1.format(testOne[2]) + "		" + form1.format(testTwo[2]) 
				+ "		" + form2.format(average[2]) + "		" + grade[2]);
		System.out.println(form1.format(testOne[3]) + "		" + form1.format(testTwo[3])
				+ "		" + form2.format(average[3]) + "		" + grade[3]);
		
		
	}

}
