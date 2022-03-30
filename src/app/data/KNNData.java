package app.data;

public class KNNData
{
    private double x,y;
    private int klass;
    public KNNData(double x,double y,int klass)
    {
        this.x=x;
        this.y=y;
        this.klass=klass;
    }
    public KNNData()
    {
    }
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    public int getKlass()
    {
        return klass;
    }
    public void setKlass(int klass)
    {
        this.klass=klass;
    }
}