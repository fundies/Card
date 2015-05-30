package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class CallingCard extends Card {
    private String cardNum;
    private String pin;

    /**
     * Default Constructor.
     *
     * @param n name
     * @param c card number
     * @param p pin
     */
    public CallingCard(final String n, final String c, final String p) {
        super(n);
        cardNum = c;
        pin = p;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#format()
     */
    @Override
    public final String format() {
        return super.format() + " Card Number: " + cardNum + " Pin: " + pin;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#toString()
     */
    @Override
    public final String toString() {
        return "CallingCard[name=" + name + "][number=" + cardNum + ",pin="
                + pin + "]";
    }

}
