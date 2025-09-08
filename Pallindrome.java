
import javax.swing.JOptionPane;

public class Pallindrome {
    public static void main(String[] args){
        // use UI to generate a message for user
        String intro = "This App checks whether a number is Palindrome"+
        "Palindrone: Its reverse is the same as the original";

        //display GUI
        JOptionPane.showMessageDialog(null,intro,"PALINDROME CHECKER",0);

        //TAKE input from user

        String userInput = JOptionPane.showInputDialog("Enter your number:");

        int userNo = Integer.parseInt(userInput); //converts the string to integer;

        int rev = 0; //collects the reversed number

        int actualNo = userNo; //stores user's initial number for verification later
        int r; //takes the remainder

        //loop the user number 
        while (userNo > 0){

            r = userNo % 10;
            rev = (rev *10) +r ; //calculates the reverse and stores in rev variable
            userNo /=10; //this is same as userNo = userNo / 10
        }
        if (actualNo == rev){
            String output = "The reverse of " + userInput + " is: " + rev +
            " .Since they are the same, the number is a Palindrome!";
            JOptionPane.showMessageDialog(null,output,"PALINDROME CHECKER",0);
        }else {
            String output2 = "The reverse of " + userInput + " is: " + rev +
            " .Since they are NOT the same, the number is NOT a Palindrome!";
            JOptionPane.showMessageDialog(null,output2,"PALINDROME CHECKER",0);}
    
    
        System.exit(0);
    }
    
}
