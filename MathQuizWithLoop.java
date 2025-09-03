import java.util.Scanner;

public class MathQuizWithLoop {
    public static void main(String[] args){
        //this is an addition quiz for kids
        //create scanner to accept user inputs

        
        //create the random number generators

        int num1 = (int)(Math.random() *10); //this generates single numbers
        int num2 = (int)(Math.random() * 10);
        int finalAns = num1 +num2;
        
        Scanner input = new Scanner(System.in);
        //accept user input
        int countTries = 0;
        
        //give user 3 attempts then print results
        while (countTries < 3){
            System.out.println("\nWhat is "+ num1 + " + "+ num2 + " ? ");
            int answer = input.nextInt();
            
            if (answer == finalAns){
                System.out.println("Congratulations!!! "+ num1 + " + "+ num2+ " = "+ finalAns);
                return; // the program terminates when it is correct

            }else 
                countTries++;
            if (countTries < 3){
                System.out.println("\nWrong! Try again");
            }
                
        }System.out.println("GAME OVER. The answer is: "+ num1 + " + "+ num2 + " = "+ finalAns);
    
        }
            
    
    
}
