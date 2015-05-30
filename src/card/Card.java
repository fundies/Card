package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class Card {

    /**
     * Name.
     */
    protected String name;

    /**
     * Default Constructor.
     */
    public Card() {
        name = "";
    }

    /**
     * Constructor with name.
     *
     * @param n name
     */
    public Card(final String n) {
        name = n;
    }

    /**
     * Get Name.
     *
     * @return name
     */
    public final String getName() {
        return name;
    }

    /**
     * Get Expired.
     *
     * @return is expired
     */
    public boolean isExpired() {
        return false;
    }

    /**
     * Returns readable string.
     *
     * @return Card holder: name
     */
    public String format() {
        return "Card holder: " + name;
    }

    /**
     * Returns a different string? (really what's the point?)
     *
     * @return card info
     */
    public String toString() {
        return "Card[name=" + name + "]";
    }

    /**
     * Check if two cards are the same.
     *
     * @param card card
     * @return is equal
     */
    public final boolean equals(final Card card) {
        return (this.toString().equals(card.toString()));
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public final boolean equals(final Object o) {
        return false;
    }
}
