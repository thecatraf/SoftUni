import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int countChickenMenus = Integer.parseInt(scanner.nextLine());
	int countFishMenus = Integer.parseInt(scanner.nextLine());
	int countVegetarianMenus = Integer.parseInt(scanner.nextLine());

	double priceChickenMenus = countChickenMenus * 10.35;
	double priceFishMenus = countFishMenus * 12.40;
	double priceVegetarianMenus = countVegetarianMenus * 8.15;
	double priceAllMenus = priceChickenMenus + priceFishMenus + priceVegetarianMenus;

	double priceDessert = 0.2 * priceAllMenus;
	double priceDelivery = 2.50;

	double totalPrice = priceAllMenus + priceDessert + priceDelivery;
	System.out.println(totalPrice);

    }

}
