import java.util.*;
/**
 * Write a description of class Buffer here.
 *
 * @author (QiJun Zhai)
 * @version (21/10/2019)
 */
public class Buffer
{
    private ArrayList<Multiple> list;
    private int maxElements;
    /**
     * Constructor for objects of class Buffer
     */
    public Buffer()
    {
        list = new ArrayList<Multiple>();
        maxElements = 5;
    }
    
    /**
     * Non Default Constructor for objects of Buffer
     * @param newList ArrayList to define a multiple collect
     * @param newMaxElements to define a max elements
     */
    public Buffer(ArrayList<Multiple> newList, int newMaxElements)
    {
        list = newList;
        if (newMaxElements > 0)
            maxElements = newMaxElements;
        else
            maxElements = 0;
    }
    
    /**
     * Method to display all numbers in buffer UI
     */
    public void bufferUI()
    {
        //print 5 times
        //StringBuffer displaybuffer = new StringBuffer();
        for (int i = 0; i<maxElements; i++)
        {
            //i<list.size can find
            if (i < list.size())
            {
                System.out.println("   "+"[ "+list.get(i).getValue()+" ]");
            }
            else
                System.out.println("   "+"[ "+ " "+" ]");    
        }
    }
    
    /**
     * method to judge whether the game can merge or not
     * @return true
     * @return false
     */
    public boolean canMerge(int gameTotal)
    {
        for (int i = 0;i<list.size();i++)
        {
            if (list.get(i).getValue() ==gameTotal)
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method to display all numbers in buffer UI
     */
    public String displayBuffer()
    {
        return "Buffer{" + "list" +list+ "maxElenments" +maxElements+"}";
    }
    
    /**
     * method to judge a game result which is a max number in arraylist
     * @return result
     */
    public int gameResult()
    {
        int result = 0;
        for (int i= 0;i<list.size();i++)
        {
            if (list.get(i).getValue()>result)
            result= list.get(i).getValue();
        }
        return result;
    }
    
    /**
     * Accessor Method to get a list
     * @return list
     */
    public ArrayList<Multiple> getList()
    {
        return list;
    }

    /**
     *  Accessor Method to get a max Elements
     *  @return maxElements
     */
    public int getMaxElements()
    {
        return maxElements;
    }

    /**
     * method to judge whether the game can merge or not.If can, it will merge and remove the mumber in buffer.
     * @return true
     * @return false
     */
    public boolean merge(int gameTotal)
    {
        for (int i = 0;i<list.size();i++)
        {
            if (list.get(i).getValue()==gameTotal)
            {
                int gametotal = list.get(i).getValue();
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Mutator method to set player name 
     * @param a single object which contains the arraylist of multiples
     */
    public void setList(ArrayList<Multiple> newList)
    {
        list = newList;
    }
    
    /**
     * Mutator method to set max elements
     * @param a single object which contains newMaxElements
     */
    public void setMaxElements(int newMaxElements)
    {
        if (newMaxElements > 0)
            maxElements = newMaxElements;
        else
            maxElements = 0;
    }
    
    /**
     * method to judge whether can split or not
     * @return true
     * @return false
     */
    public boolean split(int gameTotal)
    {
        //add gameTotal
        if (list.size() <= maxElements)
        {
            Multiple multiple = new Multiple();
            list.add(multiple);
            multiple.setValue(gameTotal);
            return true;
        }
        return false;
    }
}