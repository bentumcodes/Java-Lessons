import java.util.Scanner;

public class ConvertToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // request user to enter a value for foot
        System.out.print("Enter the value for feet: ");
        double feet = input.nextDouble();

        // Converting feet to meters
        double meters = feet * 0.305;

        // display results to user
        System.out.println(" " + "feet is equal to : " + meters + "meters");
    }

}
