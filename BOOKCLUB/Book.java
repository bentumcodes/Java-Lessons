public class Book {
     //instant variables
    private String bkTitle;
    private String bkAuthor;
    private double bkPrice;
    private double bkQty;
    //private double totalCost;

    public void displayBookInfo(){
        System.out.println("Title: "+bkTitle+ "\n"+
                            "Author: "+bkAuthor+ "\n"+
                            "Unit Price: "+bkPrice+"\n"+
                            "Quantity: "+bkQty+"\n"+
                            "Total Cost: "+getTotalCost()
        );
    }

    //getters and setters for updating and retriving purposes
    public String getTitle(){return bkTitle;}
    public String getAuthor(){return bkAuthor;}
    public double getPrice(){return bkPrice;}
    public double getQty(){return bkQty;}


    public void setTitle(String title){
        this.bkTitle = title;
    }

    public void setAuthor(String author){
        this.bkAuthor = author;
    }

    public void setPrice(double price){
        this.bkPrice = price;
    }

    public void setQty(double quantity){
        this.bkQty = quantity;
    }

public double getTotalCost(){
    return bkPrice * bkQty;
}

//constructor to append data to the variables

public Book(String title, String author, double price, double quantity){
    this.bkTitle = title;
    this.bkAuthor = author;
    this.bkPrice = price;
    this.bkQty = quantity;
}

}
