package WhileLoopMoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 
	String input = scan.nextLine();
	String con = "";
	String word = "";


	while(!input.equals("End")) { 
		String letter = input;


		if (letter.equals("c") || letter.equals("o") || letter.equals("n")) {
			if (!con.contains(letter)) {
				con += letter;
			} else {
				word += letter;
			}

			if (con.length() == 3) {
				con = "";
				word = word.replaceAll("[^a-zA-Z0-9]", ""); // Thank you, StackOverflow
				word += " ";
				System.out.print(word);
				word = "";
			}

		} else {
			word += letter;
		}
		input = scan.nextLine();
	}
    }

}
