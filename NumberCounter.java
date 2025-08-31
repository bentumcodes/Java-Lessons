import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args){
        // the program counts the numbers in a digits

    //     int n = 2345;
    //     int x = 0; // container for countered digit
    //     int r;
    //     while (n > 0){
    //         n = n/10; // it keeps dividing till the number gets to zero to stop the loop
    //         r = n; //stores the values as the division is happening
    //         x++; // anytime the loop happens it counts and stores
    //     System.out.println(r);// to see how the division is working
    //     }
    // System.out.println(x);

        //ask user to supply the number
        Scanner input = new Scanner(System.in);
        System.out.println("\nTHIS PROGRAM COUNTS THE NUMBER OF DIGITS IN A NUMBER YOU SUPPLY. LET'S GO!");
        System.out.println("Enter your number: ");

        long userNo = input.nextLong(); //long is used inorder to hold large numbers
        int counter = 0; //this will count the number of times the loop occurs
        long r = userNo; //this holds the user input number before the division so as to use it later
        while (userNo > 0){
            userNo = userNo / 10;
            counter++; //it counts the number of loops
        }
        System.out.println("\nThe number of digits in "+r+ " is: "+counter);//display outcome


    }
}
