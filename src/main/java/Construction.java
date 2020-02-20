public class Construction
{
    int standard,aboveStandard,highStandard,fullyAutomated;
    double houseConstructionCost;
    Construction()
    {
        standard=1200;
        aboveStandard=1500;
        highStandard=1800;
        fullyAutomated=700;
        houseConstructionCost= 0;
    }
    public double gethouseConstructionCost(int standardValue, float houseArea, boolean automated)
    {
        houseConstructionCost = houseArea*(getStandardValues(standardValue)+isFullyAutomated(automated));
        return houseConstructionCost;
    }
    public int getStandardValues(int value)
    {
        if(value==1)
            return standard;
        else if(value==2)
            return aboveStandard;
        else if(value==3)
            return highStandard;
        return 0;
    }
    public int isFullyAutomated(boolean automated)
    {
        if(automated)
            return fullyAutomated;
        return 1;
    }
}
