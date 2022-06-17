package WhileLoopMoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        
        int moneyRaised = Integer.parseInt(scanner.nextLine());
        double moneyCash = 0;
        double moneyCard = 0;
        double count = 0;
        double countCash = 0;
        double countCard = 0;
 
        String input = scanner.nextLine();
 
        while (!input.equals("End")) {
            int currentSum = Integer.parseInt(input);
            count += 1; // people
 
            if (count % 2 == 0) { // credit card
 
                if (currentSum < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCard += currentSum;
                    countCard++;
                }
            } else { // pay cash
 
                if (currentSum > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCash += currentSum;
                    countCash++;
                }
            }
            if ((moneyCard + moneyCash) >= moneyRaised) {
                System.out.printf("Average CS: %.2f\n", moneyCash / countCash );
                System.out.printf("Average CC: %.2f", moneyCard / countCard);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
        
    }
}
