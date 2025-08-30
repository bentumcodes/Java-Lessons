import java.util.Scanner;
public class TestRun{
	public static void main(String[] args){
		//declare the user input variable
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Name?: ");
	
		//Accept user input into a String Variable
		String userName = input.nextLine();
		//accept user age as integer
		System.out.println("What is your age?: ");
		int age = input.nextInt(); //nextInt will convert the user input into integer and store it in the age variable 
		System.out.println("Welcome, " + userName + " this is a very good class, welcome from your break");
		System.out.println(userName + ", I know you are " +age+ "years old but i want to encourage you to keep pushing harder");
	}
}