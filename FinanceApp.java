//This is a financial program that calculates gratuity and total
import java.util.Scanner;
public class FinanceApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//request user to enter gratuity rate and subtotal
		System.out.print("Enter the subtotal and gratuity rate: ");
		
		//gets inputs from user
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		//calculate the gratiuity and total
		//gratuity = subtotal * gratuity rate
		//total = gratuity + subtotal
		
		double gratuity = (gratuityRate /100) * subtotal;
		double total = gratuity + subtotal;
		
		//display results
		System.out.println("The gratuity is $" + (int)(gratuity *100)/100.0 + " and the total is $" + (int)(total *100)/100.0);
	}
}