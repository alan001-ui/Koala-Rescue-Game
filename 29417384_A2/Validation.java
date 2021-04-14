/**
 * Write a description of class Validation here.
 *
 * @author (QiJun Zhai)
 * @version (21/10/2019)
 */
public class Validation
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Validation
     */
    public Validation()
    {
        
    }
    
    /**
     * judge whether a string value is empty or not
     * @return blank
     */
    public boolean stringIsBlank(String value)
    {
        boolean blank = true;
        if (value.trim().length()>0)
            blank = false;
        return blank;
    }

    /**
     * judge whether a string value between min and max
     *  @return lengthRight
     */
    public boolean stringLengthIsRight(String value, int min, int max)
    {
        boolean lengthRight = false;
        if (value.trim().length() <= max && 
            value.trim().length() >= min)
            lengthRight = true;
        return lengthRight;
    }
}
    
