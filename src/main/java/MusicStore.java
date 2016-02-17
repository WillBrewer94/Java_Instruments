/**
 * Test class for Instrument assignment
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class MusicStore {
    private int count = 0;
   /**
    * Main method for MusicStore test class
    * @param args Command line arguments
    * @throws NotEnoughFundsException exception when
    amount of funds runs out
    * @throws InstrumentAlreadyOwnedException exception
    when instrument bought is already owned
    * @throws InstrumentNotOwnedException exception when
    sold instrument is not owned
    * @throws LastInstrumentException exception when last instrument
    is sold
    */
    public static void main(String[] args) throws NotEnoughFundsException,
                             InstrumentAlreadyOwnedException,
                             InstrumentNotOwnedException,
                             LastInstrumentException {

        MusicStore store = new MusicStore();
        store.run();
    }

   /**
    * Driver code for Music Store class
    * @throws NotEnoughFundsException exception when
    amount of funds runs out
    * @throws InstrumentAlreadyOwnedException exception
    when instrument bought is already owned
    * @throws InstrumentNotOwnedException exception when
    sold instrument is not owned
    * @throws LastInstrumentException exception when last instrument
    is sold
    */
    public void run() throws NotEnoughFundsException,
                             InstrumentAlreadyOwnedException,
                             InstrumentNotOwnedException,
                             LastInstrumentException {

        Musician m = new Musician(1000, "Kevin Parker");

        //getName() and getFunds()
        System.out.println("Welcome to the music store " + m.getName() + "!");
        System.out.println("Funds: " + m.getFunds());

        //Instrument constructors
        Instrument guitar = new Guitar(generateSerial());
        Instrument clarinet = new Clarinet(generateSerial());
        Instrument bassDrum = new BassDrum(generateSerial());
        Instrument trumpet = new Trumpet(generateSerial());

        //Instrument toString() and play()
        System.out.println("\nMusic Store Inventory: ");
        System.out.println("\n" + guitar.toString());
        System.out.println("Sound: " + guitar.play());
        System.out.println("\n" + clarinet.toString());
        System.out.println("Sound: " + clarinet.play());
        System.out.println("\n" + bassDrum.toString());
        System.out.println("Sound: " + bassDrum.play());
        System.out.println("\n" + trumpet.toString());
        System.out.println("Sound: " + trumpet.play());

        //purchase
        m.purchase(guitar);
        m.purchase(bassDrum);
        System.out.println("Funds: " + m.getFunds() + "\n");

        //sell
        m.sell(bassDrum);
        System.out.println("Funds: " + m.getFunds() + "\n");

        //LastInstrumentException
        m.sell(guitar);
        System.out.println("Funds: " + m.getFunds() + "\n");

        //InstrumentNotOwnedException
        m.sell(trumpet);
        System.out.println("Funds: " + m.getFunds() + "\n");

        //InstrumentAlreadyOwnedException
        m.purchase(guitar);
        System.out.println("Funds: " + m.getFunds() + "\n");

        //NotEnoughFundsException
        m.purchase(trumpet);
        System.out.println("Funds: " + m.getFunds() + "\n");
        m.purchase(clarinet);
        System.out.println("Funds: " + m.getFunds() + "\n");
    }

   /**
    * Generates a serial number based on the
    number of instruments made
    * @return returns the serial number int
    */
    public int generateSerial() {
        count++;
        return count;
    }
}