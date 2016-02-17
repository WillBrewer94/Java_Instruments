import java.util.ArrayList;
/**
 * Represents a musician
 * @author Will Brewer
 * @version 1.0 Oct. 18 2015
 */
public class Musician {
    private ArrayList<Instrument> instList;
    private int funds;
    private String name;

   /**
    * Constructor for musician object
    * @param funds Total amount of money
    the musician has
    * @param name Name for the musician
    */
    public Musician(int funds, String name) {
        instList = new ArrayList<Instrument>();
        this.funds = funds;
        this.name = name;
    }

   /**
    * Getter method for funds variable
    * @return Returns funds int variable
    */
    public int getFunds() {
        return funds;
    }

   /**
    * Getter method for name variable
    * @return Returns name string variable
    */
    public String getName() {
        return name;
    }

   /**
    * Returns the instrument at the given index
    * @param index Index of instrument in
    instList ArrayList
    * @return returns instrument at given index
    */
    public Instrument getInstrument(int index) {
        return instList.get(index);
    }

   /**
    * Purchases the given instrument,
    adding it to the array list
    * @param inst Instrument to be added to instList
    ArrayList
    * @throws NotEnoughFundsException exception when
    amount of funds runs out
    * @throws InstrumentAlreadyOwnedException exception
    when instrument bought is already owned
    */
    public void purchase(Instrument inst) throws NotEnoughFundsException,
                                        InstrumentAlreadyOwnedException {
        int serial = inst.getSerial();
        boolean owned = false;

        for (int i = 0; i < instList.size(); i++) {
            if (serial == instList.get(i).getSerial()) {
                owned = true;
            }
        }

        try {
            if (!owned) {
                if (inst.getPrice() > funds) {
                    //NotEnoughFundsException
                    throw new NotEnoughFundsException("Not Enough"
                                     + "Funds to Buy Instrument!");

                } else {
                    instList.add(inst);
                    funds -= inst.getPrice();
                    System.out.println("\nInstrument: \n"
                                      + inst.toString()
                                      + "\nbought!");
                }

            } else {
                //InstrumentAlreadyOwnedException
                throw new InstrumentAlreadyOwnedException("Instrument "
                                                 + "is already owned!");
            }

        } catch (InstrumentAlreadyOwnedException e1) {
            System.out.println(e1.getMessage());

        } catch (NotEnoughFundsException e2) {
            System.out.println(e2.getMessage());
        }
    }

   /**
    * Sells the given instrument, removing it from the
    instList ArrayList
    * @param inst Instrument to be sold, removing it from
    the instList ArrayList
    * @throws InstrumentNotOwnedException exception when
    sold instrument is not owned
    * @throws LastInstrumentException exception when last instrument
    is sold
    */
    public void sell(Instrument inst) throws LastInstrumentException,
                                             InstrumentNotOwnedException {
        boolean owned = false;

        for (int i = 0; i < instList.size(); i++) {
            if (instList.get(i).getSerial() == inst.getSerial()) {
                owned = true;
            }
        }

        try {
            if (owned) {
                if (instList.size() > 1) {
                    funds += inst.getPrice();
                    instList.remove(inst);
                    System.out.println("\nInstrument: \n"
                                      + inst.toString()
                                      + "\nsold!");

                } else {
                    //LastInstrumentException
                    throw new LastInstrumentException("A musician cannot "
                                                     + "sell his last "
                                                     + "instrument!"
                                                     + " How else will he make "
                                                     + "beautiful music?!");
                }

            } else {
                //InstrumentNotOwnedException
                throw new InstrumentNotOwnedException("Musician doesn't"
                                                     + " own this instrument!"
                                                     + "You can't sell "
                                                     + "something you don't "
                                                     + "own!");
            }

        } catch (LastInstrumentException e1) {
            System.out.println(e1.getMessage());

        } catch (InstrumentNotOwnedException e2) {
            System.out.println(e2.getMessage());
        }
    }
}