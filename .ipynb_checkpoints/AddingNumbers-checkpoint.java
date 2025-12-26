import java.util.Scanner;
public class AddingNumbers{
	public static void main(String[] args){
		//initiate the scannerl
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number between 0 and 1000: ");
		
		int userInput = input.nextInt();
		
		//extracting digits from user inputs
		
		int firstNum = userInput % 10;
		int remainNum = userInput / 10;
		int nextNum =remainNum % 10;
		remainNum = remainNum / 10;
		int lastNum = remainNum;
		
		//display results to user
		System.out.println(lastNum);
		System.out.println(nextNum);
		System.out.println(firstNum);
		
		System.out.println("The sum of the digits in the numbers is: " + (firstNum+nextNum+lastNum));
	}
}