package tester;

import static  Utils.CollectionUtils.*;
import com.app.core.Book;
import static Utils.IOUtils.*;
import static validation.BooksValidations.*;
import java.util.*;


public class Tester {
    public static void main(String[] args) {
        //try resource to autoclose scanner
        try (Scanner sc = new Scanner(System.in)){
            //defining both hashmap with populatebook map to get all the hardcoded books from popluatelist and
            // Arraylist for cart to save all the cart list
            HashMap<String, Book> booksList = populateBookMap(popluateList());
            ArrayList<Book> cart = new ArrayList<>();
            //boolean to exit from while loop
            boolean exit = false;
            while (!exit){
                try{
                    System.out.println("1.Show all the books available \n2.Add a book to cart \n3.View cart \n4.Checkout");
                    //switch to go to the select option
                    switch (sc.nextInt()){
                        case 1:
                            //printing all the values of map using stream and method reference
                            booksList.values().stream().forEach(System.out::println);
                            break;
                        case 2:
                            System.out.println("Enter the title of the book to be added into the cart");
                            //getting the book name from the user
                            sc.nextLine();
                            //checking if the book is avaliable if not it will throw error
                            Book e = addToCart(sc.nextLine(),booksList);
                            //adding the book object into the cart array list
                            cart.add(e);
                            System.out.println("Book added to your cart successfully");
                            break;
                        case 3:
                            //dislay added books using lamda expression
                            cart.forEach(p->{
                                System.out.println("Title = "+p.getTitle()+
                                        "\nAuthor ="+p.getAuthorName()+
                                        "\nPrice ="+p.getPrice()+
                                        "\nCategory ="+p.getCategorey().name()+
                                        "\nDate of publication ="+p.getPublishDate()
                                );
                            });
                            break;
                        case 4:
                            double total=0;
                            //showing the books that the user added into his cart
                            for(Book temp:cart){
                                System.out.println("Title= "+temp.getTitle());
                                total+=temp.getPrice();
                            }
                            //total of the  book added to cart
                            System.out.println("Total ="+total);
                            //and method to save the object into a file using objectoutputStream
                            addToFile(cart);
                            break;
                        default:
                            System.out.println("Entered option is wrong please try again");
                    }
                }
                //catch block to handle error if any
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}
