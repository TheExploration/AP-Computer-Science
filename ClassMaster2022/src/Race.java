import java.util.Scanner;

public class Race {

    public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              System.out.println("Enter 'r' to start race! Any other key to quit");
              String ask=scan.nextLine();
              RaceHorse h1=new RaceHorse("Starlord", 18);
              RaceHorse h2=new RaceHorse("Thanos",17);
              
              while (ask.equals("r")) {
                        h1.resetDistance();
                        h2.resetDistance();
                        System.out.println("and they're off!");
                        do {
                            h1.move();
                            h2.move();
                            System.out.println(h1);
                            System.out.println(h2);    
                        }while( h1.getDistance()<1000 && h2.getDistance()<1000);

                        if (h1.getDistance()>h2.getDistance() ) {
                            System.out.println("h1 wins!");
                        }
                        else if (h2.getDistance()>h1.getDistance() ) {
                            System.out.println("h2 wins!");
                        }
                        else {
                            System.out.println("Amazing! It's a tie!");
                        }

                        System.out.println("Enter 'r' to race again.  Any other key to quit");
                        ask=scan.nextLine();
              }
              
              System.out.println("Thanks for racing!");
           
    }
    
}
