package ArrayReversalMethods.ArrayExercise;

public class Receipt {
    public static void main(String[] args) {
    final String dataFile = "invoice"; 
    final double[] prices = {19.99, 9.99,15.99,3.99,4.99};
    final int[] units = {12,8,13,29,50};
    final String [] desc = {"Java T-Shirt", "Java Mug", "Duke Dolls", 
    "Java Pin", "Java Key Chain"};
    //System.out.println(dataFile);
    
    double [] amount = setTotal(prices,units);
    //System.out.println("Amount");
    for (int i = 0; i < amount.length; i++) {
        //System.out.printf( "$%.2f%n",amount[i] );
    }
    System.out.println();
    printValue(prices,units,desc,amount,dataFile);
    double total =  Addsum(amount);
    System.out.printf("Total: $%.2f%n ",total);
    System.out.print("\n\tTHANK YOU FOR YOUR PATRONAGE\n");
    }
    

    private static double[] setTotal(double[] prices, int[] units) {
        double [] totalAmount = new double[units.length];
        for (int i = 0; i < units.length; i++) {
            totalAmount[i] = units[i] * prices[i];
            Addsum(totalAmount);
            
        }
        return totalAmount;
    }

    private static double Addsum(double[] totalAmount) {
    double sumTotal=0;
    for (int i = 0; i < totalAmount.length; i++) {
        sumTotal += totalAmount[i];
    }
    return sumTotal;
    }

    private static void printValue(double[] prices, int[] units, String[] desc, double[] amount,String dataFile) {
        System.out.printf("%25s%n", dataFile);
        System.out.println("S/N \tItems \t\tPrices \tUnits\tAmount");
        for (int i = 0; i < desc.length; i++) {
            System.out.printf( "%d \t%s \t$%.2f \t%d \t$%.2f%n",i+1, desc[i],prices[i],units[i],amount[i]);
        }
        System.out.println();

    }
}
