import java.util.Scanner;
//This program converts pounds to kilograms
public class ConvertToKilos{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//prompts user to enter pounds
		System.out.print("Enter a number in pounds: ");
		
		double pounds = input.nextDouble();
		
		//Converting to kilogram using the fmla: 1pound = 0.454kg
		
		double kilogram = pounds * 0.454;
		
		//display results
		System.out.println(" " + pounds + "pounds equals " + kilogram + " kilograms");
	}
}