package exam1;

public class Exam01 {
    int ScoreA = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        ScoreA+=1;
    }

    public void playerBWin() {
    }

    public String getScore() {
        if (ScoreA==1){
            return "Fifteen-Love";
        }else if(ScoreA==2){
            return "Thirty-Love";
        }
        return "Love-All";

    }

}
