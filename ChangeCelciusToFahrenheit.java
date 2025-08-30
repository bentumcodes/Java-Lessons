import java.util.Scanner;
public class ChangeCelciusToFahrenheit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter celcius degree
		System.out.print("Enter the Celcius degree: ");
		
		//user enters Celcius degree
		double celcius = input.nextDouble();
		
		//convert user input into fahrenheit
		//using the formular: fahrenheit = (9/5) * celcius + 32
		
		double fahrenheit = ( 9 / 5.0 ) * celcius + 32;
		
		//display results to user
		System.out.println(" " + celcius + " celcius is: " + (int)(fahrenheit * 100)/100.0 + " fahrenheit");
	}
}
		