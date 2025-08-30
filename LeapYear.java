import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		//create a scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		
		int year = input.nextInt();
		
		//Check if the year is LeapYear
		boolean  isLeapYear =
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		//Display results
		System.out.println(" Is " + year + " a Leap Year? " + isLeapYear);
	}
}