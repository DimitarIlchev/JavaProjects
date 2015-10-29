import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class CarpetBill {

	public static void main(String[] args) {
		
		//Declaring variables to hold each currency
		double costPSF, tax;
		double TAX = .085;
		int lastNamelength, firstNamelength, randomNum, lengthRoom, widthRoom, area;
		String lastName, firstName, userID;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		randomNum = generator.nextInt(90) + 10;
		DecimalFormat decF1 = new DecimalFormat("000");
		DecimalFormat decF2 = new DecimalFormat("0000.00");
		
		//Asks for user to input information
		System.out.print("Enter your first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		lastName = scan.nextLine();
		System.out.print("Enter length of room (feet): ");
		lengthRoom = scan.nextInt();
		System.out.print("Enter width of room (feet): ");
		widthRoom = scan.nextInt();
		System.out.print("Enter cost per square foot: ");
		costPSF = scan.nextDouble();
		
		area = lengthRoom * widthRoom;
		
		//Prints back first and last name and making an ID.
		System.out.println();
		System.out.println("CUSTOMER");
		System.out.println("Last Name\t" + lastName.substring(0, 1).toUpperCase()
				+ lastName.substring(1).toLowerCase());
		System.out.println("First Name\t" + firstName.substring(0, 1).toUpperCase()
				+ firstName.substring(1).toLowerCase());
		System.out.println("ID\t\t" + firstName.substring(0, 1).toUpperCase() 
				+ lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 5).toLowerCase() + randomNum);
		
		//Prints length, width, and calculates the area.
		System.out.println();
		System.out.println("MEASUREMENT");
		System.out.println("Length\t" + decF1.format(lengthRoom) + " feet");
		System.out.println("Width\t" + decF1.format(widthRoom) + " feet");
		System.out.println("Area\t" + decF1.format(area) + " square feet");
		
		//Calculates the cost of the carpet and tax and gives you the total
		System.out.println();
		System.out.println("CHARGES");
		System.out.println("Description\t\tCost/Sq.Ft.\t\tCharges");
		System.out.println("___________\t\t___________\t\t_______");
		System.out.println("Carpet\t\t\t"+ costPSF + "\t\t\t$" + decF2.format(costPSF * area));
		System.out.println("Tax\t\t\t"+ "8.50%\t\t\t$" + decF2.format((costPSF * area) * TAX));
		System.out.println("\t\t\t\t\t\t_______");
		System.out.println("Total\t\t\t\t\t\t" +"$" +decF2.format((costPSF * area) + ((costPSF * area) * TAX)));
		
		

	}

}
