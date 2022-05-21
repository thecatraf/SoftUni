import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	int numberOfProjects = Integer.parseInt(scanner.nextLine());
	
	System.out.print("The architect " + name + " will need " + numberOfProjects*3  + " hours to complete " + numberOfProjects + " project/s." );
    }

}
