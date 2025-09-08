import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumReverse {
    public static void main(String[] args){
        //this program reverses a number

        //display Gui for user
        String intro= "This App reverses any number you give it.\n"+
                        "Do you want to it a try?\n"+
                        "Then Click 'OK'"; //displays welcome message
        JOptionPane.showMessageDialog(null,intro,"NUMBER REVERSE",JOptionPane.INFORMATION_MESSAGE);

        Scanner input = new Scanner(System.in);

        //Ask user to input a number from 2 digits

        String userMessage = JOptionPane.showInputDialog("Enter your number here: [2digits and above]");
        //gui input display takes input from user

        int userNo = Integer.parseInt(userMessage);//this will convert the user input into integer

        
        ; //it counts the number of times the loop will go through the digits
        int r;
        int rev=0; //stores the reversed number as the looping is going on
        
        //Loop numbers to extract the digits
        while (userNo >0){
            r = userNo % 10;
            rev = (rev *10)+ r; //calculates the reverse of the user number
            userNo = userNo /10;
           
        } //display the results using GUI
        
        String output = "The reverse of "+userMessage+ " is: "+ rev;
        //System.out.println(output);//testing output before gui
        JOptionPane.showMessageDialog(null,output,"NUMBER REVERSE APP",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
    
}
