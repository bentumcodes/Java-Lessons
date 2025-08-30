import java.util.Scanner;
public class DisplayTime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for Seconds: ");
		 int seconds = input.nextInt();
		 int minutes = seconds / 60; // find minutes in seconds
		 int remainingSeconds = seconds % 60;
		 
		 System.out.println(seconds + " seconds is " + minutes + " minutes " + remainingSeconds + " seconds ");
	}
}