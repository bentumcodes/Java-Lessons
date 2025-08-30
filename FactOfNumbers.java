import java.util.Scanner;

public class FactOfNumbers {
    public static void main(String[] args){
// this code generates the factorial of a num
long fact = 1; //here long is used because int can't handle the overflow of numbers

//create Scanner to take inputs
Scanner input = new Scanner(System.in);

System.out.println("Enter your factorial NO.: ");
int factNo = input.nextInt();
//declare for loop to calculate the factorial
for (int i=1;i <=factNo;i++){

    fact = fact * i;
    // to see what is happening behind the scenes
}
System.out.println("The Factorial of "+factNo+ " is:  "+fact);
    }
    
}
