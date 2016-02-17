/**
 * Represents a guitar stringed instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class Guitar extends Stringed {

   /**
    * Constructor for Guitar object
    * @param serial Serial number for
    instrument
    */
    public Guitar(int serial) {
        //number of strings is 6, price 500
        super(500, serial, 6);
    }

   /**
    * Returns string representation of
    guitar object
    * @return Returns guitar toString string
    */
    @Override
    public String toString() {
        return "Guitar:\nPrice:" + super.getPrice()
                                 + "\nSerial#: "
                                 + super.getSerial()
                                 + "\nNumStrings: "
                                 + super.getNumStrings();
    }
}