package exam1;

public class Exam01 {
    int ScoreA = 0;
    int ScoreB = 0;

    public static void main(String[] args) {
        Exam01 FinalTest=new Exam01("Player A","Player B");
        FinalTest.playerAWin();
        FinalTest.playerBWin();

        System.out.println(FinalTest.getScore());
    }

    public Exam01(String firstPerson, String secondPerson) {

    }


    public void playerAWin() {
        ScoreA+=1;
    }

    public void playerBWin() {
        ScoreB+=1;
    }

    public String getScore() {
        if (ScoreA==0&&ScoreB==0){
            return "Love-All";
        }else if(ScoreA==1&&ScoreB<1){
            return "Fifteen-Love";
        }else if (ScoreA==1&&ScoreB==1){
            return "Fifteen-All";
        }else if (ScoreA==2&&ScoreB==1) {
            return "Thirty-Fifteen";
        }else if(ScoreA==2&&ScoreB<2){
            return "Thirty-Love";
        }else  if (ScoreA==2&&ScoreB==2){
            return "Thirty-All";
        }else if (ScoreA==3&&ScoreB==1){
            return "Forty-Fifteen";
        }else if (ScoreA==3&&ScoreB==2){
            return "Forty-Thirty";
        }else if (ScoreA==3&ScoreB<3){
            return "Forty-Love";
        }else if (ScoreA==4&&ScoreB<3){
            return "Win for Player A";
        }else if(ScoreB==1&&ScoreA<1) {
            return "Love-Fifteen";
        }else if (ScoreB==2&&ScoreA==1){
            return "Fifteen-Thirty";
        }else if (ScoreB==2&&ScoreA<2){
            return "Love-Thirty";
        }else if (ScoreB==3&&ScoreA==2){
            return "Thirty-Forty";
        }else if (ScoreB==3&&ScoreA==1){
            return "Fifteen-Forty";
        }else if (ScoreB==3&&ScoreA<3){
            return "Love-Forty";
        }else if (ScoreB==4&&ScoreA<3){
            return "Win for Player B";
        }else if (ScoreA==ScoreB) {
            return "Deuce";
        }else if (ScoreA>=3&&ScoreB>=3){
            if (ScoreA-ScoreB==1){
                return "Advantage Player A";
            }else if (ScoreB-ScoreA==1){
                return "Advantage Player B";
            }else if (ScoreA-ScoreB>1){
                return "Win for Player A";
            }else if (ScoreB-ScoreA>1){
                return "Win for Player B";
            }
        }
            return null;

    }

}
