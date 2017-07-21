package exam1;

public class Exam01 {
    int ScoreA = 0;
    int ScoreB = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        ScoreA+=1;
    }

    public void playerBWin() {
        ScoreB+=1;
    }

    public String getScore() {
        if (ScoreA==1){
            return "Fifteen-Love";
        }else if(ScoreA==2){
            return "Thirty-Love";
        }else if (ScoreA==3){
            return "Forty-Love";
        }else if (ScoreA==4){
            return "Win for Player A";
        }else if(ScoreB==1) {
            return "Love-Fifteen";
        }else if (ScoreB==2){
            return "Love-Thirty";
        }else if (ScoreB==3){
            return "Love-Forty";
        }else if (ScoreB==4){
            return "Win for Player B";
        }
            return "Love-All";

    }

}
