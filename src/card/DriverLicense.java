package card;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class DriverLicense extends Card {
    private int expiration;

    /**
     * Default Constructor.
     *
     * @param n name
     * @param exp expiration
     */
    public DriverLicense(final String n, final int exp) {
        super(n);
        expiration = exp;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#format()
     */
    @Override
    public final String format() {
        return super.format() + " Expiration: " + expiration;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#isExpired()
     */
    @Override
    public final boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        return (expiration < calendar.get(Calendar.YEAR));
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#toString()
     */
    @Override
    public final String toString() {
        return "DriverLicense[name=" + name + "][expires=" + expiration + "]";
    }

}
