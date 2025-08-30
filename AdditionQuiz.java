import java.util.Scanner;
public class AdditionQuiz{
	public static void main(String[] args){
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 10 % 10);
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + num1 + " + " + num2 + " ?");
		
		int answer = input.nextInt();
		//Display answer
		
		System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer)); //the last expression evaluates to boolean type
	}
}