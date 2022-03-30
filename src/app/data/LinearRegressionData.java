package app.data;

public class LinearRegressionData
{
    private Double x,y;
    public LinearRegressionData(Double x,Double y)
    {
        this.x=x;
        this.y=y;
    }
    public LinearRegressionData(){}
    public Double getX()
    {
        return x;
    }
    public void setX(Double x)
    {
        this.x=x;
    }
    public Double getY()
    {
        return y;
    }
    public void setY(Double y)
    {
        this.y=y;
    }
}