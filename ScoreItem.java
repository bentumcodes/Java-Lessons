import java.util.Scanner;
public class ScoreItem{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your score: ");

int score = input.nextInt();
	if (score >= 90)
		{System.out.println("Your pay is increased by 3%");}
	else 
		{System.out.println("you only hava 1% increment");}
}

}