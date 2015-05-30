package card;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class CardTest {

    /**
     * Test method for {@link card.Card#getName()}.
     */
    @Test
    public final void testGetName() throws Exception {
        Card c = new Card();
        assertEquals("", c.getName());
    }

    /**
     * Test method for {@link card.Card#isExpired()}.
     */
    @Test
    public final void testIsExpired() throws Exception {
        Card c = new Card("Greg");
        assertEquals(false, c.isExpired());
    }

    /**
     * Test method for {@link card.Card#format()}.
     */
    @Test
    public final void testFormat() throws Exception {
        Card c = new Card("Greg");
        assertEquals("Card holder: Greg", c.format());
    }

    /**
     * Test method for {@link card.Card#toString()}.
     */
    @Test
    public final void testToString() throws Exception {
        Card c = new Card("Greg");
        assertEquals("Card[name=Greg]", c.toString());
    }

    /**
     * Test method for {@link card.Card#equals(card.Card)}.
     */
    @Test
    public final void testEqualsCard() throws Exception {
        Card card1;
        Card card2;

        // Different Cards
        card1 = new CallingCard("John Smith", "80085", "1234");
        card2 = new DriverLicense("Abby Anderson", 2013);
        assertEquals(false, card1.equals(card2));

        // Different types same owner
        card1 = new CallingCard("John Smith", "2013", "1234");
        card2 = new DriverLicense("John Smith", 2013);
        assertEquals(false, card1.equals(card2));

        // Same Card
        card1 = new DriverLicense("John Smith", 2013);
        card2 = new DriverLicense("John Smith", 2013);
        assertEquals(true, card1.equals(card2));
    }

    /**
     * Test method for {@link card.Card#equals(java.lang.Object)}.
     */
    @Test
    public final void testEqualsObject() throws Exception {
        Card c = new Card("Greg");
        Object o = new Object();
        assertEquals(false, c.equals(o));
    }

}
