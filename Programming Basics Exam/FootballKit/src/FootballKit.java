import java.util.Scanner;

public class FootballKit {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double tshirtPrice = Double.parseDouble(scanner.nextLine());
	double sumToReach = Double.parseDouble(scanner.nextLine());
	
	double shortsPrice = tshirtPrice * 0.75;
	double socksPrice = shortsPrice * 0.2;
	double shoesPrice = (shortsPrice + tshirtPrice) * 2;
	double sum = tshirtPrice + shortsPrice + socksPrice + shoesPrice;
	double afterDiscount = sum - (sum*0.15);
	
	//System.out.println(afterDiscount);
	
	if(afterDiscount>=sumToReach) {
	    System.out.println("Yes, he will earn the world-cup replica ball!"); 
	    System.out.printf("His sum is %.2f lv.", afterDiscount); 
		
	} else {
	    System.out.println("No, he will not earn the world-cup replica ball."); 
	    System.out.printf("He needs %.2f lv. more.", sumToReach - afterDiscount); 
	}
    }

}
