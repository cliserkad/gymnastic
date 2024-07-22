import org.junit.jupiter.api.Test;
import org.junit.platform.commons.JUnitException;
import xyz.cliserkad.gymnastic.Gymnast;
import xyz.cliserkad.gymnastic.JudgeScore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static xyz.cliserkad.gymnastic.Main.RANDOM;

public class TooManyScoresTest {

	@Test
	public void testTooManyScores() {
		try {
			Gymnast gymnast = new Gymnast("John", "New York");
			for(int i = 0; i < 5; i++) {
				gymnast.addScore(new JudgeScore(RANDOM.nextDouble(0.1, 7.5), RANDOM.nextDouble(0.1, 2.5), RANDOM.nextDouble(0.1, 1.0), i + 1));
			}
			gymnast.addScore(new JudgeScore(7.5, 2.5, 1.0, 6));


			System.out.println(gymnast);
			assertEquals(true, false);
		} catch(IllegalStateException e) {
			assertEquals("Cannot add more than 5 scores", e.getMessage());
		}
	}



}
