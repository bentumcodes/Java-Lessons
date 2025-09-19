public class InsertArray {
    public static void main(String[] args){
        //inserting an element into an array

        //set up the array by declaring the size

        int[] A = new int [10];
        //pushing element into the array
        A[0] = 3;
        A[1] = 12;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;
        A[5] = 2;

        //lets print the elements
        //  for (int i : A){
        //    System.out.print(i+",");
        // }

        //inserting 15 at A[3]
        //shifting elements to occupy empty spaces
        for(int j=6;j>3;j--){//6 is number of elements present
            A[j]=A[j-1];
             
        }A[3]= 15;
        System.out.println("");
         for(int i:A)
         System.out.print(i+",");
         System.out.println("");





    }
    
}
