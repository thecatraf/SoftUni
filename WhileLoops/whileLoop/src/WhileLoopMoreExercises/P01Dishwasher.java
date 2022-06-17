package WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
        int detergent = Integer.parseInt(scanner.nextLine());
 
        int detergentMl = (detergent * 750);
 
        int totalDishes = 0;
        int pots = 0;
        int days = 0;
        boolean notEnoughDetergent = false;
 
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int dishesCount = Integer.parseInt(input);
            days++;
 
 
            if (days % 3 == 0) {
 
                pots = pots + dishesCount;
                detergentMl = detergentMl - (dishesCount * 15);
 
 
            } else {
                detergentMl = detergentMl - (dishesCount * 5);
                totalDishes = (totalDishes + dishesCount);
            }
 
            if (detergentMl < 0) {
                notEnoughDetergent = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (notEnoughDetergent) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMl));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", totalDishes, pots);
            System.out.printf("Leftover detergent %d ml.", detergentMl);
        }

    }

}
