package card;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class BillfoldTest
{
    /**
     * Test method for {@link card.Billfold#formatCards()}.
     */
    @Test
    public void testFormatCards() throws Exception
    {
        Billfold inst = new Billfold();
        assertEquals("", inst.formatCards());
        
        inst.addCard(new CallingCard("John Smith", "80085", "1234"));
        inst.addCard(new IDCard("Fred Johnson", "3098"));

        // Shouldn't add this card
        inst.addCard(new DriverLicense("Abby Anderson", 2016));

        assertEquals("Card holder: John Smith Card Number: 80085 Pin: 1234|"
                + "Card holder: Fred Johnson ID: 3098", inst.formatCards());
    }

    /**
     * Test method for {@link card.Billfold#getExpiredCardCount()}.
     */
    @Test
    public void testGetExpiredCardCount() throws Exception
    {
        Billfold inst = new Billfold();
        inst.addCard(new CallingCard("John Smith", "80085", "1234"));
        inst.addCard(new DriverLicense("Abby Anderson", 2013));
        assertEquals(1, inst.getExpiredCardCount());
    }
}
