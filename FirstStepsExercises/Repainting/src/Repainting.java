import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int covering = Integer.parseInt(scanner.nextLine());
	int paint = Integer.parseInt(scanner.nextLine());
	int thinner = Integer.parseInt(scanner.nextLine());
	int hours = Integer.parseInt(scanner.nextLine());

	double sumCovering = (covering + 2) * 1.5;
	double sumPaint = (paint + 0.1 * paint) * 14.5;
	double sumThinner = thinner * 5;
	double sumBags = 0.4;
	double sumMaterials = sumCovering + sumPaint + sumThinner + sumBags;
	double workersPayment = (sumMaterials * 0.3) * hours;
	double finalSum = sumMaterials + workersPayment;
	
	System.out.println(finalSum);
    }

}
