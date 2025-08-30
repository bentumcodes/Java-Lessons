import java.util.Scanner;
public class MinutesConverter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//request for user input in minutes
		System.out.println("Enter no of days: ");
		
		double min = input.nextInt();
		
		//long years = (int)(min / (24*60*365));
		//int days = (int)(min / 60 / 24) % 365; //these convertions are here because user enters inputs in minutes.
		int months = (int)(min / 30);
		int weeks = (months % 7);
		//int weeks = (int)(min /30/4) % 4;
		//Display results
		System.out.println(min + " is :" + months + " months and " + weeks + "weeks" );
		
		//System.out.println(min + " is :" + years + "years " + days + " days " + months + " months and " + weeks + "weeks" );
	}
}