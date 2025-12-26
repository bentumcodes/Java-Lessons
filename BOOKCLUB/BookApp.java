import java.util.Scanner;

public class BookApp {
    //this is the Main app where the application runs
    public static void main(String[] args){
        //create scanner object

        Scanner scanner = new Scanner(System.in);

        BookService bkservice = new BookService(scanner);
        
        //get user to determine the number of books
        System.out.println(" ");
        bkservice.welcomeIntro();
        System.out.println(" ");
        System.out.println("How many books do you want enter into the Inventory? ");
        int userBooks = scanner.nextInt();
        scanner.nextLine();

        int i = 0; //counter for books iteration

        while (i < userBooks){
            System.out.println("==========BOOK NO: "+(1+i)+"==========");
            bkservice.addBook();
            System.out.println(" ");
            i++;
        }

        //bkservice.displayAllBooks();

        //user search for books
        System.out.println("Enter title of book to search :");
        String bkSearch = scanner.nextLine();
        bkservice.bookSearch(bkSearch);

        System.out.println(" ");
        //user deletes a book
        bkservice.bookDelete(bkSearch);
        System.out.println("Book succesfully deleted!!"+ "\n" +
                            "See the remaining list...");
        System.out.println(" ");
        bkservice.displayAllBooks();
        
        
    }

}
