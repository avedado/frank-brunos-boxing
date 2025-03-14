package edu.estatuas;

public class RegularRound {
    private final String roundScore;
    private Byte redBoxerScore;
    private Byte blueBoxerScore;


    RegularRound(String roundScore) {
        this.roundScore = roundScore;
    }

    public void boxerRoundScore() {
        String score=roundScore.replace("\s", "");
        int position = score.indexOf("-");
        this.redBoxerScore = (byte) Integer.parseInt(score.substring(0, position));
        this.blueBoxerScore = (byte) Integer.parseInt(score.substring(position + 1));
    }

    public Byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public Byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getBlueBoxerScore() + "-" + this.getRedBoxerScore();
    }
}
