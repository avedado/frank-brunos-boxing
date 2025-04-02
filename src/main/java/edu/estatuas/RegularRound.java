package edu.estatuas;

public class RegularRound implements Round{
    private final String roundScore;
    private Byte redBoxerScore;
    private Byte blueBoxerScore;


    RegularRound(String roundScore) {
        this.roundScore = roundScore;
    }

    String getRoundScore() {
        return this.roundScore;
    }

    public void boxerRoundScore() {
        String score=roundScore.replace("\s", "");
        int position = score.indexOf("-");
        this.redBoxerScore = (byte) Integer.parseInt(score.substring(0, position));
        this.blueBoxerScore = (byte) Integer.parseInt(score.substring(position + 1));
    }

    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getBlueBoxerScore() + "-" + this.getRedBoxerScore();
    }
}
