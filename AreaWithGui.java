import javax.swing.JOptionPane;

public class AreaWithGui {
    //declare the static variables
    public static final double PI = 3.14;
    public static void main(String[] args){
        //using GUI for calculation of Area of a circle

        double radius;
        double area;
        double circumference;
        

        //initiate the input message with gui
        String intro= "Welcome!\n"+ "This program helps you to calculate the area of a circle.\n"+"Are you ready? click 'OK' to start";
        
        JOptionPane.showMessageDialog(null,intro,"AREA CALCULATOR",JOptionPane.INFORMATION_MESSAGE);
        String userInput = JOptionPane.showInputDialog("What is the radius of the circle");

        radius = Double.parseDouble(userInput); //this will convert what the user entered into a double data type

        //calculations of area and circumference

        area = (int)(PI * radius * radius);

        circumference = 2 * PI * radius;

        //display message after computation has been done

        String output = "Radius of circle: "+radius+ "\n"+ "Area of Circle: "+area+ "\n"+ "Circumference of circle: "+circumference;
        JOptionPane.showMessageDialog(null,output,"AREA CALCULATOR",JOptionPane.PLAIN_MESSAGE);

        System.exit(0); //closes the application
    }
    
}
