import java.util.Scanner;
public class AgeCalc {
	public static void main(String[] args){
		//declare input variable from keyboard
		Scanner input = new Scanner(System.in);
		//user enters age
		System.out.println("Enter the year you were born: ");
		int userYear = input.nextInt();
		
		//calculate the users age in years
		int userAge = 2024 - userYear;
		
		System.out.println("Since you were born in "+userYear+ ", your current age is " + userAge +"years");
	}
}