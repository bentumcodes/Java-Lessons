public class IncreaseArray {
    public static void main(String[] args){
//this program increases the size of an array

int[] A = {2,5,3,10,6};

//create a new array and double the size with reference to A[]

int[] B = new int[2*A.length];

//print array A before the copying
System.out.print("Array of A: ");
for (int j : A){
    System.out.print(j+",");
}System.out.println("");
//traverse through A and copy its elements into B

for (int i=0;i < A.length;i++){
    B[i] =A[i];
}
//print B after the expansion and copying
System.out.print("Array of B: ");
for (int k:B){
    System.out.print(k + ",");
}System.out.println("");



    }
    
}
