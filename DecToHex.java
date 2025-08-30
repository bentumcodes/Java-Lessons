import java.util.Scanner;
public class DecToHex {
    public static void main(String[] args){

        //create Scanner to take inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a two digit number");

        int hex = input.nextInt();
        String hexdec = String.format("%X",hex);
        
        //display out put

        System.out.println("Decimal: "+hex);
        System.out.println("the Hexidecial equivalent is: 0x"+hexdec);

        
    }
    
}
