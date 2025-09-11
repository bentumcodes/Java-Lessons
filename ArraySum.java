public class ArraySum {
    public static void main(String[] args){
        //Finding the sum using array. One-Dimensional

        int[] A = {3,9,7,8,12,6,15,5,4,10};

        int sum = 0;

        for (int i=0;i < A.length;i++){

            sum = sum + A[i];

            
        }System.out.println("The total sum of the array, A is : "+sum);

    }
    
}
