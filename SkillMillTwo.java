import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SkillMillTwo {
    public static void main(String[] args) {
        int question = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Question Number:");
        question = scanner.nextInt();
        switch (question) {
            case 1 -> Q1();
            case 2 -> Q2();
            case 3 -> Q3();
            case 4 -> Q4();
            case 5 -> Q5();
            case 6 -> Q6();
            case 7 -> Q7();
            case 8 -> Q8();
            case 9 -> Q9();
            case 10 -> Q10();
           
            default -> System.out.println("Not a valid question number.");
        }
    }
    static void Q1() {
        System.out.println("Easy");
    }
    static void Q2() {

        System.out.println("Easy");
    }
    static void Q3() {
        System.out.println("Easy");
    }
    static void Q4() {
        System.out.println("Easy");
    }
    static void Q5() {
        System.out.println("Easy");
    }
    static void Q6() {
        System.out.println("Easy");
    }
    static void Q7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many eggs do you want to buy?");
        int egg = scanner.nextInt();
        if (egg < 100) {
            System.out.println("Each egg will be $0.25");
            System.out.println(egg*0.25 + "$ Total");
            
        } else {
            System.out.println("Each egg will be $0.20");
            System.out.println(egg*0.2 + "$ Total");
        }
        
        
    }
    static void Q8() {
    }
    static void Q9() {
    }
    static void Q10() {
        Random rn = new Random();
        int dice = rn.nextInt(0, 5) + 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Rolling two dice...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) { }
        System.out.println();
        
        
    }
    static void Q11() {
    }
    static void Q12() {
    }
    static void Q13() {
    }
}
