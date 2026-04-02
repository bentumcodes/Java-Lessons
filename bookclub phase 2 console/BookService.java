
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class BookService {
    //this is the controller of the application
    // call book collection repo from the Book Repo class
    BookRepo bkr = new BookRepo();
    BookView bkView = new BookView();

  
   public void addBook(String title, String author,double price, int quantity) {
         //add books to the repo directly
            bkr.add(new Book(title, author, price, quantity));//this is the Book Constructor

   }



   //collect book information from View
   public void bookCollection(){
    bkView.bookDisplay(bkr.getAll());
   }

   //Welcome info, call from BookView Class

   public void welcome(){
    bkView.welcomeIntro();
    
   }

   //number of numbers user want to input into the system
public void howManyBooks(){
    int noOfBooks = bkView.userAsk(); //input from BookView,gets in here
    
    //start looping through the number requested
    int i = 0;
    while (i < noOfBooks){
        bkView.bookHeader(i+1); //from view class
        String [] input = bkView.userRequest();
        addBook(input[0],input[1],Double.parseDouble(input[2]),Integer.parseInt(input[3]));
        bkView.spacer();

        i++;
    }
}
   
//search engine

public void bookSearch(){
 String userBkSearchTitle = bkView.userSearch();
 Book result = bkr.search(userBkSearchTitle);

 //controller asks Repo if the book is available
 if (result != null){
    bkView.searchDisplay(result);
 }
 else {
    bkView.bookNotFound();
    //System.exit(0); //ends the program there
 }
}

//user options
public void actionPanel(){
 
    String optionSelected = bkView.userAction();
    try {
     int choice = Integer.parseInt(optionSelected);
            
    switch (choice) {
        case 0: bkView.goodbyeMsg();
                System.exit(0);
                break;
        case 1: howManyBooks();
                break;
        case 2: bookSearch();
                break;
    
        default:
            bkView.invalidOption();
            break;
    }
}
catch(NumberFormatException e){
    bkView.invalidOption();
}
}


   /* 
   public  userRequest(){
    bkView.userAsk();
   }
   /*
   //print out come into a text file
   public void bookPrint(String path){
        //create a folder
        
        // writes to file
        try {
            File myBook = new File(path);
            //myBook.mkdir();
            PrintWriter  myBookList = new PrintWriter(myBook);
                //set CSV file header
                myBookList.println("Title,Author,Price,Quantity,Total Cost");

                //loop through books
                for (Book book : shellBooks){
                    double totalCost = book.getTotalCost();
                    myBookList.printf("%s,%s,%.2f,%.0f,%.2f%n",
                        book.getTitle(),
                        book.getAuthor(),
                        book.getPrice(),
                        book.getQty(),
                        totalCost
                    );
                }
            
                //    myBookList.println("===========BOOKSTORE INVENTORY==========");
                //    for (int j = 0;j <shellBooks.size();j++){
                //     myBookList.println("BOOK: "+(1+j)+ "\n");
                //     myBookList.println(shellBooks.get(j).toString());
                //     myBookList.println();
                //    }
                    myBookList.close();
                    System.out.println("Successfully Written in a log file");
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

   

  
   //method to search for a book on the shelf
   public void bookSearch(String title){
    for (Book book : shellBooks){
        if (book.getTitle().equalsIgnoreCase(title)){//this uses the get function to retrieve data from the arrayList
            System.out.println("Book is Found "+"\uD83D\uDE00");
           // book.displayBookInfo();
        
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
            
            //book.displayBookInfo();
        } 
            */
       // System.out.println("Book not found!!");
   // }
  // }


}
