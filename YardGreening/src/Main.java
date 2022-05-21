import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double yardSize = Double.parseDouble(scanner.nextLine());
	double price = yardSize*7.61;
	double discount = price*0.18;
	double finalPrice = price-discount;
	System.out.print("The final price is: " + finalPrice + " lv." );
	System.out.print("The discount is: " + discount + " lv." );
    }

}
