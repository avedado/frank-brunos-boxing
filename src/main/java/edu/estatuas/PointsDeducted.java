package edu.estatuas;

public class PointsDeducted implements Round {
    private String roundScore="";
    public byte redBoxerScore;
    public byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        if(this.roundScore == roundScore.replaceAll("\\s", ""));
        this.boxerRoundScore();
    }

    public String boxerRoundScore() {
        String score=roundScore.replace("\s", "");
        int position = score.indexOf("-");
        this.redBoxerScore = (byte) Integer.parseInt(score.substring(0, position));
        this.blueBoxerScore = (byte) Integer.parseInt(score.substring(position + 1));
        if (roundScore.replace(",1", "" || "1,", "");
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
