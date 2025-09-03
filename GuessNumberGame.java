import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args){
        //This game generates random numbers for users to predict
        int rand = (int)(Math.random()*10);

        //create scanner to accept input from user
        Scanner input = new Scanner(System.in);
        //prompt user to guess no:( between 0 to 10)

        System.out.println("\nWELCOME TO THE GUESS GAME. GUESS ANY NUMBER B/N 0 -10 TO WIN");
        
        //using while loop to control the number of guesses
        int userNo = -1; //this shift the index to include zero in the random generated numbers
        while (userNo != rand){
        System.out.println("Enter your guess no: ");
        userNo = input.nextInt();

            if(rand == userNo){
                System.out.println("Congratulations! Your guess was right: "+rand );}

            else if (userNo > rand){
                System.out.println("Your guess is too high");}
                else {
                System.out.println("Your guess is very low");
            }
            } 
            

        
    }
    
}
