package card;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class IDCardTest
{

    /**
     * Test method for {@link card.IDCard#format()}.
     */
    @Test
    public void testFormat() throws Exception
    {
        IDCard c = new IDCard("Fred", "1");
        assertEquals("Card holder: Fred ID: 1", c.format());
    }

    /**
     * Test method for {@link card.IDCard#toString()}.
     */
    @Test
    public void testToString() throws Exception
    {
        IDCard c = new IDCard("Fred", "1");
        assertEquals("IDCard[name=Fred][ID=1]", c.toString());
    }

}
