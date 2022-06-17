package ForLoopMoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	        int movesCount = Integer.parseInt(scanner.nextLine());
	 
	        int totalPoints = 0;
	        double points = 0;
	 
	        int numBetween0To9 = 0;
	        int numBetween10To19 = 0;
	        int numBetween20To29 = 0;
	        int numBetween30To39 = 0;
	        int numBetween40To50 = 0;
	        int invalidNumbers = 0;
	 
	 
	        for (int i = 1; i <= movesCount; i++) {
	            int moves = Integer.parseInt(scanner.nextLine());
	 
	            if (moves < 0) {
	                points = points / 2;
	                invalidNumbers ++;
	 
	            } else if (moves <= 9) {
	                points = moves * 0.2 + points;
	                numBetween0To9 ++ ;
	 
	            } else if (moves <= 19) {
	                points = moves * 0.3 + points;
	 
	                numBetween10To19++;
	            } else if (moves <= 29) {
	                points = moves * 0.4 + points;
	 
	                numBetween20To29++;
	            } else if (moves <= 39) {
	                points = points + 50;
	                numBetween30To39++;
	            } else if (moves <= 50) {
	                points = points + 100;
	                numBetween40To50 ++;
	            } else {
	                points = points / 2;
	                invalidNumbers ++;
	            }
	        }
	        System.out.printf("%.2f%n", points);
	        System.out.printf("From 0 to 9: %.2f%%%n", (numBetween0To9 * 1.0/ movesCount) * 100);
	        System.out.printf("From 10 to 19: %.2f%%%n", (numBetween10To19 * 1.0/ movesCount) * 100);
	        System.out.printf("From 20 to 29: %.2f%%%n", (numBetween20To29 * 1.0/ movesCount) * 100);
	        System.out.printf("From 30 to 39: %.2f%%%n", (numBetween30To39 * 1.0/ movesCount) * 100);
	        System.out.printf("From 40 to 50: %.2f%%%n", (numBetween40To50 * 1.0/ movesCount) * 100);
	        System.out.printf("Invalid numbers: %.2f%%",(invalidNumbers * 1.0 / movesCount) * 100);
    }

}
