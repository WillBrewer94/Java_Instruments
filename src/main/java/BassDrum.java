/**
 * Represents a bass drum percussion instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class BassDrum extends Percussion {
   /**
    * BassDrum constructor
    * @param serial Serial number for the
    bassdrum
    */
    public BassDrum(int serial) {
        //bassdrum has a diameter of 5, price is 100
        super(100, serial, 5);
    }

   /**
    * @return returns the string
    representation of the bassdrum object
    */
    @Override
    public String toString() {
        return "Bass Drum:\nPrice:" + super.getPrice()
                                    + "\nSerial#: "
                                    + super.getSerial()
                                    + "\nDrumDiameter: "
                                    + super.getDrumDiameter();
    }
}