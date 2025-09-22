import java.util.Scanner;

public class EmailMethod {
    
    //create email method. it extracts username from emails
    static String userName(String email){//email is just a placeholder
        //take the limits of the @ in the email
        int a = email.indexOf("@");
        //extract the username and return it
        String name = email.substring(0,a); //begin at 0 and end at the index of @
        return name; //the username is printed to the user

    }
    public static void main(String[] args){
        //take input from user
        Scanner input = new Scanner(System.in);

        System.out.println("This program extracts your username and prints it to you!" + "\n"+
        "Enter your email: ");

        String usermail = input.nextLine();
        //print output

        System.out.println("Your username is "+userName(usermail));
    }
}
