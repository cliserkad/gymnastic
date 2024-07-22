package xyz.cliserkad.gymnastic;

public class JudgeScore {
	public final int difficulty;
	public final int execution;
	public final int deductions;

	public JudgeScore(int difficulty, int execution, int deductions) {
		this.difficulty = difficulty;
		this.execution = execution;
		this.deductions = deductions;
	}

	public int score() {
		return (difficulty + execution) - deductions;
	}

}
