/**
 * Represents an exception thrown when an
 instrument is already owned
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class InstrumentAlreadyOwnedException extends Exception {
   /**
    * Constructor for instrumentAlreadyOwnedException
    exception
    */
    public InstrumentAlreadyOwnedException() {
        super();
    }

   /**
    * Param constructor for instrumentAlreadyOwnedException
    exception
    * @param message Error message for exception
    */
    public InstrumentAlreadyOwnedException(String message) {
        super(message);
    }
}