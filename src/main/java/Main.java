import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int materialStandards;
        float houseArea;
        boolean automated=false;
        System.out.println("Choose Material Standards\n1.standard\n2.above standard\n3.high standard\n");
        materialStandards=scanner.nextInt();
        System.out.println("Enter Area of House");
        houseArea=scanner.nextFloat();
        System.out.println("Do you want fully automated house?(Yes/No)");
        String s=scanner.next();
        if(s.equals("Yes") || s.equals("yes"))
            automated = true;
        Construction constructioncost = new Construction();
        System.out.println("Estimated Construction Cost : ");
        System.out.println((int)constructioncost.gethouseConstructionCost(materialStandards,houseArea,automated));
    }
}