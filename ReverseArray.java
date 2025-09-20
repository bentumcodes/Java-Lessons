public class ReverseArray {
    public static void main(String[] args){
// this program reverses and Array
//initialise arrary A

int[] A = {23,4,2,5,8,10,6};

int[] B = new int[A.length];

//printing the array A
System.out.print("Array of A: "); //A label
for (int k : A){
    System.out.print(k+",");
}System.out.println("");
//traversing through A whiles reverse copying into B

for (int i = A.length-1, j=0; i >= 0;i--,j++){//reverse traverse, as A[] counts down, B[]goes up
    B[j] = A[i];  //the last elements of A[] fills the begining elements of B[]


}//printing the Array B
System.out.print("Array of B: ");
for (int j : B){
    System.out.print(j+",");
}System.out.println("");



    }
    
}
