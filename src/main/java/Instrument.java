/**
 * Represents the base instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public abstract class Instrument {
    private int price;
    private int serial;

   /**
    * Base instrument constructor
    * @param price Cost of the instrument
    * @param serial number for the instrument
    */
    public Instrument(int price, int serial) {
        this.price = price;
        this.serial = serial;
    }

   /**
    * Getter for price variable
    * @return Returns price int
    */
    public int getPrice() {
        return price;
    }

   /**
    * Getter for serial number variable
    * @return Returns serial number int
    */
    public int getSerial() {
        return serial;
    }

    /**
    * Abstract method for play,
    plays the sound of the instrument
    * @return Returns string representation of
    instrument sound
    */
    public abstract String play();
}