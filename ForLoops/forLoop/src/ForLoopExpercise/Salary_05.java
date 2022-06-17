package ForLoopExpercise;

import java.util.Scanner;

public class Salary_05 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
 
        int totalSalary = salary;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
 
            if(input.equals("Facebook")) {
                totalSalary = totalSalary - 150;
            } else if (input.equals("Instagram")) {
                totalSalary = totalSalary - 100;
            } else if (input.equals("Reddit")) {
                totalSalary = totalSalary - 50;
            }
 
            if(totalSalary <= 0) {
                break;
            }
        }
        if(totalSalary > 0) {
            System.out.println(totalSalary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }

}
