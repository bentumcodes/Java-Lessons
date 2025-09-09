import java.util.Scanner;

public class ShowNumber {
    public static void main(String[] args){

        //This program shows the words of numbers
        Scanner input = new Scanner(System.in);

        System.out.println("\n Enter a number: ");
        
        int n = input.nextInt();
        
        int rem; 
        String rev= ""; // this will collect reversed numbers
        // this will be for the remainder
        //int i;
        while (n >0){
            rem = n % 10;
            n /=10;
            rev = rev + rem;//the remaider, rem is converted to a string
            
        };
        char c;
         for (int i = rev.length()-1;i >= 0;i--){
            c = rev.charAt(i);
            switch (c){
                case '0': System.out.print("Zero ");break;
                case '1' : System.out.print("One "); break;
                case '2' : System.out.print("Two "); break;
                case '3' : System.out.print("Three "); break;
                case '4' : System.out.print("Four ");break;
                case '5' : System.out.print("Five "); break;
                case '6' : System.out.print("Six ");break;
                case '7' : System.out.print("Seven ");break;
                case '8' : System.out.print("Eight ");break;
                case '9' : System.out.print("Nine "); break;
                
            }
         }
       
    
}
}
