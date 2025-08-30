import java.util.Scanner;

public class TimesTable2 {
    public static void main(String[] args){
// This program generates lots of Times table at a goal using nested While loop

//declaring outer loop
/*int i = 2;

while (i <= 4){
//declaring inner loop. First the value of outer loop is picked and ran through the value of inner till the end
    int j = 1;
    while (j <=5 ){
        System.out.print("\n" + i + " x " + j + " = " + (i * j ));
        j++;
    }
    System.out.println();
    i++;
} */

//asking a user to determin his or her own number of of times to generate and the limit

//create scanner to take input from user
Scanner input = new Scanner(System.in);

System.out.println("\nTHIS IS A TIMESTABLE GENERATOR. DETERMINE THE NO. OF TIMES AND LIMIT");
System.out.println("How many counting numbers do you want to generate [Between 2 to 10]: ");

int timesNo = input.nextInt();

System.out.println("What is the limit of the TimesTable for each No. [10 to 15]: ");

int limitNo = input.nextInt();
 int i = 2; //this sets the lower limit for the loop
//creating outer loop

while ( i <= timesNo){
    //declaring the inner loop
    int j = 1; //this sets the lower limit for the loop
    while (j <= limitNo){
        //System.out.print("\n" + i + " x " + j + " = " + ((i * j)+"\b"));
        System.out.printf("%d x %d = %d\t", j, i, (i *j));
        
        j++; //the counter for the inner loop
        
    }
    System.out.println(); // this prints an empty space to separate the TimesTable
    i++; //counter for the outer loop
}

    }
    
}
