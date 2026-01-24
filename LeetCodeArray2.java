public class LeetCodeArray2 {
    public static void main(String[] args){
        //Description: Given an array arr of integers, return how many of them contain
        // an even number of digits
        //meaning count the individual digits in the array if they sum up to 2 then they are even
        //how many of such numbers are there
        
        int[] arr = {12,3454,2,63,786};

        //traversing the array

        int count=0;
        System.out.println("Numbers with even digits: ");
       
        for (int i=0;i < arr.length;i++){
            
            if ((String.valueOf(arr[i]).length()) % 2==0){
              System.out.print(arr[i]+", ");
               count++;
            }
           
        }
        
        //print number of counts so far
         System.out.println();
        System.out.println("No of counts: "+count);
    }
}
