package Utils;
import com.app.core.Book;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOUtils {
    //method to store the cart values into a file
    public static void addToFile(ArrayList<Book> cartList) throws Exception {
        //try resource to auto close objectoutputstream
        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Cart.ser"))){
        //writing the obj into file
        obj.writeObject(cartList);
        }
    }

}
