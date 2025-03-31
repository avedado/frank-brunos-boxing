package edu.estatuas;

public class PointsDeducted implements Round {
    private String roundScore="";
    public byte redBoxerScore;
    public byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        if(this.roundScore == roundScore.replaceAll("\\s", ""));
        this.parseBoxerRoundScore();
    }

    String getRoundScore() {
        return this.roundScore;
    }

    private void parseBoxerRoundScore() {

        String[] scores = getRoundScore().split("-", 2);
        String redBoxerRoundScore = scores[0];
        String blueBoxerRoundScore = scores[1];

        if (redBoxerRoundScore.indexOf(',') == -1) {
            this.redBoxerScore = Byte.parseByte(redBoxerRoundScore);
            this.blueBoxerScore = this.parseComaBlue(blueBoxerRoundScore);
        } else {
            this.blueBoxerScore = Byte.parseByte(blueBoxerRoundScore);
            this.redBoxerScore = this.parseComaRed(redBoxerRoundScore);
        }
    }

    private byte parseComaBlue(String score) {
        return blueBoxerScore;
    }

    private byte parseComaRed(String score) {
        return redBoxerScore;
    }

    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}
