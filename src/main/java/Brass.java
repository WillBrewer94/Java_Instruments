/**
 * Represents a brass Instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public abstract class Brass extends Instrument {
    private int numValves;

   /**
    * Brass constructor
    * @param price Cost for the instrument
    * @param serial Serial number for the instrument
    * @param numValves Number of valves in the brass
    instrument
    */
    public Brass(int price, int serial, int numValves) {
        super(price, serial);
        this.numValves = numValves;
    }

   /**
    * Getter for numValves variable
    * @return Returns numValves int
    */
    public int getNumValves() {
        return numValves;
    }

   /**
    * Plays the sound for brass instruments
    * @return returns string representation of
    instrument sound
    */
    @Override
    public String play() {
        return "doot doot";
    }
}