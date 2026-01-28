public class LeetcodeArray4 {
    public static void main(String[] args){
        //Check who is wealthier

        int[][] arr = new int[][]{{1,5},{7,3},{3,5}};

        //print out arrays
       
        int maxNo =0;
        //System.out.println("The Wealthiest amount is: ");
        for (int i =0; i < arr.length;i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length;j++){

                sum += arr[i][j];
            
        }
        System.out.println("Customer "+(i+1)+":" +sum);
        if ( sum > maxNo){
            maxNo = sum;
        }
}
        System.out.println();
        System.out.println("The maximum number is: "+maxNo);
    }

}
