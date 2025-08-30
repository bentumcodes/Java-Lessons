import java.util.Scanner;
public class ComputeLoan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage
		System.out.print("Enter annual interest rate in decimals: ");
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter no. of years
		System.out.println("Enter no. of years: ");
		
		int numberOfYears = input.nextInt();
		
		//enter loan amount
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1- 1/Math.pow(1 + monthlyInterestRate, numberOfYears*12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//display the results
		System.out.println("The monthly payment is: " + (int)(monthlyPayment * 100)/100.0 + " The total payment is: " + (int)(totalPayment * 100)/100.0);
	}
}
		
		