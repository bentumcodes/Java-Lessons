package app;
import controller.BookService;


import java.io.IOException;


public class BookApp {
    //this is the Main app where the application runs. That is ENTRY POINT
    public static void main(String[] args)throws IOException{
        //create scanner object

        BookService bksMainService = new BookService();
        //BookService bkservice = new BookService(scanner);
        
        //call the welcome 
        bksMainService.welcome();
       //bksMainService.howManyBooks();
       while (true){
       bksMainService.actionPanel();
       }

       //bksMainService.bookCollection();
        



    

       
        

       /* //user search for books
        System.out.println("Enter title of book to search :");
        String bkSearch = scanner.nextLine();
        bkservice.bookSearch(bkSearch);

        System.out.println(" ");
        //user deletes a book
        // bkservice.bookDelete(bkSearch);
        // System.out.println("Book succesfully deleted!!"+ "\n" +
        //                     "See the remaining list...");
        // System.out.println(" ");
        */
        
       /*  String paths = "/Users/brillybenny/Desktop/Jenny Lecture/TextIO practical folder/trial/ireadclub.csv";
        bkservice.bookPrint(paths);
        
       bkservice.displayAllBooks();
       */
    }

}
