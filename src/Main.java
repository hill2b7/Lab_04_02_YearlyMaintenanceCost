public class Main {
    public static void main(String[] args)
    {
        double winterCost = 108.94; //assigns value to variable
        double springCost = 203.95; //assigns value to variable
        double summerCost = 180.68; //assigns value to variable
        double fallCost = 138.36; //assigns value to variable
        double yearlyCost = 0; //assigns value to variable

        System.out.println("The cost for Winter is " + winterCost); //output for Winter Cost
        System.out.println("The cost for Spring is " + springCost);//output for Spring Cost
        System.out.println("The cost for Summer is " + summerCost); //output for Summer Cost
        System.out.println("The cost for Fall is " + fallCost); //output for fall cost
        yearlyCost = winterCost + springCost + summerCost + fallCost; // calculates total yearly cost
        System.out.println("The total yearly cost is " +yearlyCost); //Output for yearly cost
    }
}