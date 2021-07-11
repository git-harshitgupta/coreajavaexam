package validation;

import com.app.core.Book;
import customhandler.BookHandlingException;

import java.util.ArrayList;
import java.util.HashMap;


public class BooksValidations {
    //method to verify in the book is available or not
    public static Book addToCart(String title, HashMap<String,Book> bookList) throws BookHandlingException {

        ArrayList<Book> bookArrayList = new ArrayList<>(bookList.values());
        for(Book temp:bookArrayList){
            //condition to match book
            if(temp.getTitle().toUpperCase().replaceAll("\\s","").equals(title.toUpperCase().replaceAll("\\s",""))){
                //if available
                return temp;
            }
        }
        //if not avaliable throwing a custom exception
        throw new BookHandlingException("Book is not available");
    }
}
