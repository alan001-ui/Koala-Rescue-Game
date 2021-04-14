import java.util.Scanner;
/**
 * Write a description of class Multiple here.
 *
 * @author (QiJun Zhai)
 * @version (21/10/2019)
 */
public class Multiple
{   
    private int value;
    /**
     * Constructor for objects of class Multiple
     */
    public Multiple()
    {
        value = 0;
    }

    /**
     * Non Default Constructor for objects of Multiple
     * @param value to define int value
     */
    public Multiple(int value)
    {
        this.value = value;
    }
    
    /**
     * Method to display value
     */
    public String displayValue()
    {
        return "Multiple{" + "value=" + value+ "}";
    }
    
    /**
     * Accessor method to get a value
     * @return value
     */
    public int getValue()
    {
        return value;
    }

    /**
     *  Mutator method to set value
     *  @param a single object which contains the newValue
     */
    public void setValue(int newValue)
    {
        value = newValue;
    } 
}