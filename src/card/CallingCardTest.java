package card;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class CallingCardTest
{

    /**
     * Test method for {@link card.CallingCard#format()}.
     */
    @Test
    public void testFormat() throws Exception
    {
        CallingCard c = new CallingCard("Fred", "8000", "9922");
        assertEquals("Card holder: Fred Card Number: 8000 Pin: 9922",
                c.format());
    }

    /**
     * Test method for {@link card.CallingCard#toString()}.
     */
    @Test
    public void testToString() throws Exception
    {
        CallingCard c = new CallingCard("Fred", "8000", "9922");
        assertEquals("CallingCard[name=Fred][number=8000,pin=9922]",
                c.toString());
    }

}
