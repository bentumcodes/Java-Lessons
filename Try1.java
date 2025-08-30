import java.util.Scanner;
public class Try1{
	public static void main(String[] args){
		//To check whether a number is even or odd
		System.out.println("This app check whether a number is EVEN OR ODD. HAPPY LEARNING!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to check its status: ");
		int checker = input.nextInt();
		
		//testing using if-else statement
		
		if(checker % 2 ==0)
			System.out.println(checker + " is an even number");
		else
			System.out.println(checker + " is an odd number");
		
	}
}