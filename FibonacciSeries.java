import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        //This is a Fibonacci Series generator for nth term

        Scanner input = new Scanner(System.in);
        System.out.println("\nTHIS IS A FIBONACCI GENERATOR");
        System.out.println("Enter the number of terms: ");


        long n = input.nextLong(); //number of terms
        long a = 0; //first term
        long b = 1; // second term
        long c=1; //Counter for while Loop. should be zero if you use the for Loop and it becomes a placeholder as well
        // used long because int can't hold large numbers incase the nth term is 30+
        
        // System.out.print(a + "," + b+ ","); // this prints first and second term

        //Using For Loop
        // for (int i =0;i < n-2;i++){
            
        //     c = a + b;
        //     System.out.print(c + ",");  
        //     a = b;
        //     b = c;
            
         
        // } //Using While Loop
        while (c <=n){
            System.out.print(a + ",");
            long next = a + b;
                a = b;
                b = next;
                c++;
        }
    }
}
