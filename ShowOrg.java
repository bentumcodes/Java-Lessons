import java.util.Scanner;

public class ShowOrg {
    public static void main(String[] args){

        //this program shows the company a website belongs to
        //ask user to enter the website and then scrape the ending part

        //create a scanner to take the input from user

        Scanner input = new Scanner(System.in);

        System.out.println("\nThis program will help you know the meaning of your domain extension");
        System.out.println("\nEnter the URL of your website: ");

        String userUrl = input.nextLine().toLowerCase();

        //get the domain after the dot in wwww.

        //String domainUrl = userUrl.substring(4, userUrl.length());
        //determine the index of dot in the domain extracted

        //int i = domainUrl.indexOf(".");
        
        //System.out.println(i); to check the index extracted
        
        //getting the domain name

        //String domainExt = domainUrl.substring((i+1), domainUrl.length());
        //System.out.println(domainUrl); to check the domain name extracted
       //System.out.println(domainExt); to check whether the extraction of the extension was successful
       
        //tell users the meaning of the extension extracted
        
        // second option
        String domainExt = userUrl.substring(userUrl.lastIndexOf(".")+1);

        System.out.println(domainExt);
        switch (domainExt){
            case "com" : System.out.println(domainExt + " : means :- Commercial");break;
            case "org" : System.out.println(domainExt + " : means :- Organization");break;
            case "edu" : System.out.println(domainExt + " : means :- Education"); break;
            case "gov" : System.out.println(domainExt + " : means :- Government"); break;

        default : System.out.println("Check the URL and try again!");
            System.exit(1);

        } 

    }
    
}
