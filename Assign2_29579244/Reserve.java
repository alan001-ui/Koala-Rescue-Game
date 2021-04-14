import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Write a description of class Reserve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reserve
{
    private ArrayList<ObservationPoint> observationPoints;
    private int budget;

    public Reserve()
    {
        observationPoints = new ArrayList<ObservationPoint>();
        this.budget = budget;
    }

    public Reserve(ArrayList<ObservationPoint> observationPoints, int fileName)
    {
        this.observationPoints = observationPoints;
        this.budget = budget;
    }

    public int getBudget()
    {
        return budget;
    }

    public void setBudget(int budget)
    {
        this.budget = budget;
    }

    public ArrayList<ObservationPoint> getObservationPoints()
    {
        return observationPoints;
    }

    public void setObservationPoints()
    {
        this.observationPoints = observationPoints;
    }

    public void fileReader()
    {
        String fileName = "trees.txt";
        try
        {
            FileReader inputFile = new FileReader(fileName);
            try
            {
                Scanner input = new Scanner(inputFile);
                String treeList[] = new String[5];
                while (input.hasNextLine())
                {
                    String eachLine = input.nextLine();
                    treeList = eachLine.split(",");
                    ObservationPoint obeservationPoint = new ObservationPoint();
                    obeservationPoint.getTrees().setMannaGum(Double.parseDouble(treeList[0]));
                    obeservationPoint.getTrees().setSwampGum(Double.parseDouble(treeList[1]));
                    obeservationPoint.getTrees().setBlueGum(Double.parseDouble(treeList[2]));
                    obeservationPoint.getTrees().setRiverRedGum(Double.parseDouble(treeList[3]));
                    obeservationPoint.getTrees().setWattle(Double.parseDouble(treeList[4]));
                    observationPoints.add(obeservationPoint);
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

    public void treeBurnt()
    {
        RandomNumber random = new RandomNumber();
        int MannaGumRandomNo = random.generateRandomNumber(100);
        int SwampGumRandomNo = random.generateRandomNumber(100);
        int BlueGumRandomNo = random.generateRandomNumber(100);
        int RiverRedGumRandomNo = random.generateRandomNumber(100);
        int WattleRandomNo = random.generateRandomNumber(100);
        for (int i = 0; i < observationPoints.size(); i++)
        {
            if (MannaGumRandomNo < 5)
            {
                double MannaGumTree = observationPoints.get(i).getTrees().getMannaGum()*0.95;
                observationPoints.get(i).getTrees().setMannaGum(MannaGumTree);
            }
            if (SwampGumRandomNo < 5)
            {
                double SwampGumTree = observationPoints.get(i).getTrees().getSwampGum()*0.95;
                observationPoints.get(i).getTrees().setSwampGum(SwampGumTree);
            }
            if (BlueGumRandomNo < 5)
            {
                double BlueGumTree = observationPoints.get(i).getTrees().getBlueGum()*0.95;
                observationPoints.get(i).getTrees().setBlueGum(BlueGumTree);
            }
            if (RiverRedGumRandomNo < 5)
            {
                double RiverRedGumTree = observationPoints.get(i).getTrees().getRiverRedGum()*0.95;
                observationPoints.get(i).getTrees().setRiverRedGum(RiverRedGumTree);
            }
            if (WattleRandomNo < 5)
            {
                double WattleTree = observationPoints.get(i).getTrees().getWattle()*0.95;
                observationPoints.get(i).getTrees().setWattle(WattleTree);
            }
        }
    }

    public void caculateWeight()
    {
        double weight = 0;
        for (int i = 0; i < observationPoints.size(); i++)
        {
            weight =  + 
            observationPoints.get(i).getTrees().getBlueGum()*0.34 + 
            observationPoints.get(i).getTrees().getBlueGum()*0.9 + 
            observationPoints.get(i).getTrees().getRiverRedGum()*0.4;
            observationPoints.get(i).getTrees().setWeight(weight);
        }
    }

    public void eachobservationPointAnimalNo()
    {
        RandomNumber random = new RandomNumber();
        for (int i =0; i < observationPoints.size(); i++)
        {
            int healthyKoala = random.generateRandomNumber(9);
            observationPoints.get(i).getKoalas().setHealthyKoala(healthyKoala);
            int injuredKoala = random.generateRandomNumber(2);
            observationPoints.get(i).getKoalas().setInjuredKoala(injuredKoala);
            int predator = random.generateRandomNumber(4);
            observationPoints.get(i).getKoalas().setPredator(predator);
        }
    }

    public void eachKoalaYear()
    {
        RandomNumber random = new RandomNumber();
        for (int i = 0; i < observationPoints.size(); i++)
        {
            int KoalaNumber = observationPoints.get(i).getKoalas().getHealthyKoala() + 
                              observationPoints.get(i).getKoalas().getInjuredKoala();
            int KoalaList[] = new int[KoalaNumber];
            for (int j = 0; j < KoalaNumber; j++)
            {
                int year = random.generateRandomNumber(18);
                KoalaList[j] = observationPoints.get(i).getKoalas().setYear(year);
            } 
        }

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
            this.budget = money;
        }
        
    }
    
    public void displayEachObservationPoint()
    {
        fileReader();
        treeBurnt();
        caculateWeight();
        caculateWeight();
        eachobservationPointAnimalNo();
        System.out.println("The available budget: " + budget);
        for (int i = 0; i < observationPoints.size(); i++)
        {
            System.out.println(i+1 + "the number of injured koalas: " + 
                               observationPoints.get(i).getKoalas().getInjuredKoala());
            System.out.println(i+1 + "the number of healthy koalas: " + 
                               observationPoints.get(i).getKoalas().getHealthyKoala());  
            System.out.println(i+1 + "the weight of available food: " + 
                               observationPoints.get(i).getTrees().getWeight());   
            System.out.println(i+1 + "the number of shelter trees: " + 
                               observationPoints.get(i).getTrees().getWattle()); 
            System.out.println(i+1 + "the number of predators: " + 
                               observationPoints.get(i).getKoalas().getPredator());                 
            System.out.println();                 
        }
        
    }
}
