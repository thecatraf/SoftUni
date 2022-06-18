import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int numberStudents = Integer.parseInt(scanner.nextLine());
	
	ArrayList<Double> grades = new ArrayList<Double>();

	//double [] over5 = null;
	//double [] between4and5 = null;
	//double [] between3and4 = null;
	//double [] bellow3 = null;
	ArrayList<Double> over5 = new ArrayList<Double>();
	ArrayList<Double> between4and5 = new ArrayList<Double>();
	ArrayList<Double> between3and4 = new ArrayList<Double>();
	ArrayList<Double> bellow3 = new ArrayList<Double>();
	double average;
	 double sum = 0;
	
	
	for(int i=0; i<=numberStudents-1;i++) {
	    double grade = Double.parseDouble(scanner.nextLine());
	    grades.add(grade);
	}
		
	for (double g : grades) {
	    if(g >=5.00) {
		over5.add(g);
		//System.out.println(g + " over5");
	    } else if (g>= 4 && g <=4.99) {
		between4and5.add(g);
		//System.out.println(g + " between4and5");
	    } else if (g>= 3.00 && g <=3.99 ) {
		between3and4.add(g);
		//System.out.println(g + " between3and4");
	    } else if(g<3.00 && g>=2.00) {
		bellow3.add(g);
		//System.out.println(g + " bellow3");
	    }
	     sum+=g;
	}
    
	average = sum/numberStudents;
//	System.out.println(over5.size());
//	System.out.println(between4and5.size());
//	System.out.println(between3and4.size());
//	System.out.println(bellow3.size());
	
	//System.out.println(sum);
	//double top = over5.size();
	//System.out.println(top);
	System.out.printf("Top students: %.2f%% \n", (double)over5.size()/numberStudents*100);
	System.out.printf("Between 4.00 and 4.99: %.2f%% \n",  (double)between4and5.size()/numberStudents*100);
	System.out.printf("Between 3.00 and 3.99: %.2f%% \n",  (double)between3and4.size()/numberStudents*100);
	System.out.printf("Fail: %.2f%%\n",  (double)bellow3.size()/numberStudents*100);
	System.out.printf("Average: %.2f\n", average);
    }

}
