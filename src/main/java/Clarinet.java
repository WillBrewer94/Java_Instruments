/**
 * Represents a clarinet woodwind instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class Clarinet extends Woodwind {

   /**
    * Clarinet constructor
    * @param serial Serial number for
    instrument
    */
    public Clarinet(int serial) {
        //a clarinet has 7 holes, price is 400
        super(400, serial, 7);
    }

   /**
    * Returns string representation of
    clarinet object
    * @return Returns string
    */
    @Override
    public String toString() {
        return "Clarinet:\nPrice:" + super.getPrice()
                                    + "\nSerial#: "
                                    + super.getSerial()
                                    + "\nNumHoles: "
                                    + super.getNumHoles();
    }
}