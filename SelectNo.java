import java.util.Scanner;

public class SelectNo {
    public static void main(String[] args){
        // this code separate individual numbers when typed together
        //it uses modulos and division to get the results
        
        // //testing out
        // int n = 257;
        // int firstNo = n % 10;
        // int reminder = n / 10;

        // int second = reminder %10;
        // int third = n /100;
        // System.out.println(third);
        // System.out.println(second);
        // System.out.println(firstNo);

        //putting it into real test by asking a user to enter 
        Scanner input = new Scanner(System.in);
        System.out.println("\nTHIS PROGRAM SEPARATES NUMBERS INTO DIGITS. LET'S GO!");
        System.out.println("\nEnter 2 or 3 digits numbers: ");

        int userNo = input.nextInt();

    
        //separating the digits
        int lastNo = userNo % 10;
        int remender = userNo / 10;
        int second = remender % 10;
        int first = userNo / 100;
        

        System.out.println( "\n" + first + "\n" + second+ "\n" + lastNo);
        
        
      
    }
    
}
