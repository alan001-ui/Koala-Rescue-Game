import java.util.Scanner;

/**
 * Write a description of class KoalaRescue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KoalaRescue
{
    private Reserve reserve;

    public KoalaRescue()
    {
        reserve = new Reserve();
    }

    public KoalaRescue(Reserve reserve)
    {
        this.reserve = reserve;
    }

    public void welcome()
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome Koala Rescue Program!");
        System.out.println("Please enter to your name to start this mission");
        String name = input.nextLine().trim();
        while (name.length() > 16)
        {
            System.out.println("Please enter to your name to start this mission, less than 16 alphabetic");
            name = input.nextLine().trim();
        }
        while (true)
        {
            System.out.println("Please enter to your budget, from $100--$200");
            String sc = input.nextLine();
            int money = 0;
            try
            {
                money = Integer.parseInt(sc);
                while (money < 100 || money > 200)
                {
                    System.out.println();
                    System.out.println("Please enter to your budget, from $100--$200");
                    money =input.nextInt();
                }
                break;
            }
            catch (NumberFormatException ne)
            {
                System.out.println("This is not a number, try again");
            }
        }
    }
    
    
}

