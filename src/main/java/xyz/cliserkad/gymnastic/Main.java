package xyz.cliserkad.gymnastic;

public class Main {

	public static void main(String[] args) {
		Gymnast gymnast = new Gymnast("John", "New York");
		gymnast.addScore(new JudgeScore(10, 10, 0));
		gymnast.addScore(new JudgeScore(10, 10, 0));
		gymnast.addScore(new JudgeScore(10, 10, 0));
		gymnast.addScore(new JudgeScore(10, 10, 0));
		gymnast.addScore(new JudgeScore(10, 10, 0));
		System.out.println(gymnast);
	}

}