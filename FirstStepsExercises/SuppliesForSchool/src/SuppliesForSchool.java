import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
   	int pens = Integer.parseInt(scanner.nextLine());
   	int markers = Integer.parseInt(scanner.nextLine());
   	int litres = Integer.parseInt(scanner.nextLine());
   	double discount = Double.parseDouble(scanner.nextLine())/100;

   	double sum = pens * 5.8 + markers * 7.2 + litres * 1.2;
   	double finalSum = sum - (sum*discount);
   	System.out.println(finalSum);
    	}
    }


