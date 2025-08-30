import java.util.Scanner;
public class TestAge{
    public static void main(String[] args){
        //This program test the age of users
        //ask of them name and atach it to their response
        //create a obj to take keyboard input


        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        
         String userName = input.nextLine();

        System.out.println("What is your age?: ");

        int userAge = input.nextInt();


        if (userAge <= 12)
            System.out.println("Hey, "+ userName+ "you're underage!");
        else if (userAge >12 && userAge <=19)
            System.out.println("Hey!, "+ userName + " your're a TENNAGER");
        else 
            System.out.println("You are an ADULT, BRAVOO!,"+ userName);

    }
}