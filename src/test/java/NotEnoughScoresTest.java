import org.junit.jupiter.api.Test;
import xyz.cliserkad.gymnastic.Gymnast;
import xyz.cliserkad.gymnastic.JudgeScore;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotEnoughScoresTest {

	@Test
	public void testNotEnoughScores() {
		Gymnast gymnast = new Gymnast("Sue Jones", "Dallas");
		try {
			gymnast.addScore(new JudgeScore(6, 2, 0.5, 1));
			gymnast.addScore(new JudgeScore(7, 1.7, 0.3, 2));
			gymnast.addScore(new JudgeScore(7, 1.6, 0.1, 3));
			gymnast.addScore(new JudgeScore(7.2, 2.3, 0.1, 4));
			System.out.println(gymnast);
			assertEquals(false, true);
		} catch(IllegalStateException e) {
			assertEquals(e.getMessage(), "Expected 3 scores, got 2");
		}
	}
}
