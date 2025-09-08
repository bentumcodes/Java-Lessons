import javax.swing.JOptionPane;

public class FigureToWords {
    public static void main(String[] args){

        //This program converts Figures to Words from 0 -20
        //Allow user to give the number
        //Adding a GUI instead of console for the output
        String intro = "This App converts numbers from 0 to 20 into words\n" +
                        "Are you ready to start? Then click 'OK'";
        JOptionPane.showMessageDialog(null,intro,"FIGURE TO WORDS", 1);
        //Scanner input = new Scanner(System.in);

        //System.out.println("\nEnter you number: ");
        //int userNo = input.nextInt();
    
        //using GUI instead of console for the input
        String userInput = JOptionPane.showInputDialog("Enter a number [between 0 and 20]: ");
        int userNo = Integer.parseInt(userInput);

        int actualNo = userNo;
        int counter = 0;
        int r=0;
        int res = 0;
        
        //while loop to break input into digits

        while (userNo > 0){
            r = userNo % 10; // to get the last number
            res = r + (res * 10);
            userNo /=10; // divide to remove the last number
            counter++;
            //System.out.println(counter);
            //System.out.println(res);
        }
        //System.out.println(counter);
        if (counter ==0 || counter == 1){
            switch (r){
                case 0 : JOptionPane.showMessageDialog(null,"zero","FIGURE TO WORDS",0); break;
                case 1 : JOptionPane.showMessageDialog(null,"One","FIGURE TO WORDS",0); break;
                case 2 : JOptionPane.showMessageDialog(null,"Two","FIGURE TO WORDS",0); break;
                case 3 : JOptionPane.showMessageDialog(null,"Three","FIGURE TO WORDS",0); break;
                case 4 : JOptionPane.showMessageDialog(null,"Four","FIGURE TO WORDS",0); break;
                case 5 : JOptionPane.showMessageDialog(null,"Five","FIGURE TO WORDS",0); break;
                case 6 : JOptionPane.showMessageDialog(null,"Six","FIGURE TO WORDS",0); break;
                case 7 : JOptionPane.showMessageDialog(null,"Seven","FIGURE TO WORDS",0); break;
                case 8 : JOptionPane.showMessageDialog(null,"Eight","FIGURE TO WORDS",0); break;
                case 9 : JOptionPane.showMessageDialog(null,"Nine","FIGURE TO WORDS",0); break;
                default : JOptionPane.showMessageDialog(null,"Check and Try Again!","FIGURE TO WORDS",0); break;
            }
        }
            if (counter == 2){
                if (actualNo >=10 && actualNo <= 20){
                switch (actualNo){
                case 10 : JOptionPane.showMessageDialog(null,"Ten","FIGURE TO WORDS",0); break;
                case 11 : JOptionPane.showMessageDialog(null,"Eleven","FIGURE TO WORDS",0); break;
                case 12 : JOptionPane.showMessageDialog(null,"Twelve","FIGURE TO WORDS",0); break;
                case 13 : JOptionPane.showMessageDialog(null,"Thirteen","FIGURE TO WORDS",0); break;
                case 14 : JOptionPane.showMessageDialog(null,"Fourteen","FIGURE TO WORDS",0); break;
                case 15 : JOptionPane.showMessageDialog(null,"Fifteen","FIGURE TO WORDS",0); break;
                case 16 : JOptionPane.showMessageDialog(null,"Sixteen","FIGURE TO WORDS",0); break;
                case 17 : JOptionPane.showMessageDialog(null,"Seventeen","FIGURE TO WORDS",0); break;
                case 18 : JOptionPane.showMessageDialog(null,"Eighteen","FIGURE TO WORDS",0); break;
                case 19 : JOptionPane.showMessageDialog(null,"Nineteen","FIGURE TO WORDS",0); break;
                case 20 : JOptionPane.showMessageDialog(null,"Twenty","FIGURE TO WORDS",0); break;
                default : JOptionPane.showMessageDialog(null,"Check and Try Again!","FIGURE TO WORDS",0); break;
                }
        
        } 
        }
    }
    
}
