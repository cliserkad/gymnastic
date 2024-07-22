package xyz.cliserkad.gymnastic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gymnast {
	public final String name;
	public final String city;

	private List<JudgeScore> scores;

	public Gymnast(String name, String city) {
		this.name = name;
		this.city = city;
		this.scores = new ArrayList<>();
	}

	public void addScore(JudgeScore score) throws IllegalStateException {
		if(scores.size() >= 5)
			throw new IllegalStateException("Cannot add more than 5 scores");
		scores.add(score);
	}

	public int scoreCount() {
		return scores.size();
	}

	public double overallScore() {
		List<Double> scores = new ArrayList<>();
		for(JudgeScore score : this.scores) {
			scores.add(score.score());
		}
		Collections.sort(scores);
		scores.remove(scores.size() - 1);
		scores.remove(0);
		double total = 0;
		for(double score : scores) {
			total += score;
		}
		if(scores.size() != 3)
			throw new IllegalStateException("Expected 3 scores, got " + scores.size());
		return total / scores.size();
	}

	public String toString() {
		String scores = "";
		for(JudgeScore score : this.scores) {
			scores += score + "\n";
		}

		return "Gymnast " + name + "\n"
			+ "City: " + city + "\n" +
			scores + "\n" +
			"Overall Score: " + overallScore();
	}
}
