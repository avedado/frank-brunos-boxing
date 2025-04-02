package edu.estatuas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointsDeductedTest {
    @Test
    public void replaceTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals("10-8,1", round.getRoundScore());
        round = new PointsDeducted("1, 8 - 10");
        assertEquals("1,8-10", round.getRoundScore());
    }

    @Test
    public void roundScoreToIntBlueTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals("10-8,1", round.getRoundScore());
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }

    @Test
    public void roundScoreToIntRedTest() {
        PointsDeducted round = new PointsDeducted("1, 8 - 10");
        assertEquals("1,8-10", round.getRoundScore());
        assertEquals(8, round.getRedBoxerScore());
        assertEquals(10, round.getBlueBoxerScore());
    }
}
