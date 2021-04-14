import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * Write a description of class Buffer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buffer
{
    private ArrayList<Multiple> numbers;
    private int maxElements;
    /**
     * Constructor for objects of class Buffer
     */
    public Buffer()
    {
        numbers = new ArrayList<Multiple>();
        maxElements = 0;
    }

    public Buffer(ArrayList<Multiple> newNumbers, int newMaxElements)
    {
        numbers = newNumbers;
        maxElements = newMaxElements;
    }

    public ArrayList<Multiple> getNumbers()
    {
        return numbers;
    }

    public int getMaxElements()
    {
        return maxElements;
    }

    public void setNumbers(ArrayList<Multiple> newNumbers)
    {
        numbers = newNumbers;
    }

    public void setMaxElements(int newMaxElements)
    {
        maxElements = newMaxElements;
    }

    public void readFile()
    {
        File file = new File("C:/Users/61468/Desktop/multiples.txt");
        try{
            Scanner input = new Scanner(file);
            while(input.hasNextLine())
            {
                Multiple value = new Multiple();
                String[] numberInfoArray = input.nextLine().split(",");
                for(int i = 0; i< numberInfoArray.length; i++)
                {
                    value.setValue(Integer.parseInt(numberInfoArray[i]));
                }
                numbers.add(value);
            }
            input.close();
        }

        catch(IOException e){
            System.out.println("Sorry, your file is not exist");
        }

    }
    
    
}
