import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String playerName;
    private int gameTotal;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        playerName = "";
        gameTotal = 0;
    }
    
    public Game(String newPlayerName,int newGameTotal )
    {
        playerName = newPlayerName;
        gameTotal = newGameTotal;
    }
    
    public String getPlayerName()
    {
        return playerName;
    }
    
    public int getNewGameTotal()
    {
        return gameTotal;
    }
    
    public void setPlayerName(String newPlayerName)
    {
        playerName = newPlayerName;
    }
    
    public void setGameTotal(int newGameTotal)
    {
        gameTotal =  newGameTotal;
    }
    
    /**
     *Display menu for player and let player choose options
     */
    public void beginGame()
    {
        boolean isMenuDisplayed = true;
        while (isMenuDisplayed)
        {       
            displayMenu();
            String userSelection = getUserStringInput("Please select from the following options");
            fourOption(userSelection);
            if (userSelection == "4")
                isMenuDisplayed = false;
        }
    }
    
    /**
     * * Creat a Game menu
     */
    public void displayMenu()
    {
        System.out.println("-----------------Welcome to 256 Game------------------");
        System.out.println("press 1 to register a player");
        System.out.println("press 2 to start a new game");
        System.out.println("press 3 to view a help menu");
        System.out.println("press 4 to exist");
        System.out.println("------------------------------------------------------");
    }
    
    /**
     * get a integer message from user
     * @param tips String to give user suggestion
     * @return user int enter information
     */ 
    public int getNumber(String tips)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(tips);
        return console.nextInt();
    }
    
    /**
     * Cteate four options of the game and help user select from the following options
     * Option 1 is players' name of registion
     * Option 2 is starting a game.
     * Tell player register a name first when player enter other option before registing a name 
     * Option 3 is helping menu
     * Option 4 is existing game
     * @param selection int to define user selection
     */
    public void fourOption(String selection)
    {
        switch (selection)
        {
            case "1":
                registerplayerName(); break;
            case "2": 
                if (getPlayerName().equals(""))
                {
                    System.out.println("Sorry, you must register a name first");
                    registerplayerName();
                }
                else 
                {
                    System.out.println("Game will Start!");
                    
                }
                break;
            case "3":
                helpMenu();break;
            case "4":
                System.out.println("to exist"); break;
            default:
                System.out.println("Invalid input"); break;
        }
    }
    
    /**
     * Identification whether the name entered by the user is between 3 to 10 characters.
     * if not tell user input between 3 to 10 characters until they enter correct.
     */
    public void registerplayerName()
    {   
        boolean repeat = true;
        while (repeat)
        {
            playerName = getUserStringInput("Please input your name");
            if (playerName.trim().length() >= 3 && playerName.trim().length() <= 10)
            {
                String playName = playerName;
                setPlayerName(playName);
                repeat = false;
            }
            else
            {
                System.out.println("Sorry, you enter incorrect,please input between 3 to 10 characters");
                repeat = true;
            }
        }
    }
    
    /**
     * get a String message from user
     * @param tips String to give user suggestion
     * @return user String enter information
     */ 
    public String getUserStringInput(String tips)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(tips);
        return console.nextLine();
    }
    
    /**
     * Creat helpMenu to make user know how to play a game.
     */
    public void helpMenu()
    {
        System.out.println("*********************************************Help Menue**************************************************************");
        System.out.println("Each player starts the game with zero points.");
        System.out.println("Each player is given the following set of five tiles. Each tile has a value and an associated score");
        System.out.println("For each round, each player will play ONE tile, with the tile value adding to the game total for that round."); 
        System.out.println("Provided the game total is less than or equal to 21, the player will get the score for using that tile.");
        System.out.println("If the game total is greater than 21");
        System.out.println("no score is allocated to the player who played the last tile causing the score to become greater than 21.");
        System.out.println("Once the round ends, Each player will get their score based on the total of the tiles they have used during the round.");
        System.out.println("Any player who has NOT used the tile with the value of 5, will get a penalty of -3 points.");
        System.out.println("The player who, after all deductions, has the highest score, will be the winner of that round and will get 5 points."); 
        System.out.println("At the end of all the rounds, the player who has won the most rounds is declared the winner of the game.");
        System.out.println("**********************************************************************************************************************");
        getUserStringInput("Please enter continue");
    }
}
