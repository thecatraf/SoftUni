import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	double deposit = Double.parseDouble(scanner.nextLine());
   	int months = Integer.parseInt(scanner.nextLine());
   	double lihva = Double.parseDouble(scanner.nextLine())/100;
   	double sum = deposit + months* ((deposit*lihva)/12);
   	
   	
   	System.out.println(sum);

       }

}
