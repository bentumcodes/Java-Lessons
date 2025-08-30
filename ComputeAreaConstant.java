import java.util.Scanner;

public class ComputeAreaConstant{
	public static void main(String[] args){
		//declare pi as constant
		final double PI = 3.14159;
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		// prompt user to enter a radius
		
		System.out.print("Enter radius of Circle: ");
		double radius = input.nextDouble();
		
		//compute area
		double area = radius * radius * PI;
		
		//display results
		System.out.println("The area of the circle is: " + area);
	}
}