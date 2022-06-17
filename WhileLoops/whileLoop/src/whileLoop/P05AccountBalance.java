package whileLoop;

import java.util.Scanner;

public class P05AccountBalance {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	        String input = scanner.nextLine();
	 
	        double sum = 0;
	        while (!input.equals("NoMoreMoney")) {
	            double currentMoney = Double.parseDouble(input);
	            if (currentMoney < 0) {
	                System.out.println("Invalid operation!");
	                break;
	            }
	            System.out.printf("Increase: %.2f%n", currentMoney);
	 
	            sum = sum + currentMoney;
	 
	            input = scanner.nextLine();
	        }
	 
	        System.out.printf("Total: %.2f", sum);

    }

}
