import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int priceTrainings = Integer.parseInt(scanner.nextLine());

	double priceTrainers = priceTrainings - 0.4 * priceTrainings;

	double priceSuit = priceTrainers - 0.2 * priceTrainers;

	double priceBall = priceSuit / 4;

	double priceAcc = priceBall / 5;

	double expenses = priceTrainings + priceTrainers + priceBall + priceSuit + priceAcc;

	System.out.println(expenses);

    }

}
