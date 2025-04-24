package day7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); //create a new class random
		int targetNumber= random.nextInt(10)+1;
		int attempts=3;
		boolean guessCorrectly = false;
		System.out.println("Welcome to the number guessing game");
		System.out.println("Guess a number between 1 and 10");
		System.out.println("You have " + attempts + "attempts. Good Luck!!");
		
		for(int i=1; i<=attempts; i++) {
			System.out.println("Attempt " + i + ": Enter your guess: ");
			int userGuess = scanner.nextInt();
			if(userGuess==targetNumber) {
				System.out.println("Congratulations! You guessed the correct number!");
				break;
			}else {
				System.out.println("X Wrong guess");
				if(i<attempts) {
					System.out.println("Try again");
				}
			}
			
			
		}
		if(!guessCorrectly) {
			System.out.println("You have used all your attempts. The correct number is  " + targetNumber);
		}

	}

}
