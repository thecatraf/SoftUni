import java.util.Scanner;

public class ChristmasPreparation {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double paperPrice = 5.80;
	double clothPrice = 7.20;
	double gluePrice = 1.20;
	
	int paperCount;
	int clothCount;
	double glueAmmount;
	int discountPercent;
	
	paperCount = Integer.parseInt(scanner.nextLine());
	clothCount = Integer.parseInt(scanner.nextLine());
	glueAmmount = Double.parseDouble(scanner.nextLine());
	discountPercent =  Integer.parseInt(scanner.nextLine());

	double sum = paperPrice*paperCount + clothCount * clothPrice + glueAmmount * gluePrice;
	double discount = (discountPercent/100.0f) * sum; 
	
	//System.out.printf("%.3f\n",discount);
	System.out.printf("%.3f",sum - discount);
	
    }

}
