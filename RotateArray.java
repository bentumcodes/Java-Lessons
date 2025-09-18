import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        // initialise an array
        //this exercise is about rotating an array in the left direaction

        int[] A = {3,25,6,1,8,5,10,13};

        //let hold the first element in a temp variable

        // int temp = A[0];
        
        // //traversing the array
        // for (int i=1;i <A.length;i++){
        //     A[i-1] = A[i];
            
            
        // System.out.print(A[i]+ ",");

        
        // }   A[A.length-1]= temp; 
        // System.out.println("");
        // for (int j : A){
        //     System.out.print(j+",");
        // }

        //For right shifting to the right
        //set temp to hold the last element
    
        //traverse the array
        //for k number of shifts iterate the last numbers
//let user determine number of shifts
System.out.println("How many times do you want to shift the array\n" +"[ A = {3,25,6,1,8,5,10,13}] to the right?: ");

Scanner input = new Scanner(System.in);
int k = input.nextInt();

        for (int i = 0; i<k;i++){
            int temp = A[A.length-1];
    //     int temp = A[B];
            for (int j = A.length-1;j>0;j--){        
                A[j] = A[j-1];
            } A[0] = temp;
            
       }  
        for (int i:A)
            System.out.print(i+",");
            System.out.println("");
            //System.out.println(A[1]);
        // for (int j : A){
        //     System.out.print(j+",");
        
    }
    
}
