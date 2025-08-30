import java.util.Scanner;
public class TestEven {
    public static void main(String[] args){
        //this program determines whether a number is even or odd
        //ask uers to enter a number then use if else to determine it

        System.out.println("Enter any number: ");

        Scanner input = new Scanner(System.in);

        int Num = input.nextInt();

        if (Num % 2 == 0)
            System.out.println("Your number is Even");
        else
            System.out.println("Your number is Odd");

    }
}