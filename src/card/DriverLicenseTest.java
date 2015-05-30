package card;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class DriverLicenseTest
{

    /**
     * Test method for {@link card.DriverLicense#isExpired()}.
     */
    @Test
    public void testIsExpired() throws Exception
    {
        DriverLicense d = new DriverLicense("Sam", 2013);
        assertEquals(true, d.isExpired());

        d = new DriverLicense("Sam", 2018);
        assertEquals(false, d.isExpired());
    }

    /**
     * Test method for {@link card.DriverLicense#format()}.
     */
    @Test
    public void testFormat() throws Exception
    {
        DriverLicense d = new DriverLicense("Sam", 2013);
        assertEquals("Card holder: Sam Expiration: 2013", d.format());
    }

    /**
     * Test method for {@link card.DriverLicense#toString()}.
     */
    @Test
    public void testToString() throws Exception
    {
        DriverLicense d = new DriverLicense("Sam", 2013);
        assertEquals("DriverLicense[name=Sam][expires=2013]", d.toString());
    }

}
