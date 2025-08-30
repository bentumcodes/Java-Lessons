import java.util.Scanner;
public class ComputeVolume{
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	 
	 //ask user to enter radius and length of cylinder
	 System.out.print("Enter the radius and length of the cylinder: ");
	 
	 //read user inputs
	 double radius = input.nextDouble();
	 double length = input.nextDouble();
	 
	 //creating PI as a constant
	 final double PI = 3.142;
	 
	 //compute the volume of the cylinder
	 double area = radius * radius * PI;
	 double volume = area * length;
	 
	 //display results to user
	 System.out.println("The area of the cylinder is: " + area);
	 System.out.println("The volume is: " + volume);
	}
}
	 
	 