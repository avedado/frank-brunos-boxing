package edu.estatuas;

public class KnockdownRound implements Round{
    private String roundScore="";
    public byte redBoxerScore;
    public byte blueBoxerScore;

    KnockdownRound(String roundScore){
        this.roundScore=roundScore;
    }

    String getRoundScore (String roundScore) {
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

    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}
