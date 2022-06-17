package ForLoopMoreExercises;

import java.util.Scanner;

public class P01BackToThePast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        double moneyWill = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());
 
        double moneySpent = 0;
        double totalMoneySpent = 0;
        int startingAge = 17;
 
        for (int i = 1800; i <=lastYear; i++ ) {
            startingAge++;
 
            if (i%2==0) {
                moneySpent = moneySpent + 12000;
                totalMoneySpent = totalMoneySpent + 12000;
            } else {
                moneySpent = moneySpent + 12000 + (50*startingAge);
                totalMoneySpent = totalMoneySpent + 12000 + (50*startingAge);
            }
        }
 
        if (moneyWill>=totalMoneySpent) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyWill-totalMoneySpent);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(totalMoneySpent - moneyWill));
        }
    }

}
