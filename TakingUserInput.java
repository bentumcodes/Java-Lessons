import java.util.Scanner; //importing  the scanner module

public class TakingUserInput{
	public static void main(String[] args){
		//create a scanner object
		Scanner input = new Scanner(System.in);
		//input is variable with a type Scanner
		
		//prompt user to enter number
		System.out.print("Enter a number: ");
		
		double radius = input.nextDouble(); //nextDouble accepts user input in the double type
		double Area;
		Area = radius * radius * 3.142;
		
		//display results
		System.out.println("Your radius is: " + Area + "m2");
	}
}