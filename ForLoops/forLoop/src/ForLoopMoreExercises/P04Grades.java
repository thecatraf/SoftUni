package ForLoopMoreExercises;

import java.util.Scanner;

public class P04Grades {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	        int students = Integer.parseInt(scanner.nextLine());
	 
	        double totalGrade = 0;
	        int studensFail = 0;
	        int studentsBetween3And399 = 0;
	        int studentsBetween4And499 = 0;
	        int studentsTop = 0;
	 
	        for (int i = 1; i <=students ; i++) {
	            double grade = Double.parseDouble(scanner.nextLine());
	 
	            totalGrade = totalGrade + grade;
	 
	            if(grade <3){
	                studensFail++;
	            } else if (grade <= 3.99) {
	                studentsBetween3And399 ++;
	            } else if (grade <= 4.99) {
	                studentsBetween4And499 ++;
	            } else {
	                studentsTop ++;
	            }
	        }
	        System.out.printf("Top students: %.2f%%%n", ((studentsTop * 1.0 / students) * 100));
	        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",((studentsBetween4And499 * 1.0 / students) * 100) );
	        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", ((studentsBetween3And399 * 1.0 / students)* 100));
	        System.out.printf("Fail: %.2f%%%n", ((studensFail * 1.0 / students) * 100));
	        System.out.printf("Average: %.2f", totalGrade / students);
    }

}
