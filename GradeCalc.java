import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args){
        //this program calculates the average score and printes the grade
        //Crate a scanner to take inputes

        Scanner input= new Scanner(System.in);
        // ask user to enter 3 sets fo exams scores

        System.out.println("\nEnter your class scores for English exercises (maximum of 3): ");
        int examscore = input.nextInt();
        int examscore2 =  input.nextInt();
        int examscore3= input.nextInt();

    int aveg = (examscore+examscore2+examscore3)/3;

    if (aveg >=70){
        System.out.println("\nYour average score is: "+aveg);
        System.out.println("Your grade is A");
    }else if (aveg >=60 && aveg<70){
        System.out.println("\nYour average score is:  "+aveg);
        System.out.println("Your grade is B");
    }else if (aveg >=50 && aveg <60){
        System.out.println("\nYour average score is:  "+aveg);
        System.out.println("Your grade is C");
    }else if (aveg >=40 && aveg <50){
        System.out.println("\nYour average score is:  "+aveg);
        System.out.println("Your grade is D");
    }else{
        System.out.println("\nYour average score is: "+ aveg);
        System.out.println("Your have Failed");}
        
    }
    
}
