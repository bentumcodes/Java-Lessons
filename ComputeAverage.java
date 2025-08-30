import java.util.Scanner;

public class ComputeAverage{
	public static void main(String[] args){
		//declare input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		double Average;
		Average = (num1 + num2+ num3)/3;
		System.out.println("Your Average for " + num1+ " " + num2 + " " + num3 + " " + "is:" + Average);
	}
}