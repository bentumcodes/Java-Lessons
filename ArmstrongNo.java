import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args){
        //This programs determines whether a given number is an Armstrong Number.
        //When the sum cubic (power 3) of the digits in a number is equal to the orginal number then its Armstrong

        //let test with a mumber

        // int x = 153;
        // int y=0; // this will collect the total cubic of the digits
        // int m = x; //holds the number before the loop starts
        // while (x > 0){
        //     int r = x %10;
        //     y = y + (r * r * r);
        //     x = x/10; //this separates individual digits
            
        //     System.out.print("\n" +y+ "\n");
        // }
        // //System.out.println(n);
        // //System.out.println(x);//this is to check the final value of x which is zero
        // if (y == m){
        //     System.out.println("The number is Armstrong");
        // }
        // else {
        //     System.out.println("not an Armstrong");
        // }

        //allow a user to input a 2 to 3 dig
        Scanner input = new Scanner(System.in);
        System.out.println("\nTHIS HELP TO DETERMINE WHETHER A NUM IS ARMSTRONG OR NOT");
        System.out.println("Enter a number: ");

        int userNo = input.nextInt();

        int collect = 0;
        int finalNo = userNo;
        int count =0;
        while (userNo >0){
            int r = userNo %10; //this collects the rememder
            collect = collect + (r * r * r); //cubic of r
            userNo = userNo / 10; //this separates individual digits
            count++;
            System.out.println("\n" + "Calculation: " +count +" = "+ collect+ "\n"); // to see how the division is done

        }
        if (finalNo == collect){
            System.out.println("The number is Armstrong: " + " " + collect);
        }
        else {
            System.out.println("It is not Armstrong, try again with (153)");
        }

    }
    
}
