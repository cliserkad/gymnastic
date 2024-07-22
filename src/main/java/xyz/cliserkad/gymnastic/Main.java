package xyz.cliserkad.gymnastic;

import java.util.Random;

public class Main {

	public static final Random RANDOM = new Random();

	public static void main(String[] args) {
		Gymnast gymnast = new Gymnast("John", "New York");
		for(int i = 0; i < 5; i++) {
			double difficulty = RANDOM.nextDouble(JudgeScore.MIN_DIFFICULTY, JudgeScore.MAX_DIFFICULTY);
			double execution = RANDOM.nextDouble(JudgeScore.MIN_EXECUTION, JudgeScore.MAX_EXECUTION);
			double deductions = RANDOM.nextDouble(JudgeScore.MIN_DEDUCTIONS, JudgeScore.MAX_DEDUCTIONS);
			gymnast.addScore(new JudgeScore(difficulty, execution, deductions, i + 1));
		}
		System.out.println(gymnast);
	}

}