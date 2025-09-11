public class ArraySearch {
    public static void main(String[] args){
        //Finding elements with array

        int x =6; //this is the key to be searched

        int[] A = {3,9,7,8,12,6,15,5,4,10};
        //using for each loop
        for (int i=0;i < A.length;i++){
            if (x == A[i]){
                System.out.println(i);
                System.exit(0);
            }
            
        }System.out.println("Can't be found");
    }
    
}
