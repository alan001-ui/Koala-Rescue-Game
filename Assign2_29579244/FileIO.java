import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class FileIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileIO
{
    private String fileName;

    public FileIO()
    {

    }

    public FileIO(String fileName)
    {
        this.fileName = fileName;
    }

    public void fileReader(String fileName)
    {

        try
        {
            FileReader inputFile = new FileReader(fileName);
            try
            {
                Scanner input = new Scanner(inputFile);
                String treeTypes[] = new String[5];
                while (input.hasNextLine())
                {
                    String eachLine = input.nextLine();
                    treeTypes = eachLine.split(",");
                    
                    
                }
                
                
            }
            finally
            {
                inputFile.close(); 
            }
        }
        catch (FileNotFoundException exception)
        {
            System.out.println(fileName +" not found");
        }
        catch (IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
        
    }

    public void fileWriter()
    {

    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
}
