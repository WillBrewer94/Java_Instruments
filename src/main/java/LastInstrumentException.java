/**
 * Represents an exception, thrown when musician tries
 to sell his last instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class LastInstrumentException extends Exception {

   /**
    * Constructor for lastInstrumentException
    exception
    */
    public LastInstrumentException() {
        super();
    }

   /**
    * Param constructor for lastInstrumentException
    exception
    * @param message Error message for exception
    */
    public LastInstrumentException(String message) {
        super(message);
    }
}