/**
 * Represents an exception, thrown when a musician
 tries to buy an instrument with funds he doesn't have
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class NotEnoughFundsException extends Exception {

   /**
    * Constructor for notEnoughFundsException
    exception
    */
    public NotEnoughFundsException() {
        super();
    }

   /**
    * Param constructor for notEnoughFundsException
    exception
    * @param message Error message for exception
    */
    public NotEnoughFundsException(String message) {
        super(message);
    }
}