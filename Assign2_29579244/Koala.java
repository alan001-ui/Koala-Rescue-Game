/**
 * Write a description of class Koala here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Koala
{
    private int healthyKoala;
    private int injuredKoala;
    private int year;
    private int predator;

    public Koala()
    {
        healthyKoala = 0;
        injuredKoala = 0;
        year = 0;
        predator = 0;
    }

    public Koala(int healthyKoala,int injuredKoala,int year, int predator)
    {
        this.healthyKoala = healthyKoala;
        this.injuredKoala = injuredKoala;
        this.year = year;
        this.predator = predator;
    }

    public void setHealthyKoala(int healthyKoala)
    {
        this.healthyKoala = healthyKoala;
    }

    public int getHealthyKoala()
    {
        return healthyKoala;
    }

    public void setInjuredKoala(int injuredKoala)
    {
        this.injuredKoala = injuredKoala;
    }

    public int getInjuredKoala()
    {
        return injuredKoala;
    }

    public int setYear(int year)
    {
        this.year = year; 
        return year;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setPredator(int predator)
    {
        this.predator = predator;
    }
    
    public int getPredator()
    {
        return predator;
    }
}
