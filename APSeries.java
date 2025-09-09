import java.util.Scanner;

public class APSeries {
    public static void main(String[] args){
        //Arithmetic Progression Series generator
        //User will provide the starting, the interval and limit to generate the AP Series
        Scanner input = new Scanner(System.in);
        System.out.println("Starting No., Interval No., and limit");

        
        int startNo = input.nextInt();
        int intNo = input.nextInt();
        int limitNo = input.nextInt();

        
        //int ap = 0;
        for (int i = 0; i <limitNo; i++){
            int ap = startNo + (i*intNo);//determines the progression
            
            System.out.print(ap + ","); //prints output

        }

    }
    
}
