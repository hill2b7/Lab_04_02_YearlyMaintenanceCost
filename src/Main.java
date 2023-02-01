public class Main {
    public static void main(String[] args)
    {
        double winterCost = 108.94;
        double springCost = 203.95;
        double summerCost = 180.68;
        double fallCost = 138.36;
        double yearlyCost = 0;

        System.out.println("The cost for Winter is " + winterCost);
        System.out.println("The cost for Spring is " + springCost);
        System.out.println("The cost for Summer is " + summerCost);
        System.out.println("The cost for Fall is " + fallCost);
        yearlyCost = winterCost + springCost + summerCost + fallCost;
        System.out.println("The total yearly cost is " +yearlyCost);
    }
}