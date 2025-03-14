package edu.estatuas;

public class KnockdownRound {
    private String roundScore="";
    public byte redBoxerScore;
    public byte blueBoxerScore;

    KnockdownRound(String roundScore){
        if(roundScore.equals("8-10" || "10-8"){
            return new roundScore
        }
    }

    public void boxerRoundScore() {
        return this.roundScore()
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
