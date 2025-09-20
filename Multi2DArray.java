public class Multi2DArray {
    public static void main(String[] args){
//Multiply two arrays 
//declaring the arrays

int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
int[][] C = new int[3][3];

//printing array A
System.out.println("Array A: ");

//traversing arraay
for (int i=0;i<A.length;i++){
    for (int j=0;j<A[i].length;j++){
        System.out.print(A[i][j]+ ",");
    }System.out.println("");
}System.out.println("");

System.out.println("Array B: ");
//traversing array B
for (int x[]:B){
    for (int y:x){
        System.out.print(y+",");
    }System.out.println("");
}
//multiplying Array A and B to produce C
for (int i=0;i < A.length;i++){
    for (int j = 0;j<B.length;j++){
            C[i][j] =0;
        for (int k=0;k<C.length;k++){
            C[i][j] = C[i][j]+(A[i][k]* B[k][j]);
        }

    }
}System.out.println("");
//printing Array C:
System.out.println("Array C:");
for (int x[]:C){
    for (int y:x){
        System.out.print(y+",");
    }System.out.println("");
    }System.out.println("");









    }
    
}
