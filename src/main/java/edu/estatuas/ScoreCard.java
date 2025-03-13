package edu.estatuas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ScoreCard {
    private final String color;
    private String redCorner="";
    private String blueCorner="";
    private String judgeScoreCard;

    public ScoreCard (String color) {
        this.color = color;
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

   // public byte getNumRounds(){
    //    return
    //}

    public int getRedBoxerFinalScore() {
        return Integer.parseInt(redCorner);
    }

}