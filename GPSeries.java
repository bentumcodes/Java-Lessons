import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args){
        //This is a Geometric Progression Generator

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Start No, Ratio and Limit");


        int startNo = input.nextInt();
        int ratio = input.nextInt();
        int limit = input.nextInt();
        int term = startNo; //this will hold the original value of startNo
        for (int i = 0; i < limit;i++){

            // 1st approach
            //int gp = startNo * (ratio * (i +1));
             //double R = (Math.pow(ratio,i)); //this deals with the exponent
             //int gp = startNo * (int)Math.round(R); //the Math.round would convert the double to integer
          
          // 2nd approach
             System.out.print(term + ",");
             term = term * ratio;
        
            


        }

    }
    
}
