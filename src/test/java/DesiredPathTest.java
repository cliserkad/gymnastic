/*
 * Enter the gymnast’s name: Sue Jones
 * Enter the gymnast’s city: Dallas
 * Enter the difficulty score given by judge #1:  6
 * Enter the execution score given by judge #1:  2
 * Enter the deduction given by judge #1: .5
 * Judge 1 Score: 7.5
 *
 * Enter the difficulty score given by judge #2:  7
 * Enter the execution score given by judge #2:  1.7
 * Enter the deduction given by judge #2: .3
 * Judge 2 Score: 8.4
 *
 * Enter the difficulty score given by judge #3:  7–
 * Enter the execution score given by judge #3: 1.6
 * Enter the deduction given by judge #3: .1
 * Judge 3 Score: 8.5
 *
 * Enter the difficulty score given by judge #4: 7.2
 * Enter the execution score given by judge #4:  2.3
 * Enter the deduction given by judge #4: .1
 * Judge 4 Score: 9.4
 *
 * Enter the difficulty score given by judge #5:  6.9
 * Enter the execution score given by judge #5: 1.8
 * Enter the deduction given by judge #5: .5
 * Judge 5 Score: 8.2
 *
 * Gymnast: Sue Jones, City: Dallas
 * Overall score was 8.37
 */

import org.junit.jupiter.api.Test;
import xyz.cliserkad.gymnastic.Gymnast;
import xyz.cliserkad.gymnastic.JudgeScore;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test the gymnastic scoring system.
 */
public class DesiredPathTest {

	@Test
	public void testDesiredPath() {
		Gymnast gymnast = new Gymnast("Sue Jones", "Dallas");
		gymnast.addScore(new JudgeScore(6, 2, 0.5, 1));
		gymnast.addScore(new JudgeScore(7, 1.7, 0.3, 2));
		gymnast.addScore(new JudgeScore(7, 1.6, 0.1, 3));
		gymnast.addScore(new JudgeScore(7.2, 2.3, 0.1, 4));
		gymnast.addScore(new JudgeScore(6.9, 1.8, 0.5, 5));
		assertEquals(gymnast.overallScore(), 8.37, 0.01);
	}
}
