public class MaxMethod {
//a method that finds the maximum element in an array
    static int x(int A[]){
        int max = A[0];
        for (int i =1;i < A.length;i++){
            if (A[i]> max){
                max = A[i];
            }
        }return max;
    }
   public static void main(String[] args){
    //apply the array method
    int[] b = {2,20,95,6,354,9};

    System.out.println(x(b));


   } 
    
}
