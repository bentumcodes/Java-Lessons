import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args){
        //This program converts Hex digits to Decimal.
        //user will enter Hexidecimal value to get a decimal value in returen

        //create a scanner to take keyboard inputs

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit: ");

        String hexString = input.nextLine();

        //check if the hex string entered is a single character.

        if (hexString.length() !=1){
            System.out.println("You must enter exactly one character");
            System.exit(1); //this logs out when the answer is wrong
        }

        //Display decimal value for the hex digit

        char ch = Character.toUpperCase(hexString.charAt(0));
        if('A'<= ch && ch<='F'){
            int value =ch - 'A' + 10;
            System.out.println("The decimal value for hex digit: "+ch+ " and the value is: "+value);
        }
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit "+ch+"is: "+ch);
        }
        else {
            System.out.println("Invalid input, check and try again");
        }
    }
    
}
