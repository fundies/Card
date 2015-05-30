package card;

/**
 * @author Greg Williamson
 * @version 0.1
 */
public class IDCard extends Card
{
    private String id;

    /**
     * Default Constructor
     * 
     * @param n name
     * @param iden id
     */
    public IDCard(String n, String iden)
    {
        super(n);
        id = iden;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#format()
     */
    @Override
    public String format()
    {
        return super.format() + " ID: " + id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see card.Card#toString()
     */
    @Override
    public String toString()
    {
        return "IDCard[name=" + name + "][ID=" + id + "]";
    }

}
