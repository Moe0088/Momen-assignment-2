package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;

		System.out.println(randomNumber);

		System.out.println("Pick a number between 1 and 100:");

		int attempts = 0;
		boolean endGame = false;
		while (!endGame) {
			int guessNumber = scanner.nextInt();

			if (guessNumber < 1 || guessNumber > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again: ");

			} else if (guessNumber < randomNumber) {
				attempts++;
				System.out.println("Please pick a higher number");

			} else if (guessNumber > randomNumber) {
				attempts++;
				System.out.println("Please pick a lower number");

			} else {
				System.out.println("You win!");
				endGame = true;

			}

			if (attempts == 5) {
				System.out.println("You lose! The number to guess was: " + randomNumber);
				endGame = true;
			}
		}

		scanner.close();

	}
}
