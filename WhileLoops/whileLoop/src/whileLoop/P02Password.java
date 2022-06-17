package whileLoop;

import java.util.Scanner;

public class P02Password {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
        String username = scanner.nextLine();
        String pass = scanner.nextLine();
 
        String currentPass = scanner.nextLine();
        while (!currentPass.equals(pass)) {
            currentPass = scanner.nextLine();
        }
 
        System.out.printf("Welcome %s!", username);

    }

}
