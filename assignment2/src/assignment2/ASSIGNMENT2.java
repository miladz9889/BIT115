package assignment2;

import java.util.Scanner;

public class ASSIGNMENT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		int low = 0;
		int high = 100;
		int numGuesses = 0;
		int guess = 50;

		System.out.format("Pick a number between %d and %d\n", low, high);

		String answer = "";


		
		while ((high - low) >= 1) {
			numGuesses++;

			System.out.println("Is the number you pick " + guess);

			answer = cin.nextLine();

			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("I WIN!!!!!\nNumber of guesses : " + numGuesses);
				break;
			}

			if (numGuesses == 5) {
				break;
			}

			System.out.println("Is the number less than " + guess + "?");

			answer = cin.nextLine();

			if (answer.equalsIgnoreCase("yes")) {
				high = guess;
			}
			guess = low;

			guess = low + (high - low) / 2;
		}

		if (!answer.equalsIgnoreCase("yes")) {
			System.out.println("Aaaaah OK you win I guess :(");
		}

	}

}
