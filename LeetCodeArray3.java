public class LeetCodeArray3 {
    public static void main(String[] args){
        //concatenation of arrays
        int[] arr = {7,8,3,9};
        int[] ans = new int[arr.length *2];
        //traversing array
        for (int i = 0; i < arr.length;i++){
            ans[i]= arr[i];
            ans[arr.length + i]= arr[i]; //duplication of array
        System.out.print(ans[i]+", ");
        }
        //printing of final array
        System.out.println();
       for (int j=0;j < ans.length;j++){
        System.out.print(ans[j]+", ");
       }
    
    }
}
