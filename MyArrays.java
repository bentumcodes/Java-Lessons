public class MyArrays {
    public static void main(String[] args){

// this is a practice on the right shifting of arrays by a step
// to shift for a number of times
int k = 3; //the shifting will be done for 3 times
int[] A = {3,6,10,4,7,9,5};

//print array before the shift
for (int j :A){
    System.out.print(j+",");
    
}System.out.println("");
//loop to be grabing the last elements whiles shifting to right
//grab the last element and store in a temp variable

for (int i =0; i<k;i++){
    int temp = A[A.length-1];
    
//loop to shift the elements
    for (int m=A.length-1; m >0; m--){//this counts downwards
        A[m] = A[m-1];

}  A[0] = temp;      // append the removed element into the front, A[0]
   }   
//print out the new array
for (int i : A){
    System.out.print(i+",");
    
}System.out.println("");




    }
}
