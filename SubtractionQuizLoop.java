import java.util.Scanner;
public class SubtractionQuizLoop {
    public static void main(String[] args){

        //This subtraction game has 5 questions to ask the user
        //and it will record the number of correct and wrong answers and display to the user

        //set the constant for the number of question
        final int NUMOFQUESTION = 5;
        int correctCount = 0; //to count the number of correct answers
        int questionCount = 0; // to count the number of questions
        int wrongCount = 0;

        String responds = " "; // an empty string that will accept the responds 

        //setting a timer for the user
        long startTime = System.currentTimeMillis();

        //create scanner to take user input
        Scanner input = new Scanner(System.in);

        //start the whiile loop for the quiz
        while (questionCount < NUMOFQUESTION){
            //generate randdom questions
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            
            
            //to avoid negative numbers since the game targets kids, swap numbers if the one to be subtracted from is small
            if (num1 > num2){
                //hold the num1 in a temporal variable then swap
                int temp = num1;
                num1 = num2;
                num2 =temp;
                }
            //ask user the questions
            System.out.println("\nWhat is "+ num2 + " - "+ num1+ "?: ");
            int userAns = input.nextInt();
            if (userAns == (num2 -num1)){
                System.out.println("Congratulations! "+num2+ " - "+ num1+ " = "+ (num2 - num1));
            correctCount++;}
            else {
            System.out.println("Wrong Answer! "+ num2+ " - "+ num1+ " should be : "+ (num2 - num1));
            wrongCount++;
            }
            
            questionCount++;

            //record the responds to display later to the user whether correct or wrong

            responds += "\n"+ num2+ " - "+ num1+ " = "+ (num2 - num1) + (((num2-num1) == userAns)? " correct "  : " wrong");
        }
        //display the time used by the user in the QUIZ
        long endTime = System.currentTimeMillis();
        long timeUsed = endTime - startTime;

        //display final score sheet

        System.out.printf("\nCorrect count is:  %2d and Wrong count is %2d \t",correctCount,wrongCount);//this keeps it in a line
        
        System.out.println("\nTime used for the quiz is "+ (timeUsed /1000)+"seconds " + responds);

        //just to see the time
        // System.out.println(startTime/1000 + "seconds");
        // System.out.println(endTime/1000 + "seconds");
    }
    
}
