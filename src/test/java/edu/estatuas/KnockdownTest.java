package edu.estatuas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KnockdownTest {
    @Test
    public void replaceTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        assertEquals("10-8", round.getRoundScore("10 - 8"));
    }

    @Test
    public void roundScoreToIntTest() {
        KnockdownRound round = new KnockdownRound("10 - 8");
        assertEquals("10-8", round.getRoundScore("10 - 8"));
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }
}
