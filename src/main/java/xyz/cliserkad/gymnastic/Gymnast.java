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

	public int overallScore() {
		List<Integer> scores = new ArrayList<>();
		for(JudgeScore score : this.scores) {
			scores.add(score.score());
		}
		Collections.sort(scores);
		scores.remove(scores.size() - 1);
		scores.remove(0);
		int total = 0;
		for(int score : scores) {
			total += score;
		}
		if(scores.size() != 3)
			throw new IllegalStateException("Expected 3 scores, got " + scores.size());
		return total / scores.size();
	}

	public String toString() {
		return "Gymnast " + name + " from " + city + " has an overall score of " + overallScore();
	}
}
