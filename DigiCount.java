public class DigiCount {
    public static void main(String[] args){
        //digit counting by removing last digits

        int x = 123456;
        int count = 0;
        while (x >0){
            x = x /10;
            count++;
            System.out.println("The number is: "+x);
        }
        System.out.println("Total number of counts: "+ count);

    }
    
}
