import java.util.Scanner;
public class LotteryUsingString {
    public static void main(String[] args){

        //Generate a lottery as a two-digits string

        String lottery = ""+ (int)(Math.random() * 10) + (int)(Math.random() * 10); //this generates the random for 2 digits
        //if the 10 is changed to 100, the some of the random numbers will get into 100s
        //which will defeat the comparison with 2 digits.

        //prompt the user to enter a guess

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");

        String guess = input.nextLine();

        //Get digits from lottery

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        //char lotteryDigit3 = lottery.charAt(2);

        //get digits from guest
        char guestD1 = guess.charAt(0);
        char guestD2 = guess.charAt(1);
        //char guestD3 = guess.charAt(2);

        System.out.println("\nThe lottery number is: " +lottery);

        //check the guess
        if(guess.equals(lottery)){
            System.out.println("Exact Match! You've won $10,000");
        }
        else if (guestD1 == lotteryDigit2 && guestD2 == lotteryDigit1){
            System.out.println("Match all the digits. Youve won $3000");
        }
        else if (guestD1 == lotteryDigit1
                    || guestD1 == lotteryDigit2
                    || guestD2 == lotteryDigit1
                    || guestD2 == lotteryDigit2){
                System.out.println("You were able to get one match. You've won $1000");
                    }
        else
        {System.out.println("Try again next time! No Match");}


    }
    
}
