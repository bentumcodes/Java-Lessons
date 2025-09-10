import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        //This is a Fibonacci Series generator for nth term

        int n = 10; //initial term
        int a = 0; //first term
        int b = 1; // second term
        int c=1; //Counter for while Loop. should be zero if you use the for Loop and it becomes a placeholder as well
        
        
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
            int next = a + b;
                a = b;
                b = next;
                c++;
        }
    }
}
