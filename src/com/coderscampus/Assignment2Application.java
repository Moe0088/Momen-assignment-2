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
		Integer guessNumber = scanner.nextInt();

		while (guessNumber < 1 || guessNumber > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again: ");
			guessNumber = scanner.nextInt();
		}

		boolean isNumber = false;
		for (int i = 0; i < 4; i++) {
			if (guessNumber < randomNumber) {
				System.out.println("Please pick a higher number");
				guessNumber = scanner.nextInt();
			} else if (guessNumber > randomNumber) {
				System.out.println("Please pick a lower number");
				guessNumber = scanner.nextInt();
			} else if (guessNumber == randomNumber) {
				System.out.println("You win!");
				isNumber = true;
				break;
			}

		}

		 if (guessNumber == randomNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The number to guess was: " + randomNumber);
        }
		scanner.close();

	}

}
