/**
 * Represents a trumpet brass instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class Trumpet extends Brass {

   /**
    * Constructor for Trumpet instrument
    * @param serial Serial number for the instrument
    */
    public Trumpet(int serial) {
        //number of valves is 3, price is 300
        super(300, serial, 3);
    }

   /**
    * Generates string representation of
    Trumpet object
    * @return Returns toString String of trumpet
    object
    */
    @Override
    public String toString() {
        return "Trumpet:\nPrice:" + super.getPrice()
                                    + "\nSerial#: "
                                    + super.getSerial()
                                    + "\nNumValves: "
                                    + super.getNumValves();
    }
}