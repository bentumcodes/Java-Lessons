import java.util.Scanner;

public class BookStoreInv {
    //Abridged version of Bookstore inventory using methods, switch, loops etc

    //creating scanner object
    private Scanner scanner;
    private String bkTitle;
    private String bkAuthor;
    private double bkPrice;
    private int bkQty;
    private double bkTotalCost;

    //create a constructor to handle the Scanner class
    public BookStoreInv(Scanner scanner){
        this.scanner = scanner;
    }
    //User adds books to Inventory
    public void addBook(){
        System.out.println("========Welcome: Add Book to Inventory ==========");
        System.out.println("Enter Book Title: ");
        this.bkTitle = scanner.nextLine();
        System.out.println("Enter Author's name: ");
        this.bkAuthor = scanner.nextLine();
        System.out.println("Unit price: ");
        this.bkPrice = scanner.nextDouble();
        System.out.println("Book Quantity: ");
        this.bkQty = scanner.nextInt();
        scanner.nextLine();

    }
    //Book total cost
    public double bookCost(){
        //local variable is needded here to perform some processes
        double bookTotalCost = bkPrice * (double)bkQty;
        this.bkTotalCost = bookTotalCost;
        return bkTotalCost;
    }
    //Display information to user
    public void displayInventory(){
        System.out.println("=========BOOKSTORE INVENTORY==========");
        System.out.println("TITLE: "+bkTitle+ "\n"+
                            "Author: "+bkAuthor+ "\n"+
                            "Unit Price: "+bkPrice+ "\n"+
                            "Quantity: "+bkQty+ "\n"+
                            "Total Cost: "+bookCost());
        
    }
    public static void main(String[] args){
        
        //creating objecs of the class
        Scanner scanner = new Scanner (System.in);
        BookStoreInv bki = new BookStoreInv(scanner);
        
        bki.addBook();
        bki.displayInventory();


    }
}
