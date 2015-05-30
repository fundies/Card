package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class Billfold
{
    private Card[] card = new Card[2];

    /**
     * Default Constructor
     */
    public Billfold()
    {
        // Nothing to do here
    }

    /**
     * Adds a card
     * 
     * @param c card to add
     */
    public void addCard(Card c)
    {
        if (card[1] == null)
        {
            int i = (card[0] != null) ? 1 : 0;
            card[i] = c;
        }
    }

    /**
     * Returns String of cards
     * 
     * @return card1|card2
     */
    public String formatCards()
    {
        String output = "";
        for (int i = 0; i < card.length; ++i)
        {
            if (card[i] != null)
            {
                output += card[i].format();
                output += (i == 0) ? "|" : "";
            }
        }
        return output;
    }

    /**
     * Returns expired cards
     * 
     * @return number of expired card
     */
    public int getExpiredCardCount()
    {
        int e = 0;
        for (int i = 0; i < card.length; ++i)
        {
            e += (card[i].isExpired()) ? 1 : 0;
        }
        return e;
    }
}
