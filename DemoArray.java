//demos on Add elements in 2D arrays

public class DemoArray {
    public static void main(String[] args){
    
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {5, 6, 7}
        };

        //running a loop to add the array
       System.out.println("Diagonal Calculation");
        int total =0;
        for (int i =0; i < accounts.length; i++){ 
          total += accounts[i][i];

          System.out.print("The Sum is "+ total + "\n");
        } 
        System.out.println();
        System.out.println("Column calculation");
        int total1=0;
        for (int i =0; i < accounts.length; i++){ 
          total1 += accounts[i][1];

          System.out.print("The Sum is "+ total1 + "\n");
        } 
        System.out.println();
        System.out.println("Row Calculation");
        int total2=0;
        for (int i =0; i < accounts.length; i++){ 
          total2 += accounts[1][i];

          System.out.print("The Sum is "+ total2 + "\n");
        } 

         System.out.println();
         System.out.println("opposite diagonal:");
         int total3 = 0;

         for (int i =0;i < accounts.length; i++){ 
                total3 += accounts[i][accounts.length -1 - i]; //logic is: row + column = size - 1
           System.out.print("The Sum is: " +total3 + "\n");


         }
         

         System.out.println();
         System.out.println("Center of the array:");
         int total4 = 0;

         for (int i =0;i < accounts.length; i++){ 
          for (int j = 0; j < accounts[i].length;j++){ 
            if (i == j && j == accounts.length / 2){ //this selects the center of the array
        
           System.out.print("Both diagonals are: " + accounts[i][j]+""+ "\n");

           }
         }


        }

    }
}
