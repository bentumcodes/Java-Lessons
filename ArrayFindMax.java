public class ArrayFindMax {
    public static void main(String[] args){
        //finding the maximum number in a array

        int[] A = {1,105,9,101,32,12,6,15,5,90,10};

        //int max = A[0];

        // //traversing array
        // for (int i = 0;i < A.length;i++){
            
        //     if (A[i] > max){
        //         max = A[i];
        //     }

        // }System.out.println("The Maximum number in the array is: "+max);

        //find the max and 2nd max value
        int max1,max2;
         max1 = max2 = A[0];

         for (int i=0;i < A.length;i++){
            if (A[i] > max1){
                
                max2 = max1;
                max1 = A[i];
                
            }else if (A[i] > max2){
                max2 = A[i];
                
            }
         }System.out.println("The maximum no. in the array is: " + max1);
         System.out.println("The 2nd maximum is: "+max2);
    }
    
}
