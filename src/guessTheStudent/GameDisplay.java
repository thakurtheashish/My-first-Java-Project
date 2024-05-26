
package guessTheStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameDisplay {

	private int wrongAttempts = 0;
    private final int maxWrongAttempts = 5;

	Scanner sc = new Scanner(System.in);

	public void displaygame(String pickedStudent, List<Character> playerGuess) {
		String studentpicked = pickedStudent.toLowerCase();

		System.out.print("You are guessing : ");
		for (int i = 0; i < studentpicked.length(); i++) {
			System.out.print("-");
		}
		System.out.println();

		while (wrongAttempts <= maxWrongAttempts) {
			System.out.println("You have guessed " + wrongAttempts + " wrong letters");
			playerGuesses(playerGuess, studentpicked);
			System.out.print("You are guessing : ");
			for (int i = 0; i < studentpicked.length(); i++) {
				if (playerGuess.contains(studentpicked.charAt(i))) {
					System.out.print(studentpicked.charAt(i));
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (isGameWon(studentpicked, playerGuess)) {
				System.out.println("Congratulations! You've guessed the student: " + pickedStudent);
				return;
			}
		}
		System.out.println("Game over! The student was: " + pickedStudent);
	}

	public void playerGuesses(List<Character> playerGuess, String pickedStudent) {

		System.out.print("Guess the letter : ");
		String letterGuessed = sc.nextLine().toLowerCase();

		while (letterGuessed.length() != 1 || !Character.isLetter(letterGuessed.charAt(0))) {
			System.out.println("Invalid input. Guess a single alphabet only : ");
			letterGuessed = sc.nextLine().toLowerCase();
		}

		if (playerGuess.contains(letterGuessed.charAt(0))) {
			System.out.println("You have already made this guess.");
		} else {
			playerGuess.add(letterGuessed.charAt(0));
			if (!pickedStudent.contains(letterGuessed)) {
				wrongAttempts++;
			}
		}
	}

	private boolean isGameWon(String studentName, List<Character> playerGuess) {
		for (char letter : studentName.toCharArray()) {
			if (!playerGuess.contains(letter)) {
				return false;
			}
		}
		return true;
	}
}
