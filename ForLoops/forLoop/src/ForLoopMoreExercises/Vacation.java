package ForLoopMoreExercises;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
 
        String location;
        String innType;
        double innPrice;
 
        if (budget<=1000){
            innType ="Camp";
            if(season.equals("Summer")){
                location = "Alaska";
                innPrice = budget*0.65;
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }
            if(season.equals("Winter")){
                location = "Morocco";
                innPrice = budget*0.45;
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }
        }
        if (budget>1000 && budget<=3000){
            innType ="Hut";
            if(season.equals("Summer")){
                location = "Alaska";
                innPrice = budget*0.8;
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }
            if(season.equals("Winter")){
                location = "Morocco";
                innPrice = budget*0.60;
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }
        }
        if (budget>3000){
            innType ="Hotel";
            if(season.equals("Summer")){
                location = "Alaska";
                innPrice = budget*0.9;
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }
            if(season.equals("Winter")){
                location = "Morocco";
                innPrice = budget*0.90;
 
                System.out.printf("%s - %s - %.2f",location, innType,innPrice);
            }

    }

}
}
