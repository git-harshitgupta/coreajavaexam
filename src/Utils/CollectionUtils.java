package Utils;
import com.app.core.Book;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.app.core.Categorey.*;

public class CollectionUtils {
    //method to return a list of book
    public static ArrayList<Book> popluateList(){
        ArrayList<Book> bookList = new ArrayList<>();
        try{
//            String title, String authorName, double price, Categorey categorey, LocalDate date
            //add books information to list
            bookList.add(new Book("Life of Pie","Yann Martel",1000,ACTION,LocalDate.parse("2012-05-15")));
            bookList.add(new Book("Little Women","Louisa May",750,CLASSICS,LocalDate.parse("2011-06-20")));
            bookList.add(new Book("Circle","Madeline Miller",1500,FANTASY,LocalDate.parse("2014-01-05")));
            bookList.add(new Book("Ninth House","Leigh Bardugo",600,FANTASY,LocalDate.parse("2018-11-15")));
            bookList.add(new Book("Carrie","Stephan King",500,HORROR,LocalDate.parse("2011-12-25")));
            bookList.add(new Book("Fault in our star","John Green",900,LOVE,LocalDate.parse("2017-05-15")));
        }catch (Exception e){
            System.out.println("Error in popluateList");
        }
        //returing all the list of book
        return bookList;
    }
    //method for storing the list of book to map
    public static HashMap<String,Book> populateBookMap(ArrayList<Book> bookList){
        HashMap<String,Book> bookMap = new HashMap<>();
        bookList.forEach(p->{
            //transfering the value of list into map
            bookMap.put(p.getTitle(),p);
        });
        //returing the map of books
        return bookMap;
    }
}
