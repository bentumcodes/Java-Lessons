import java.util.Scanner;
public class DaysOfWeek {
	public static void main(String[] args){
		//request for user input
		Scanner input = new Scanner(System.in);
		//user enters a number representing the days of the week
		System.out.println("What does your favourite number (1-7) represent in the week? ");
		
		//a variable to collect user input
		int userdays = input.nextInt();
		
		//print the day of the week from the user input
		//using the switch case
		switch(userdays){
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Incorrect! check and try AGAIN");
		}
	}
}
		
		
