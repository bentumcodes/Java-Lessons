package view;
import model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    
    Scanner scanner = new Scanner(System.in);
    //BookService bks = new BookService();
    //data are in Strings because it will be processed at the controller sessions
    String userTitle;
    String userAuthor;
    String userPrice;
    String userQuantity;
    String userSearch;
    String userOption;
    //display welcome info

    public void welcomeIntro(){
        System.out.println(" ");
        System.out.println("||******************************************   ||");
        System.out.println("|| \uD83D\uDCD6 WELCOME TO IREADCLUB BOOKSTORE. \uD83D\uDED2      ||");
        System.out.println("||*******************************************. ||");
    }
    
    //request for book details
    public String[] userRequest(){
        System.out.println("Enter Book Title: ");
        userTitle= scanner.nextLine();
        System.out.println("Enter author's name: ");
        userAuthor = scanner.nextLine();
        System.out.println("Unit Price: ");
        userPrice = scanner.nextLine();
        System.out.println("Book Quantity");
        userQuantity = scanner.nextLine();
        
        return new String[]{userTitle,userAuthor,userPrice,userQuantity};
    }
    
    //Prompt for number of books to be recorded

    public int userAsk(){
        System.out.println("How many books do you want to enter into the Inventory?");
        int nBooks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");
        return nBooks;
    
    }
    
    public void bookHeader(Integer num){
        System.out.println("=========== BOOK No: "+(num)+"===========");
    }
    public void spacer(){
        System.out.println("");
    }
    //display information from controller
    
public void bookDisplay(ArrayList<Book>myBooks){
    System.out.println("=========== BOOK INVENTORY ===========");
        spacer();
    for (int i = 0; i < myBooks.size(); i++){
        Book b = myBooks.get(i);
    //for (Book books : myBooks){...old for loop
        System.out.println("BOOK: "+ (i + 1));
        System.out.println("Title: "+ b.getTitle());
        System.out.println("Author: "+b.getAuthor());
        System.out.println("Price: "+b.getPrice());
        System.out.println("Quantity: "+b.getQty());
        spacer();
    }
    }

    public String userSearch(){
        System.out.print("Title of the Book you want to search: ");
        userSearch = scanner.nextLine();

        return userSearch;
    }

    public void searchDisplay(Book bkSearch){
        System.out.println("========== SEARCH RESULTS ==========");
        spacer();
        System.out.println("Title: "+ bkSearch.getTitle());
        System.out.println("Author: "+ bkSearch.getAuthor());
        System.out.println("Price: "+ bkSearch.getPrice());
        System.out.println("Quantity: "+ bkSearch.getQty());

    }

    public void bookNotFound(){
        System.out.println("Book not found! Try again");
    }

    //user selects options for action
    public String userAction(){
        System.out.println("Choose from options Below: ");
        spacer();
        System.out.println(" [ 1 ] ---- ADD BOOK"+"\n"+
                           " [ 2 ] ---- SEARCH"+ "\n"+
                           " [ 0 ] ---- EXIT"
        );
        userOption = scanner.nextLine();
        
        return userOption;
    }

    public void goodbyeMsg(){
        System.out.println("Thanks for using the App. GoodBye!");
    }

    public void invalidOption(){
        System.out.println("Invalid Option! Check and Select from the Menu");
    }

}
