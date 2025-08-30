import java.util.Scanner;

public class TimesTable3 {
    public static void main(String[] args){
        //this app generates the TimesTable using the FOR LOOP
//12 times table
        //initiate the loop

        //creating the headers for only upto 6
        System.out.println("\n2 TimesTable\t3 TimesTable\t 4 TimesTable\t 5 TimesTable\t 6 TimesTable\t");
        System.out.println("--------------\t--------------\t--------------\t-------------\t-------------\6");

        for (int i = 1;i < 7; i++){
            int x2 = 2 * i;
            int x3 = 3 * i;
            int x4 = 4 * i;
            int x5 = 5 * i;
            int x6 = 6 * i;
            int x7 = 7 * i;
            int x8 = 8 * i;
            int x9 = 9 * i;
            int x10 = 10 * i;
            
            System.out.printf("%2d x %2d =%3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d =%3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d = %3d\t"+
                            "%2d x %2d = %3d%n",2,i,x2,3,i,x3,4,i,x4,5,i,x5,6,i,x6,
                            7,i,x7,8,i,x8,9,i,x9,10,i,x10);

            

           
                            

            }
        
        
        
        
        
            //    int x2 = 2 * i;
        //    int x3 = 3 * i;
        //    int x4 = 4 * i;

        //    System.out.printf("%2d x %2d = %3d\t%2d x %2d = %3d\t%2d x %2d = %3d%n",2,i,x2,3,i,x3,4,i,x4);
           
           
           
            // for (int j=1; j<10;j++){
            //     //trying with the printf function
            //     System.out.printf("%2d x %2d = %3d%n",i, j, (i*j));
            //     //System.out.println(i + " x " + j + " = "+ (i*j));
            // }
            
            
        



    }
    
}
