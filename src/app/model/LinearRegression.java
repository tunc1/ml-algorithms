package app.model;

import app.data.LinearRegressionData;

import java.util.List;

public class LinearRegression
{
    private Double a,b;
    public LinearRegression(List<LinearRegressionData> data)
    {
        calculate(data);
    }
    private void calculate(List<LinearRegressionData> data)
    {
        double xSquareSum=0,xYProductSum=0,xSum=0,ySum=0,n=data.size();
        for(LinearRegressionData datum: data)
        {
            xSquareSum+=datum.getX()*datum.getX();
            xYProductSum+=datum.getX()*datum.getY();
            xSum+=datum.getX();
            ySum+=datum.getY();
        }
        a=(ySum*xSquareSum-xSum*xYProductSum)/(n*xSquareSum-xSum*xSum);
        b=(n*xYProductSum-xSum*ySum)/(n*xSquareSum-xSum*xSum);
    }
    public double predict(long x)
    {
        return a+b*x;
    }
}