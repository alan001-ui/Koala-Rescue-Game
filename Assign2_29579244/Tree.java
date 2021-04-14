/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    private double MannaGum;
    private double SwampGum;
    private double BlueGum;
    private double RiverRedGum;
    private double Wattle;
    private String food;
    private String Shelter;
    private double weight;

    public Tree()
    {
        MannaGum = 0;
        SwampGum = 0;
        BlueGum = 0;
        RiverRedGum = 0;
        Wattle = 0;
        food = "";
        Shelter = "";
        weight = 0;
    }

    public Tree(double MannaGum, double SwampGum, double BlueGum, double RiverRedGum,double Wattle,
    String food,String Shelter,double weight)
    {
        this.MannaGum = MannaGum;
        this.SwampGum = SwampGum;
        this.BlueGum = BlueGum;
        this.RiverRedGum = RiverRedGum;
        this.Wattle = Wattle;
        this.food = food;
        this.Shelter = Shelter;
        this.weight = weight;
    }

    public void setMannaGum(double MannaGum)
    {
        this.MannaGum = MannaGum;
    }

    public double getMannaGum()
    {
        return MannaGum;
    }

    public void setSwampGum(double SwampGum)
    {
        this.SwampGum = SwampGum;
    }
    
    public double getSwampGum()
    {
        return SwampGum;
    }

    public void setBlueGum(double BlueGum)
    {
        this.BlueGum = BlueGum;
    }
    
    public double getBlueGum()
    {
        return BlueGum;
    }
    
    public void setRiverRedGum(double RiverRedGum)
    {
        this.RiverRedGum = RiverRedGum;
    }
    
    public double getRiverRedGum()
    {
        return RiverRedGum;
    }
    
    public void setWattle(double Wattle)
    {
        this.Wattle = Wattle;
    }
    
    public double getWattle()
    {
        return Wattle;
    }
    
    public void setFood(String food)
    {
        this.food = food;
    }

    public String getFood()
    {
        return food;
    }
    
    public void setShelter(String Shelter)
    {
        this.Shelter = Shelter;
    }
    
    public String getShelter()
    {
        return Shelter;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }
}
