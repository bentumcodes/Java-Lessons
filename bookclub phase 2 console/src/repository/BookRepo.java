package repository;
import model.Book;

import java.util.ArrayList;

public class BookRepo {
    private ArrayList<Book> shellBooks = new ArrayList<>();

    //add book to repo
    public void add(Book newBook){
        shellBooks.add(newBook);
    }

    public ArrayList<Book> getAll(){
        return shellBooks; //contains all the book lists and shares with BookService Class
    }

    public Book search(String searchTitle){
        //search through ArrayList with for each loop
        for (Book b : shellBooks){
            if (b.getTitle().equalsIgnoreCase(searchTitle)){
                return b;
            }
        }
        return null;
    }
}
