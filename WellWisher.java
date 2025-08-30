import java.util.Scanner;
public class WellWisher {
	public static void main(String[] args){
		//This is a WELL WISHER APP. It gives nice messages to users!
		//Select your option and have the app mention your name and a nice message to it.
		
		//Request users to enter their name
		System.out.println("What is your name?: ");
		
		//accept input into a string
		Scanner input = new Scanner(System.in);
		String yourName = input.nextLine();
		System.out.println("Welcome, "+yourName+ ","+"It is amazing seeing you here");
		System.out.println("Select any number from (1-5) to get your message. :");
		
		int myNum = input.nextInt();
		
		//messages are stored in switch cases which will display upon selecting a particular number
		switch(myNum){
			case 1: System.out.println(yourName + ", You're such a Brilliant person"); break;
			case 2: System.out.println(yourName + ", You're consistent with whatever you decide to do!"); break;
			case 3: System.out.println(yourName + ", Never give up on your dream of becoming a SOFTWARE ENGINEER!");break;
			case 4: System.out.println(yourName + ", Discipline is the key to your achievement so keep working at it!"); break;
			case 5: System.out.println(yourName + ", You're such a multi-talented person, keep polishing your talent."); break;
			default: System.out.println(yourName + ", OUT OF SELECTION, CHECK AND TRY AGAIN!");break;
		}
		
	}
}