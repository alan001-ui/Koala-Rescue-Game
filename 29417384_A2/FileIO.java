import java.io.*; 
import java.util.Scanner;
/**
 * Class to read and write a string to a file
 *
 * @author <<QiJun Zhai>>
 * @version <<21/10/2019>>
 */
public class FileIO
{
    private String fileName;
    /**
     * Default constructor to initialize the object of the FileIO class
     * 
     */
    public FileIO()
    {

    }

    /**
     * Non default constructor to initialize the object of the FileIO class
     * @param newFileName Name of the file to be read or written to
     */
    public FileIO(String fileName)
    {
        this.fileName = fileName;
    }
    
    /**
     * Method to read the contents from the file
     * @return A entire contents of the file represented as a single string. New lines are delimited with a \n
     */
    public String fileReader(String fileName)
    {
        String content = "";
        String filename = fileName;
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner input = new Scanner(inputFile);
                content = input.nextLine();
            }
            finally
            {
                inputFile.close();
            }
        }
        catch (FileNotFoundException exception)
        {
            System.out.println(filename +" not found");
        }
        catch (IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
        return content;
    }
    
    /**
     * Method to write the contents to a file
     * @param contents Complete string which is to be written to the file. New lines need to be delimited with a \n
     */
    public void fileWriter(String fileName,String playerName,int gameResult)
    {
        try
        {
            PrintWriter printFile = new PrintWriter(fileName);
            printFile.println(playerName+"has Won the game, with the highest achieved score of ");
            printFile.print(gameResult);
            printFile.close();
        }
        catch (IOException e) 
        {
            System.out.println("something went wrong with accessing the file");
        }
    }
    
    /**
     * Accessor Method to get the filename
     * @return A single string which represents the file name being read or written to
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * Mutator Method to set the filename
     * @param newFileName Name of the file to be read or written to
     */
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
}
