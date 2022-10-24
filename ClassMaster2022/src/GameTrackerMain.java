public class GameTrackerMain {

    public static void main(String[] args) {
         GameTracker gt = new GameTracker(10,20);
         //violates access!!! System.out.println(gt.scoreP1);
         System.out.println(  gt.getPlayer2Score() );
         int sum=gt.getPlayer1Score() + gt.getPlayer2Score();
         System.out.println(sum);
         gt.setPlayer1Score(-1000);
         System.out.println( gt.getPlayer1Score() );
         
    }
    
}
