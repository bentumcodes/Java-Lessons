public class Book {
     //instant variables
    private String bkTitle;
    private String bkAuthor;
    private double bkPrice;
    private int bkQty;
    private double amt;
    //private double totalCost;

    

    //getters and setters for updating and retriving purposes
    public String getTitle(){return bkTitle;}
    public String getAuthor(){return bkAuthor;}
    public double getPrice(){return bkPrice;}
    public int getQty(){return bkQty;}


    public void setTitle(String title){
        this.bkTitle = title;
    }

    public void setAuthor(String author){
        this.bkAuthor = author;
    }

    public void setPrice(double price){
        this.bkPrice = price;
    }

    public void setQty(int quantity){
        this.bkQty = quantity;
    }

public double getTotalCost(){
     amt = bkPrice * bkQty;
    return amt;
}

//constructor to append data to the variables

public Book(String title, String author, double price, int quantity){
    this.bkTitle = title;
    this.bkAuthor = author;
    this.bkPrice = price;
    this.bkQty = quantity;
}

}
