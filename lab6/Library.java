package lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }
    public void printBooks(){
        for(Book i : this.books){
            System.out.println(i);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : this.books){
            if(StringUtils.included(book.title(), title)){
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : this.books){
            if(StringUtils.included(book.publisher(), publisher)){
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : this.books){
            if(book.year() == year){
                result.add(book);
            }
        }
        return result;
    }
}
