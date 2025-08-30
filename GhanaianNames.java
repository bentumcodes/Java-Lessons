import java.util.Scanner;

public class GhanaianNames {
    public static void main(String[] args){
        //This program generates the Ghanaian name for the day one was born

        //create scanner to take user input

        Scanner input = new Scanner(System.in);

        System.out.println("\nDo you want to know your local name which corresponds to the day you were born in Ghana?");
        System.out.println("\nEnter the day you were born? (e.g Monday...): ");

        String userDay = input.nextLine().toLowerCase();
        //to make it gender specific
        
        System.out.println("Enter your gender (male or female): ");

        String userSex = input.nextLine().toLowerCase();

        //using switch case to get the local names

        switch (userDay){
            case "monday" : System.out.println(userDay.toUpperCase()  + " borns are called: ");
                switch (userSex){
                    case "male" : System.out.println("Kojo"); break;
                    case "female" : System.out.println("Adjoa"); break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                }
            break;
            case "tuesday" : System.out.println(userDay+ " borns are called: "); 
                switch (userSex){
                case "male" : System.out.println("Kwabena"); break;
                case "female" : System.out.println("Abena"); break;
            default : System.out.println("Your spelling for the gender is wrong. Check and try again!");}
            break;
            case "wednesday" :  System.out.println(userDay + " borns are called: ");
                switch (userSex){
                case "male" : System.out.println("Kweku"); break;
                case "female" : System.out.println("Akua"); break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                    }
            break;
            case "thursay"  : System.out.println("\n" + userDay+ " borns are called: ");
                switch (userSex){
                case "male" :  System.out.println("Yaw");break;
                case "female" : System.out.println("Yaa");break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                }
            break;
            case "friday"   : System.out.println(userDay + " borns are called: ");
                switch (userSex){
                case "male" : System.out.println("Kofi");break;
                case "female" : System.out.println("Afua");break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                }
            break;
            case "saturday" :   System.out.println(userDay + " borns are calle: ");
                switch (userSex){
                case "male" : System.out.println("Kwame"); break;
                case "female" : System.out.println("Ama"); break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                }
            break;
            case "sunday"   :   System.out.println(userDay + " borns are calle: ");
                switch (userSex){
                case "male" : System.out.println("Kwesi"); break;
                case "female" : System.out.println("Akosua"); break;
                default : System.out.println("Your spelling for the gender is wrong. Check and try again!");
                }
            break;
                
            default :   System.out.println("Check the spelling of the Day and try again!"); 
        }


    }
    
}
