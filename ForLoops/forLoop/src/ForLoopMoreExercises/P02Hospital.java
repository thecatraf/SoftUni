package ForLoopMoreExercises;

import java.util.Scanner;

public class P02Hospital {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	        int nPeriod = Integer.parseInt(scanner.nextLine());
	 
	        int docsAvailable = 7;
	        int treatedPatients = 0;
	        int untreatedPatients = 0;
	 
	        for (int i = 1; i <= nPeriod; i++ ) {
	            if (i%3==0){
	                if (untreatedPatients>treatedPatients) {
	                    docsAvailable++;
	                }
	            }
	            int patientsCount = Integer.parseInt(scanner.nextLine());
	 
	            if (docsAvailable<patientsCount){
	                treatedPatients=treatedPatients+docsAvailable;
	                untreatedPatients = untreatedPatients + patientsCount-docsAvailable;
	            } else {
	                treatedPatients = treatedPatients+patientsCount;
	            }
	          
	        
	        }
	        System.out.println("Treated patients: " + treatedPatients+ ".");
	            System.out.println("Untreated patients: " + untreatedPatients+ ".");

}
}
