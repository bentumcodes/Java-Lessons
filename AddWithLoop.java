import java.util.Scanner;

public class AddWithLoop {
    public static void main(String[] args){
        // this app does addition using for loop

        //initialise the summation

        int sum = 1;
        int i =1;
        //int total = i + sum;
        //initialise the loop
        for (;i<=4;i++){
            //declare the summation formular
            sum = i  + 1;
            System.out.printf("%2d x %2d = %2d%n",i,sum,((i*sum)+sum-1));
        }

        //System.out.println("The Total sum is: "+(total));


    }
    
}
