package guessTheStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		List <Character> playerGuess = new ArrayList<>();
		
		PickStudentFromList pc = new PickStudentFromList();
		pc.loadStudentList();
		String studentPicked = pc.pickRandomStudent();
		
		System.out.println("You are guessing : " + studentPicked);
		
		GameDisplay gm = new GameDisplay();
		gm.displaygame(studentPicked, playerGuess);
		
		
	}

}
