import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args){
        //this is a TIMESTABLE GENERATOR

        //user will enter a number to get a timestable generated

        Scanner input = new Scanner(System.in);
        System.out.println("\nTHIS APP CAN GENERATE A TIMESTABLE FOR YOU!!");
        System.out.println("Enter the No. you want to generate: ");

        int userNo = input.nextInt();

        int i = 1;

        while (i < 13){
            System.out.println(userNo + " x " + i + " = " + (userNo * i));
            i++;
        }
        System.out.println("Do you want to generate another one? [Yes or No]: ");
         int userAns = input.nextInt();
         //input.nextLine();

        int response = 1;
         while (userAns == response){
            System.out.println("\nEnter the No.: ");
            int userNo2 = input.nextInt();
                int j = 1;
                do{
            System.out.println(userNo2 + " x " + j + " = " + (userNo2 * j));
                    j++;
                } while (j < 13);
         } System.exit(1);


    }
    
}
