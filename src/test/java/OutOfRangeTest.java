import org.junit.jupiter.api.Test;
import xyz.cliserkad.gymnastic.Gymnast;
import xyz.cliserkad.gymnastic.JudgeScore;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutOfRangeTest {

	@Test
	public void testOutOfRange() {
		Gymnast gymnast = new Gymnast("Sue Jones", "Dallas");
		try {
			gymnast.addScore(new JudgeScore(JudgeScore.MAX_DIFFICULTY + 1, 0.5, 0.5, 1));
			assertEquals(false, true);
		} catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Difficulty must be between " + JudgeScore.MIN_DIFFICULTY + " and " + JudgeScore.MAX_DIFFICULTY);
		}
	}

	@Test
	public void testOutOfRange2() {
		Gymnast gymnast = new Gymnast("Sue Jones", "Dallas");
		try {
			gymnast.addScore(new JudgeScore(0.5, JudgeScore.MAX_EXECUTION + 1, 0.5, 1));
			assertEquals(false, true);
		} catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Execution must be between " + JudgeScore.MIN_EXECUTION + " and " + JudgeScore.MAX_EXECUTION);
		}
	}

	@Test
	public void testOutOfRange3() {
		Gymnast gymnast = new Gymnast("Sue Jones", "Dallas");
		try {
			gymnast.addScore(new JudgeScore(0.5, 0.5, JudgeScore.MAX_DEDUCTIONS + 1, 1));
			assertEquals(false, true);
		} catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Deductions must be between " + JudgeScore.MIN_DEDUCTIONS + " and " + JudgeScore.MAX_DEDUCTIONS);
		}
	}
}
