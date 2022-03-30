package app.model;

import app.data.KNNData;

import java.util.List;

public class KNN
{
    public int predict(List<KNNData> data,double x,double y)
    {
        int closestIndex=-1;
        double closestDistance=Double.MAX_VALUE;
        for(int i=0;i<data.size();i++)
        {
            KNNData tmp=data.get(i);
            double tmpDistance=calculateDistance(tmp,x,y);
            if(tmpDistance<closestDistance)
            {
                closestIndex=i;
                closestDistance=tmpDistance;
            }
        }
        return data.get(closestIndex).getKlass();
    }
    private double calculateDistance(KNNData tmp,double x,double y)
    {
        return Math.sqrt(Math.pow(x-tmp.getX(),2)+Math.pow(y-tmp.getY(),2));
    }
}