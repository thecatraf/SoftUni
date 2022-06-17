package ForLoopMoreExercises;

import java.util.Scanner;

public class P08EqualPairs {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int countCouples = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sumCouple = num1 + num2;
        int maxDiff = sumCouple - (num1 + num2);
 
        for (int i = 2; i <= countCouples; i++) {
            num1 = Integer.parseInt(scanner.nextLine());
            num2 = Integer.parseInt(scanner.nextLine());
            if (sumCouple != (num1 + num2)) {
                maxDiff = Math.abs(sumCouple - (num1 + num2));
            }
            sumCouple = num1 + num2;
        }
 
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d",sumCouple);
        }
        else {
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
    }

}
