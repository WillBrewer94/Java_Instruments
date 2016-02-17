/**
 * Represents a stringed instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public abstract class Stringed extends Instrument {
    private int numStrings;

   /**
    * Constructor for Stringed instrument
    * @param price Cost of the instrument
    * @param serial Serial number for the
    instrument
    * @param numStrings Number of strings on the
    instrument
    */
    public Stringed(int price, int serial, int numStrings) {
        super(price, serial);
        this.numStrings = numStrings;
    }

   /**
    * Getter method for numStrings variable
    * @return Returns numStrings int
    */
    public int getNumStrings() {
        return numStrings;
    }

   /**
    * Plays the sound of the stringed
    instrument
    * @return returns the string representation
    of the instrument sound
    */
    @Override
    public String play() {
        return "screeech";
    }
}