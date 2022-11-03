public class GameTracker {
    
    private int p1wins;
    private int p2wins;
    
    public GameTracker() {
        p1wins=0; p2wins=0; 
    }
    
    public GameTracker(int p1wins, int p2wins) {
        if (p1wins>0 && p2wins>0) {
            this.p1wins=p1wins;
            this.p2wins=p2wins;
        }
        else {
            System.out.println("bad arguments");
        }
    }
    
    public int getPlayerOneWins() {
        return p1wins;
    }
    
    public int getPlayerTwoWins() {
        return p2wins;
    }
    
    public int getGameCount() {
        int total = p1wins+p2wins;
        return total;
    }
    
    public void recordWin(int winner) {
        if (winner==1)
            p1wins++;
        else if (winner==2)
            p2wins++;
        else
            System.out.println("bad winner value"); 
    }
    
    public int getLeader() {
        if (p1wins>p2wins)
            return 1;
        else if (p2wins>p1wins)
            return 2;
        else
            return 0;
    }
    
    public String toString() {
        return "P1: " + p1wins + " , P2: " + p2wins;
    }
    
}
