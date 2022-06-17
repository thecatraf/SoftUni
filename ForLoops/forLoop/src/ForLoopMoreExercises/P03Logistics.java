package ForLoopMoreExercises;

import java.util.Scanner;

public class P03Logistics {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
        int n = Integer.parseInt(scanner.nextLine());
 
        int totalTonnage = 0;
 
        int bus = 0;
        int truck = 0;
        int train = 0;
 
        for (int i = 1; i <= n; i++) {
            int tonnage = Integer.parseInt(scanner.nextLine());
            totalTonnage = totalTonnage + tonnage;
 
            if (tonnage <= 3) {
                bus = bus + tonnage;
            } else if (tonnage <= 11) {
                truck = truck + tonnage;
            } else  {
                train = train + tonnage ;
            }
        }
        double averagePricePerTon = (bus*1.0 * 200 + truck * 175 + train * 120) / totalTonnage;
        double percentTonnageForBus =  (bus*1.0 / totalTonnage) * 100;
        double percentTonnageForTruck = (truck*1.0 / totalTonnage) * 100;
        double percentTonnageForTrain = (train*1.0 / totalTonnage) * 100;
 
        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n", percentTonnageForBus);
        System.out.printf("%.2f%%%n", percentTonnageForTruck);
        System.out.printf("%.2f%%%n", percentTonnageForTrain);
    }

}
