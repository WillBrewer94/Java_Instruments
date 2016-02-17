/**
 * Represents an exception ,thrown when an instrument
 is not owned
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class InstrumentNotOwnedException extends Exception {

   /**
    * Constructor for instrumentNotOwnedException
    exception
    */
    public InstrumentNotOwnedException() {
        super();
    }

   /**
    * Param constructor for instrumentNotOwnedException
    exception
    * @param message Error message for exception
    */
    public InstrumentNotOwnedException(String message) {
        super(message);
    }
}