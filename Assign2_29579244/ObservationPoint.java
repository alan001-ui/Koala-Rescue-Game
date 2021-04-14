/**
 * Write a description of class ObservationPoint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObservationPoint
{
    private Tree trees ;
    private Koala koalas;

    public ObservationPoint()
    {
        trees = new Tree(); 
        koalas = new Koala(); 
        
    }

    public ObservationPoint(Tree trees,Koala koalas)
    {
        this.trees = trees;
        this.koalas = koalas;
    }

    public void setTrees(Tree trees)
    {
        this.trees = trees;
    }

    public Tree getTrees()
    {
        return trees;
    }

    public void setKoalas(Koala koalas)
    {
        this.koalas = koalas;
    }

    public Koala getKoalas()
    {
        return koalas;
    }


}
