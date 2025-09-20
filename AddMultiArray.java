public class AddMultiArray {
    public static void main(String[] args){

//adding 3x3 matrix

int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
int[][] B = {{1,5,2},{6,8,4},{3,9,7}};
int[][] C = new int[3][3];

//Printing the elements in A[] 
System.out.print("Array of A: "+"\n");
for (int i=0;i<A.length;i++){
    for (int j=0;j<A[i].length;j++){
        System.out.print(A[i][j]+" ");
    }System.out.println("");
} System.out.println("");


//printing the elements of B[]
System.out.print("Array of B: "+"\n");

for (int i=0;i<B.length;i++){
    for (int j=0;j<B[i].length;j++){
        System.out.print(B[i][j]+" ");
    }System.out.println("");
} 
//add A[] and B[] to give C[]
for (int i =0; i<A.length;i++){
    for (int j=0;j<B.length;j++){
        C[i][j]= A[i][j] + B[i][j];
    
    }
}System.out.print("Array of C: "+"\n");

for (int i=0;i<C.length;i++){
    for (int j=0;j<C[i].length;j++){
        System.out.print(C[i][j]+" ");
    }System.out.println("");
} 

    }
    
}
