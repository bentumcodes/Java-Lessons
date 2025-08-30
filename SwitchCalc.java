import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args){
        // this program mimics a calculator using the switch case
        //user will enter 2 figures and the calculation will be done by selecting the operand\
        //create an input reader

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 figures to perform calculation on: ");

        int userValue1 = input.nextInt();
        int userValue2 = input.nextInt();

        System.out.println("\nWhich Operations do you want to perform?" +
                             "\n'ADD'" + "\n'SUB'" + "\n'MUL'" + "\n'DIV'" + "\tType it out as indicated: ");
        
        //Scanner sc = new Scanner(System.in); // you can replace this with
        input.nextLine();
        String userOperand =input.nextLine().toUpperCase();

        //using the switch...case to create a calculator
        
            switch (userOperand){
                case "ADD" : System.out.println(userValue1 + " + "+ userValue2 + " = "+ (userValue1+userValue2));break;
                case "SUB" : System.out.println(userValue1 + " - "+ userValue2 + " = "+ (userValue1-userValue2)); break;
                case "MUL" : System.out.println(userValue1 + " x "+ userValue2 + " = "+ (userValue1*userValue2)); break;
                case "DIV" : System.out.println(userValue1 + " \\ "+ userValue2 + " = "+ (userValue1/userValue2)); break;

            default : System.out.println("Wrong entry,check and try again!");
            } 


    }
    
}
