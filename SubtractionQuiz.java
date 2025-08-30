import java.util.Scanner;

public class SubtractionQuiz{
	public static void main(String[] args){
		//Generate two random single digit numbers
		
		int num1 = (int)(Math.random() * 10); // multiplying by 10 generates below 10
		int num2 = (int)(Math.random() * 20);
	
		
		// if num1 < num2, swap num1 with num2
		
	if (num1 < num2){
		int tempValue = num1; // a temporary value is set to help the smaller num 1. the goal is to help the KG child not to get negatives.
		num1 = num2;
		num2 = tempValue;
	}
	//Prompt user to answer question
	System.out.println("What is: " + num1 + "-" + num2+ " ?");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
	
	// grade the score and display results
	if (num1 - num2 == answer)
	System.out.println("Congratulations you WON!");
	else {
			System.out.println("Check you answer well...");
			System.out.println(num1 +" - " + num2 + " is " + (num1 -num2));
		}
	}
	}
	