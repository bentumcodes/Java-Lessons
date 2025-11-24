import java.util.Scanner;

public class BookStore {
    private String title;
    private String author;
    private double price;
    private int qty;
    
    //creating a constructor to update variables
    // public BookStore(String bookTitle, String bookAuthor, double bkPrice, int bkQty){
    //     this.title = bookTitle;
    //     this.author = bookAuthor;
    //     this.price = bkPrice;
    //     this.qty = bkQty;
    // }

    //display books
    void displayBooks(){
        System.out.println("Catalogue Details: "+"\n"+
            "BOOK TITLE: "+title+"\n"+
            "AUTHOR: "+ author+"\n"+
            "QUANTITY: "+qty+"\n"+
            "UNIT PRICE: "+price);

    }
     //getter method to get private variables
     public String getTitle(){
            return title;
     }

     //setter for the method
     public void setTitle(String bkTitle){
        this.title = bkTitle;
     }

     public String getAuthor(){
        return author;
     }
     public void setAuthor(String bkAuthor){
        this.author = bkAuthor;
     }

     //getter method to get price
     public double getBookPrice(){
            return price;
     }

     public void setBookPrice(double bkPrice){
        this.price = bkPrice;
     }
     // getter method to get quantity
     public int bkQty(){
        return qty;
     }
     public void setBkQty(int bkQuantity){
        this.qty = bkQuantity;
     }


    public static void main(String[] args){
        //create an object and call the contructor
        // BookStore bk = new BookStore("Much Ado about nothing","John Kennedy",25.0,4);
        // System.out.println(" ");
        // bk.title="How to grow Strong";
        // bk.author = "BrillyBenny";
        // bk.price = 30.00;
        // bk.qty = 10;
        // bk.displayBooks();

//creating an array of the class to take more items

//    BookStore[] bks = new BookStore[3];

        //filling the array with new objects
        // bks[0] = new BookStore("Hardwork","BB",2400, 3);
        // bks[1] = new BookStore("Marriage 101","Mk Dogbe",1500, 5);
        // bks[2] = new BookStore("Korean language","KofiBright", 12000, 23);

        // System.out.println(" ");
        // //accessing the elements in the array created from the book class
        // for (int i =0; i<bks.length;i++){
        //     System.out.println("Book: "+(i+1));
        //      System.out.println("BOOK TITLE: " + bks[i].getTitle() +"\n"+ 
        //                         "AUTHOR: "+ bks[i].getAuthor()+ "\n"+
        //                         "QUANTITY: "+ bks[i].bkQty()+"\n"+
        //                        "UNIT PRICE: "+bks[i].getBookPrice());
        //     bks[i].displayBooks(); //there is no need of using getters because there is a display method already.
        //     System.out.println(" ");
        // }

//allowing users to input the data into the array themselves
/*Scanner input = new Scanner(System.in);

//allow users to determine the number of books to enter at a time
int noBooks;
System.out.println("Enter number of books for the catalogue? ");
noBooks = input.nextInt();
input.nextLine(); // this clears the buffer after the integer has been entered

System.out.println(" ");
int count = 0;

BookStore[] bks = new BookStore[noBooks]; //this creates a customised array object of the class
//looping the book details based on the user input
while (count < noBooks){
System.out.println("=====BOOK: "+(count+1)+"=======");
    System.out.println("Enter Book Title: ");
    String title = input.nextLine();

    System.out.println("Enter Author name: ");
    String auName = input.nextLine();

    System.out.println("Enter unit Price: ");
    double bookPrice = input.nextDouble();

    System.out.println("Enter quantity of books: ");
    int bookqty = input.nextInt();

    input.nextLine();
    //filling object array with the 
bks[count] = new BookStore(title,auName,bookPrice,bookqty);
    System.out.println("Book Successfully Added!");
    
    System.out.println(" ");
    count++;

} count++;

//printing out the items from the book array
System.out.println("\n\n============COMPLETE INVENTORY============");
for (int i =0;i <=bks.length-1;i++){
    System.out.println("Book #: "+(i+1)); //to count the book numbers
    bks[i].displayBooks();
    System.out.println(" ");
}
input.close();
    */

//incase you want to use getters and setters instead of the Constructors
Scanner input = new Scanner (System.in);
System.out.println("Enter the number of books: ");
int noBooks = input.nextInt();
input.nextLine();
int count = 0;
BookStore[] mybook = new BookStore[noBooks];//this creates an empty array

//creat a while loop that would be questioning the user
while (count < noBooks){
    
    mybook[count] = new BookStore(); // this create an empty object to be filled by the setters
    
    System.out.println("=======BOOK NO: "+(count+1)+"=======");
    System.out.println("Enter book title: ");
    String bkTitle = input.nextLine();
    mybook[count].setTitle(bkTitle);

    System.out.println("Enter name of author: ");
    String bkAuthor = input.nextLine();
    mybook[count].setAuthor(bkAuthor);

    System.out.println("Enter unit price: ");
    double bkPrice = input.nextDouble();
    mybook[count].setBookPrice(bkPrice);

    System.out.println("Enter No of Quantities: ");
    int bkQuantity = input.nextInt();
    mybook[count].setBkQty(bkQuantity);

    input.nextLine();

    System.out.println("Book Successfully Added!");
    System.out.println(" ");

    count++;
}count++;

//print the results
System.out.println("==========COMPLETE INVENTORY============");
for (int i =0;i <noBooks;i++){
    System.out.println("====Book NO: "+ (i+1)+"=====");
    mybook[i].displayBooks();

    System.out.println(" ");
}


    }
}
