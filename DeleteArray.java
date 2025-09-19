public class DeleteArray {
    public static void main(String[] args){

//deletion of an element in an array
//initialise the array

int[] A = {3,5,2,8,9,10};

//print loop to show the array
for (int i : A){
    System.out.print(i+",");
}

//to remove the element at A[2], overide to the left
//the loop starts from that index and traverse through the array

for (int i =2;i<A.length-1;i++){
    A[i] = A[i+1];
    
}System.out.println("");

//final printout
for (int j=0;j<A.length-1;j++){
    System.out.print(A[j]+",");
}System.out.println("");














    }
    
}
