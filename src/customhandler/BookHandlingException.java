package customhandler;

public class BookHandlingException extends Exception{
    //defining a constructor for bookHandlingException class
    public BookHandlingException(String errorMsg){
        //passing the error msg to the super class constructor
        super(errorMsg);
    }
}
