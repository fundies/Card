package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class CallingCard extends Card
{
    private String cardNum;
    private String pin;

    /**
     * Default Constructor
     * 
     * @param n name
     * @param cardNum card number
     * @param pin pin
     */
    public CallingCard(String n, String cardNum, String pin)
    {
        super(n);
        this.cardNum = cardNum;
        this.pin = pin;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#format()
     */
    @Override
    public String format()
    {
        return super.format() + " Card Number: " + cardNum + " Pin: " + pin;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#toString()
     */
    @Override
    public String toString()
    {
        return "CallingCard[name=" + name + "][number=" + cardNum + ",pin="
                + pin + "]";
    }

}
