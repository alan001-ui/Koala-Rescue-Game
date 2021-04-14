/**
  * Class which stores tile details including a maximumValue and minimumValue of random number
  *  @author (QiJun Zhai)
  *  @version 14/09/2019
  */
 public class RNG
{
    private int maximumValue;
    private int minimumValue;
    
    /**
     * Constructor for objects of random number
     */
    public RNG()
    {
        maximumValue = 0;
        minimumValue = 0;
    }

    /**
     * Non Default Constructor for objects of random number
     * @param minimumValue int to define the new minimumValue
     * @param maximumValue int to define the new maximumValue
     */
    public RNG(int minimumValue, int maximumValue)
    {
        this.maximumValue = maximumValue;
        this.minimumValue = minimumValue;
    }
    
    /**
     * Method to diaplay the state of object including the maximumValue and MinimumValue of random number
     */ 
    public void display()
    {
        System.out.println(" maximumValue " + getMaximumValue() + " minimumValue " + getMinimumValue());
    }
    
    /**
     * Method to calculate a random number
     * @return a random number
     */
    public int generateRandomNumber()
    {
        return (int)(Math.random() * (maximumValue - minimumValue + 1) + minimumValue);
    }
    
    /**
     * Accessor Method to get the maximumValue
     * @return maximumValue of random number
     */
    public int getMaximumValue()
    {
        return maximumValue;
    }
    
    /**
     *  Accessor Method to get the minimumValue
     *  @return minimumValue of random number
     */
    public int getMinimumValue()
    {
        return minimumValue;
    }
 
    /**
     * Mutator Method to set the maximumValue
     * @param maximumValue a single int which contains the maximumValue of random number
     */
    public void setMaximumValue(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    /**
     * Mutator Method to set the minimumValue
     * @param minimumValue a single int which contains the minimumValue of random number
     */
    public void setMinimumValue(int minimumValue)
    {
        this.minimumValue = minimumValue;
    }   
}