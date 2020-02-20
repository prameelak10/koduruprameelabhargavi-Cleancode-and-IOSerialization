public class Interest
{
    float principleAmount,rateOfInterest;
    int time;
    Interest()
    {
        principleAmount=0;
        rateOfInterest=0;
        time=0;
    }
    public float getPrincipleAmount()
    {
        return principleAmount;
    }
    public void setPrincipleAmount(float value)
    {
        principleAmount=value;
    }
    public float getRateOfInterest()
    {
        return rateOfInterest;
    }
    public void setRateOfInterest(float value)
    {
        rateOfInterest=value;
    }
    public int getTime()
    {
        return time;
    }
    public void setTime(int value)
    {
        time=value;
    }
    public float calculateSimpleInterest()
    {
        return getPrincipleAmount()*getTime()*getRateOfInterest() /100;
    }
    public double calculateCompoundInterest()
    {return getPrincipleAmount()* Math.pow(1+ getRateOfInterest()/100,getTime());}

}
