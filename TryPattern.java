public class TryPattern {
    public static void main(String[] args){
        //try to generate a pattern using for loop
        int count =1;
        for (int i =1;i <=5;i++){ //outer loops represents columns/headings
            //System.out.print(5+i+" ");
            for (int j =1;j <=5;j++){ //inner loops represents rows/data
                //System.out.print(count + " ");
                System.out.format("%02d ",count); //this formats it with equal decimal spaces (2)
                count++; //this records the number of looping going on
            }
            System.out.println("");
            //this will print spaces after every outer loop
        }
    }
    
}
