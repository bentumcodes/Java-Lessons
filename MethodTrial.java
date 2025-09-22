import java.util.Scanner;

public class MethodTrial {
    static int max(int x,int y){
        if (x > y){
            return x;
         } else
            return y;
    }

    static String userName(String userEmail){
        //this method extracts the userName of a user
        int a = userEmail.indexOf("@");
        String name = userEmail.substring(0,a);
        return name;
    }
    public static void main(String[] args){

    //     int a = 10; int b = 15;

    // int c = max(a,b);
    // System.out.println("The Maximum of "+a+ "and "+ b+ " is "+c);

    
//  MethodTrial x = new MethodTrial();

//         int y = x.max(12,2);
//         System.out.println(y);

Scanner input = new Scanner(System.in);
//test the email method
        System.out.println("Enter your Email Address: ");

        String userEmail = input.nextLine();

        //userName(userEmail);

        System.out.println("Your username is: "+userName(userEmail));




    }






    
    
}
