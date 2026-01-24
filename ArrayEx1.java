public class ArrayEx1 {
    public static void main(String[] args){
// 1D array in addition in sequence
int[] arr = {2,6,9,10,4};

//loop to add the sequence
for (int i=1;i < 5;i++){
 arr[i]= arr[i]+arr[i-1];
}
 for (int k = 0;k < arr.length;k++){
    System.out.print(arr[k]+ ", ");
 }
    }
    
}
