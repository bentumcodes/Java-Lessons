import java.util.Scanner;
public class ComputeChange{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount in decimal e.g. 11.45: ");
		
		double amount = input.nextDouble();
		
		//converting the amount in dollars into cent by multiplying by 100
		
		int remAmount = (int)(amount * 100);
		
		//diving cents by 100 to get actual amount
		int amountDollars = remAmount / 100;
		
		//obtaining remaining cents
		remAmount = remAmount % 100;
		
		int  numberOfQuarters = remAmount / 25;
		remAmount = remAmount % 25;
		
		//find the number of dimes in the remaining amount
		int numberOfDimes = remAmount /10;
		remAmount = remAmount % 10;
		
		//find the number of nickels in the remaining amount
		int numberOfNickels = remAmount / 5;
		remAmount = remAmount % 5;
		
		//find the number of pennies in the remaining amount
		int numberOfPennies = remAmount;
		
		//Display results
		System.out.println("Your amount "+ amount+ " consists of : ");
		System.out.println(" " + amountDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
	}
}