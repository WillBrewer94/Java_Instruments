/**
 * Represents a woodwind instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public abstract class Woodwind extends Instrument {
    private int numHoles;

   /**
    * Constructor for Woodwind instrument
    * @param price Cost of the instrument
    * @param serial Serial number for the
    instrument
    * @param numHoles Number of holes in the
    woodwind instrument
    */
    public Woodwind(int price, int serial, int numHoles) {
        super(price, serial);
        this.numHoles = numHoles;
    }

   /**
    * Getter method for numHoles variable
    * @return returns numHoles int
    */
    public int getNumHoles() {
        return numHoles;
    }

   /**
    * Plays the string representation of
    woodwind instrument sound
    * @return Returns string representation of
    instrument sound
    */
    @Override
    public String play() {
        return "pthbbbbbbbbt";
    }
}