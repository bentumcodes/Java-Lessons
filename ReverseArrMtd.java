public class ReverseArrMtd {
    //a method that reverses arrays
    static int[] rev(int[] A, int n){
        for (int k =0;k < n; k++){
           int temp = A[A.length-1]; 
           
            for (int i = A.length-1;i > 0;i--){
                A[i] = A[i-1];
            }A[0] = temp;
    }return A;
    }
public static void main(String[] args){
//declare array and call left shift method

int[] A ={3,5,10,9,12,8};
for (int j : rev(A,3)){
    System.out.print(j+",");
} System.out.println("");


    }
    
}
