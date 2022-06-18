import java.util.Scanner;

public class UniquePINCodes {

    public static void main(String[] args) {
	 
        Scanner scanner = new Scanner(System.in);
 
        int firstMaxNumber = Integer.parseInt(scanner.nextLine());
        int middleMaxNumber = Integer.parseInt(scanner.nextLine());
        int lastMaxNumber = Integer.parseInt(scanner.nextLine());
 
        for (int first = 2; first<=firstMaxNumber; first+=2){
            for(int second = 2; second<=middleMaxNumber; second++){
                for (int third = 2; third<=lastMaxNumber; third+=2){
                    if (second != 4 && second!=6 && second !=8 && second!=9) {
                        System.out.printf("%d %d %d%n", first, second, third);
                    }
                }
            }
        }
    }
}