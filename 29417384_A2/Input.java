import java.util.Scanner;
/**
 * Write a description of class Input here.
 *
 * @author (QiJun Zhai)
 * @version (21/10/2019)
 */
public class Input
{
    /**
     * Constructor for objects of class Input
     */
    public Input()
    {
        
    }

    /**
     * get a integer message from user
     * @param tips String to give user suggestion
     * @return user int enter information
     */
    public int numberMassage(String tips)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(tips);
        return scanner.nextInt();
    }
    
    /**
     * get a String message from user
     * @param tips String to give user suggestion
     * @return user String enter information
     */ 
    public String stringMassage(String tips)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(tips);
        return scanner.nextLine();
    }
}