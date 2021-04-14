/**
 * Write a description of class RandomNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumber
{
    // randomnumber maximumValue.
    private int maximumValue;

    /**
     * default constructor for obejects of class randomNumber.
     */
    public RandomNumber()
    {
        maximumValue = 0;
    }

    /**
     * non-default constructor for obejects of class randomNumber.
     */
    public RandomNumber(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    /**
     * return random number maximumValue.
     */
    public int getMaximumValue()
    {
        return maximumValue;
    }

    /**
     * receive random number maximumValue.
     */
    public void setMaximumValue(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    /**
     * generate number range from 0 to maximumValue.
     */
    public int generateRandomNumber(int maximumValue)
    {
        //return (int)(Math.random() * maximumValue);
        return (int)(Math.random() * maximumValue);
    }

}