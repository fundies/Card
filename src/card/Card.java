package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class Card
{
    /**
     * Card Holder name
     */
    protected String name;

    /**
     * Default Constructor
     */
    public Card()
    {
        name = "";
    }

    /**
     * Constructor with name
     * 
     * @param n name
     */
    public Card(String n)
    {
        name = n;
    }

    /**
     * Get Name
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get Expired
     * 
     * @return is expired
     */
    public boolean isExpired()
    {
        return false;
    }

    /**
     * Returns readable string
     * 
     * @return Card holder: name
     */
    public String format()
    {
        return "Card holder: " + name;
    }

    /**
     * Returns a different string? (really what's the point?)
     * 
     * @return card info
     */
    public String toString()
    {
        return "Card[name=" + name + "]";
    }

    /**
     * Check if two cards are the same
     * 
     * @param card card
     * @return is equal
     */
    public boolean equals(Card card)
    {
        return (this.toString().equals(card.toString()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o)
    {
        return false;
    }
}
