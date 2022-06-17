package ForLoopMoreExercises;

import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	        int n = Integer.parseInt(scanner.nextLine());
	        double evenMin = Double.MAX_VALUE;
	        double evenMax = -Double.MAX_VALUE;
	        double evenSum = 0;
	        double oddMin = Double.MAX_VALUE;
	        double oddMax = -Double.MAX_VALUE;
	        double oddSum = 0;
	 
	 
	        for (int i = 1; i <= n; i++) {
	 
	            double numbers = Double.parseDouble(scanner.nextLine());
	            if (i % 2 == 0) {
	                evenSum = evenSum + numbers;
	                if (numbers >= evenMax) {
	                    evenMax = numbers;
	                }
	                if (numbers <= evenMin) {
	                    evenMin = numbers;
	                }
	            } else {
	                oddSum = oddSum + numbers;
	                if (numbers >= oddMax) {
	                    oddMax = numbers;
	                }
	                if (numbers <= oddMin) {
	                    oddMin = numbers;
	                }
	            }
	 
	        }
	        if (n == 0) {
	            System.out.printf("OddSum=%.2f,%n", oddSum);
	            System.out.println("OddMin=No,");
	            System.out.println("OddMax=No,");
	 
	        } else {
	            System.out.printf("OddSum=%.2f,%n", oddSum);
	            System.out.printf("OddMin=%.2f,%n", oddMin);
	            System.out.printf("OddMax=%.2f,%n", oddMax);
	        }
	 
	        System.out.printf("EvenSum=%.2f,%n", evenSum);
	        if (n > 1) {
	            System.out.printf("EvenMin=%.2f,%n", evenMin);
	            System.out.printf("EvenMax=%.2f%n", evenMax);
	        } else {
	            System.out.println("EvenMin=No,");
	            System.out.println("EvenMax=No");
	        }

    }

}
