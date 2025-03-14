package edu.estatuas;


public class RoundFactory {


    public Round getRound(String roundScore)    {
        if (roundScore == null) {
            return null;
    }

        if (this.roundScore == "9-10" || "10 -9") {
            return new RegularRound(roundScore);
    }

        if else(this.roundScore == "8-10" || "10-8") {
            return new KnockdownRound(roundScore);
    }

        if else(this.roundScore == "1,8-10" || "10-8,1") {
            return new PointsDeducted(roundScore);
    }

        return null;

    }
}
