/**
 * Represents a percussion instrument
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public abstract class Percussion extends Instrument {
    private int drumDiameter;

   /**
    * Constuctor for percussion object
    * @param price Price for the instrument
    * @param serial Serial number for instrument
    * @param drumDiameter Diameter for the drum
    */
    public Percussion(int price, int serial, int drumDiameter) {
        super(price, serial);
        this.drumDiameter = drumDiameter;
    }

   /**
    * Getter method for drumDiameter variable
    * @return returns drumDiameter int
    */
    public int getDrumDiameter() {
        return drumDiameter;
    }

   /**
    * Plays the sound of the percussion
    instrument
    * @return returns the string sound of the
    percussion object
    */
    @Override
    public String play() {
        return "badum chhhh!";
    }
}