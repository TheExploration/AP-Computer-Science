public class GameTracker {
    
    private int scoreP1;
    private int scoreP2;
    
    public GameTracker(int scoreP1, int scoreP2) {
        this.scoreP1=scoreP1;
        this.scoreP2=scoreP2;
    }
    
    //accessor method
    public int getPlayer1Score() {
        return scoreP1;
    }
    
    public int getPlayer2Score() {
        return(scoreP2);
    }
    
    public void setPlayer1Score(int score) {
        if (score>=0)
            scoreP1=score;
        else
            System.out.println("no change - invalid score value");
    }
    
    public void setPlayer2Score(int score) {
        if (score>=0) 
            scoreP2=score;
        else
            System.out.println("no change - invalid score value");
    }
    
}
