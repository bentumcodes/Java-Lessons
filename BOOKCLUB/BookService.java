import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    //this is the logic of the application
    private ArrayList<Book> shellBooks; // shellBooks is an object of the Book Class
    private Scanner scanner;

   public BookService(Scanner scanner) {
      this.scanner = scanner;
      this.shellBooks = new ArrayList<>();//this object accepts inputs from the Scanner
      //as well as connects to the BOOK Class
   }

   public void addBook() {
      System.out.println("Enter Book Title: ");
      String title = this.scanner.nextLine();
      System.out.println("Enter Author's name: ");
      String author = this.scanner.nextLine();
      System.out.println("Unit Price: ");
      double price = this.scanner.nextDouble();
      System.out.println("Book Quantity: ");
      double quantity = this.scanner.nextDouble();
      this.scanner.nextLine();

      Book book = new Book(title, author, price, quantity);
      //populate books into the arrayList
      shellBooks.add(book);
   }
   //method to print out the books

   public void displayAllBooks(){
    //using the for loop to get all the books in the arrayList
   System.out.println("===========BOOKSTORE INVENTORY==========");

    for (int i = 0;i <shellBooks.size();i++){
        System.out.println("BOOK: "+(1+i)+ "\n");
        shellBooks.get(i).displayBookInfo();
        System.out.println(" ");
        

    }
   }
   //method to search for a book on the shelf
   public void bookSearch(String title){
    for (Book book : shellBooks){
        if (book.getTitle().equalsIgnoreCase(title)){//this uses the get function to retrieve data from the arrayList
            System.out.println("Book is Found "+"\uD83D\uDE00");
            book.displayBookInfo();
        
            return; // this terminates the loop to prevent the not found statement
        }
       
    }
     System.out.println("Book is not on the shelf!");
       
   }

   //method to delete a book by search title
   public void bookDelete(String title){
    for (Book book: shellBooks){
        if (book.getTitle().equalsIgnoreCase(title)){//this searches the records for the book
            //get the book title's index from the memory
            int bookID = shellBooks.indexOf(book);
            System.out.println("Are you sure you want to remove the book from the Shell? [Yes / No");
            String userAns = scanner.nextLine().toLowerCase();
            if (userAns == "yes"){
               shellBooks.remove(bookID);
               
            }
            
            book.displayBookInfo();
        }
        System.out.println("Book not found!!");
    }
   }

   public void welcomeIntro(){
        System.out.println("||******************************************   ||");
        System.out.println("|| \uD83D\uDCD6 WELCOME TO IREADCLUB BOOKSTORE. \uD83D\uDED2   ||");
        System.out.println("||*******************************************. ||");
    }
}
