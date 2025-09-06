import java.util.Scanner;
import javax.swing.JOptionPane;

public class TryGui {
    public static void main(String[] args){
        //trying out Gui to work with console applications
        String name = JOptionPane.showInputDialog("Enter your name and press 'OK");
        
        JOptionPane.showMessageDialog(null,"Welcome! "+ name,"GREETINGS",JOptionPane.QUESTION_MESSAGE);
    }
    
}
