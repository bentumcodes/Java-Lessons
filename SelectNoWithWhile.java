import java.util.Scanner;

public class SelectNoWithWhile {
    public static void main(String[] args){
        //This program selects individual digits of numbers when a user
        //...enter it

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 and above digits of numbers: ");

        int userNo = input.nextInt();
        int r; // this collects the remender of the numbers
        while (userNo > 0){

            r = userNo%10; //this collects the remaining number after the modulus
            userNo = userNo /10; // the number is divided to give the remaining

            System.out.println(r);

        }
    }
    
}
