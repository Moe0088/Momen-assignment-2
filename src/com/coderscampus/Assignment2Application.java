package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		

		System.out.println("Pick a number between 1 and 100:");
		Integer guessNumber = scanner.nextInt();

		if (guessNumber < 1 || guessNumber > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again: ");
		}
		int i = 0;
		while ( i < 4) {
			if (guessNumber < randomNumber) {
				System.out.println("Please pick a higher number");
				guessNumber = scanner.nextInt();
			} else if (guessNumber > randomNumber) {
				System.out.println("Please pick a lower number");
				guessNumber = scanner.nextInt();

			} else if (guessNumber == randomNumber) {
				System.out.println("You Win!");
			}
			i++;

		}
		System.out.println("You Lose! The number you guess was " + randomNumber);
	}
}
