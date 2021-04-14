import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 * Write a description of class Game here.
 *
 * @author (QiJun Zhai)
 * @version (21/10/2019)
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

    /**
     * Non Default Constructor for objects of Game
     *  @param newPlayerName String to define the player name
     *  @param newGameTotal int to define the gameTotal
     */
    public Game(String newPlayerName,int newGameTotal )
    {
        playerName = newPlayerName;
        gameTotal = newGameTotal;
    }

    /**
     *Display menu for player and let player choose options
     */
    public void beginProgram()
    {
        boolean isMenuDisplayed = true;
        while (isMenuDisplayed)
        {       
            displayMenu();
            Input input = new Input();
            String userSelection = input.stringMassage("Please select from the following options");
            fourOption(userSelection);
            if (userSelection == "4")
                isMenuDisplayed = false;
        }
    }

    /**
     * check whether the buffer size equals to 5 and whether the buffer can merge or not 
     * @return false
     * @return true
     */
    public boolean checkGame(Buffer buffer)
    {
        //Arraylist size=5 && can not merge
        FileIO fileIO = new FileIO();
        boolean canMerge = buffer.canMerge(gameTotal);
        if ((buffer.getList().size()==5 )&&
        (canMerge==false))
        {   
            System.out.println("****************Game Over*****************");
            fileIO.fileWriter("outcomes.txt",playerName,buffer.gameResult());   
            return false;
        }
        else
            return true;
    }

    /**
     * Display game UI to player
     */
    public void displayGame(Buffer buffer)
    {
        //display buffer
        System.out.println("---Buffer---");
        //display gametotal
        buffer. bufferUI(); 
        if (gameTotal == 0)
        {
            System.out.println("game total :"+ generateGameTotal());
        }
        else
        {
            System.out.println("game total :"+ gameTotal);
        }
        //player choose split or merge
        System.out.println("Option 1: Split");
        System.out.println("Option 2: Merge");
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
            registerPlayerName(); break;
            case "2": 
            Validation validation = new Validation();
            if (validation.stringIsBlank(playerName))
            {
                System.out.println("Sorry, you must register a name first");
                Input input = new Input();
                input.stringMassage("");
            }
            else
            {
                System.out.print('\u000C');
                System.out.println("**********Game Will Start!**********");
                System.out.println("");
                game();
            }
            break;
            case "3":
            helpMenu();break;
            case "4":
            System.out.println("to exist");
            System.exit(0);break;
            default:
            System.out.println("Invalid input, please input a valid option");break;
        }
    }

    /**
     * creat a method to contain the game stage
     */
    public void game()
    {
        boolean repeat = true;
        Input input = new Input();
        while (repeat)
        {
            Buffer buffer = new Buffer();
            //generate gameTotal
            //boolean canSplit = buffer.Split(gameTotal);
            generateGameTotal();
            //show UI
            //user option
            //split
            //merge
            playOneRound(buffer);
            // begain a new round?
            String oneRound = input.stringMassage("Input  "+"  【 yes 】 "+ "  you can start a new round!!!!!!!!!!!!!!!");
            if (oneRound.equals("yes"))
            {
                repeat = true;
                System.out.print('\u000C');
            }
            else
            {
                System.exit(1);
            }
        }
    }

    /**
     * Read the values from the multiples.txt file and put the values in a int arry and generate a random
     * @return gameTotal
     */
    public int generateGameTotal()
    {
        gameTotal=0;
        int[] newNumbers = new int[3];
        FileIO fileIO = new FileIO();
        String line=fileIO.fileReader("multiples.txt");
        //put numbers in a array
        String[] numbers = new String[3];
        numbers = line.split(",");
        //transfer String to Int
        for (int i = 0; i< numbers.length;i++)
        {
            int number = Integer.parseInt(numbers[i]);
            newNumbers[i] = number;
        }
        RNG rng = new RNG(0,2);
        if (gameTotal==0)
        {
            gameTotal =  newNumbers[rng.generateRandomNumber()];
        }
        //System.out.println(gameTotal);
        return gameTotal;
        //return newNumbers;
    }

    /**
     * Accessor Method to get the Game total
     * @return  Game total
     */
    public int getNewGameTotal()
    {
        return gameTotal;
    }

    /**
     *  Accessor Method to get the player name
     *   @return player name
     */
    public String getPlayerName()
    {
        return playerName;
    }

    /**
     * Creat helpMenu to make user know how to play a game.
     */
    public void helpMenu()
    {
        System.out.println("*********************************************Help Menue**************************************************************");
        System.out.println("The game starts by registering a player to play the game.");
        System.out.println("The game then provides a random number to the player ");
        System.out.println("The player need to choose the option1 split or the option2 merger "); 
        System.out.println("Provided the game total is less than or equal to 21, the player will get the score for using that tile.");
        System.out.println("If the game total  reaches the total of 256 or higher.");
        System.out.println(" or he buffer has reached 5 numbers and no more and none of the existing numbers can be merged to the game total ");
        System.out.println("Game will end and , the result of game will be writen in the outcomes.txt");
        System.out.println("**********************************************************************************************************************");
        Input input = new Input();
        input.stringMassage("Please input Enter to continue");
    }

    /**
     * accpet player's option and play one round
     */
    public void playOneRound(Buffer buffer )
    {
        boolean repeat =true;
        FileIO fileIO = new FileIO();
        boolean playGame =true;
        while (playGame)
        {
            // user choose
            displayGame(buffer);
            Input input = new Input();
            String option;
            do
            {
                option = input.stringMassage("Please input a Option");
            } while(option=="1"||option=="2");
            System.out.print('\u000C');
            switch (option)
            { 
                //split
                case "1":
                boolean isSplit = buffer.split(gameTotal);
                if (isSplit)
                    generateGameTotal();
                break;
                //Merge
                case "2":
                boolean isMerge =false;
                isMerge = buffer.merge(gameTotal);
                if (isMerge)
                    gameTotal = gameTotal * 2;
                else
                {
                    System.out.println("");
                    System.out.println("You cannot merge!!!!");
                    System.out.println("");
                    System.out.println("");
                }
                break;
            }

            if (gameTotal==256)
            {
                fileIO.fileWriter("outcomes.txt",playerName,256);
                System.out.println("Congratulations, you are won");
                playGame =false;
            }
            else
                playGame =checkGame(buffer);
        }
    }

    /**
     * transfer String Numbers to Int newNumbers
     * @param String Array numbers
     * @return newNumbers
     */
    public int[] putNumberInArray(String[] numbers)
    {
        int[] newNumbers = new int[3];
        for (int i = 0; i< numbers.length;i++)
        {
            int number = Integer.parseInt(numbers[i]);
            newNumbers[i] = number;
        }
        return newNumbers;
    }

    /**
     * Identification whether the name entered by the user is between 3 to 10 characters.
     * if not tell user input between 3 to 10 characters until they enter correct.
     */
    public void registerPlayerName()
    {   
        boolean repeat = true;
        while (repeat)
        {
            Validation validation = new Validation();
            Input input = new Input();
            playerName = input.stringMassage("Please input your name");
            if (validation.stringLengthIsRight(playerName, 3, 10))
            {
                setPlayerName(playerName);
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
     * Mutator method to set game total
     * @param a single object which contains game total
     */
    public void setGameTotal(int newGameTotal)
    {
        gameTotal =  newGameTotal;
    }

    /**
     *  Mutator method to set player name 
     *  @param a single object which contains the player name
     */
    public void setPlayerName(String newPlayerName)
    {
        playerName = newPlayerName;
    }
}