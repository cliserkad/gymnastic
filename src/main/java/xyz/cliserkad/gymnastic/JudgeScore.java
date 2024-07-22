package xyz.cliserkad.gymnastic;

public class JudgeScore {
	public static final double MIN_DIFFICULTY = 0.1;
	public static final double MAX_DIFFICULTY = 7.5;
	public static final double MIN_EXECUTION = 0.1;
	public static final double MAX_EXECUTION = 2.5;
	public static final double MIN_DEDUCTIONS = 0.1;
	public static final double MAX_DEDUCTIONS = 1.0;


	public final double difficulty;
	public final double execution;
	public final double deductions;
	public final int judgeID;

	public JudgeScore(double difficulty, double execution, double deductions, final int judgeID) {
		if(difficulty < MIN_DIFFICULTY || difficulty > MAX_DIFFICULTY)
			throw new IllegalArgumentException("Difficulty must be between " + MIN_DIFFICULTY + " and " + MAX_DIFFICULTY);
		this.difficulty = difficulty;
		if(execution < MIN_EXECUTION || execution > MAX_EXECUTION)
			throw new IllegalArgumentException("Execution must be between " + MIN_EXECUTION + " and " + MAX_EXECUTION);
		this.execution = execution;
		if(deductions < MIN_DEDUCTIONS || deductions > MAX_DEDUCTIONS)
			throw new IllegalArgumentException("Deductions must be between " + MIN_DEDUCTIONS + " and " + MAX_DEDUCTIONS);
		this.deductions = deductions;
		this.judgeID = judgeID;
	}

	public double score() {
		return (difficulty + execution) - deductions;
	}

	public String toString() {
		return "Difficulty: " + difficulty +
			"\n Execution: " + execution +
			"\n Deductions: " + deductions +
			"\n Judge " + judgeID + " Score: " + score();
	}

}
