package edu.estatuas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RegularRoundTest {
    @Test
    public void replaceTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals("10-9", round.getRoundScore());
    }

    @Test
    public void roundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals("10-9", round.getRoundScore());
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }

    @Test // este para el alumnado
    public void boxerRoundScoreToIntTest() {
        RegularRound round = new RegularRound("10 - 9");
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(9, round.getBlueBoxerScore());
    }
}
