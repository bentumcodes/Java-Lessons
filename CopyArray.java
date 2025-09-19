public class CopyArray {
    public static void main(String[] args){

//this program copies Array A into B

int[] A = {3,12,20,4,6,9,7};

int[] B = new int[A.length];

//priting the elements of A
System.out.println("Array of A: ");//a label
for (int k: A){
    System.out.print(k + ",");
}System.out.println("");

//traverse through A whiles copying into B

System.out.println("Array of B: ");
for (int i = 0; i < A.length;i++){

    B[i] = A[i];
} for (int j : B){      // printing the elements of B
    System.out.print(j + ",");
}System.out.println("");



    }
    
}
