package exam1;

public class Exam01 {
    int ScoreA = 0;
    int ScoreB = 0;
    String player1;
    String player2;
    String[] Score = new String[]{"Love","Fifteen","Thirty","Forty"};

    public Exam01(String firstPerson,String secondPerson) {
        this.player1 = firstPerson;
        this.player2 = secondPerson;
    }

    public void playerAWin() {
        ScoreA += 1;
    }

    public void playerBWin() {
        ScoreB += 1;
    }

    public String getScore() {
        if (ScoreA < 4 && ScoreB < 4 && ScoreA + ScoreB < 6) {
            if (ScoreA == ScoreB && ScoreA == 0) {
                return Score[ScoreA] + "-All";
            } else if (ScoreA == ScoreB) {
                return Score[ScoreA] + "-All";
            } else
                return Score[ScoreA] + "-" + Score[ScoreB];
        } else if (ScoreA == 4 && ScoreB < 3) {
            return "Win for " + player1;
        } else if (ScoreB == 4 && ScoreA < 3) {
            return "Win for " + player2;
        } else if (ScoreA == ScoreB) {
            return "Deuce";
        } else if (Math.abs(ScoreA - ScoreB) == 1) {
            if (ScoreA > ScoreB) {
                return "Advantage " + player1;
            } else
                return "Advantage " + player2;
        } else if (Math.abs(ScoreA - ScoreB) == 2) {
            if (ScoreA > ScoreB) {
                return "Win for " + player1;
            } else
                return "Win for " + player2;
        } else
            return null;
    }
}
