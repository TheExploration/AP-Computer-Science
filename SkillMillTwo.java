
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SkillMillThree {
    public static void main(String[] args) throws InterruptedException {
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
        System.out.println("Easy");
    }
    static void Q9() {
        System.out.println("Easy");
    }
    static void Q10() throws InterruptedException {
        System.out.println("Rolling two dice...");
        TimeUnit.SECONDS.sleep(2);
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        if (dice1 == 6 && dice2 == 6) {
            System.out.println("You win 50$!");
        } else if (dice1 == 6 || dice2 == 6) {
            System.out.println("You win 10$!");
        } else if (dice1 == 7 || dice2 == 7) {
            System.out.println("Bug23wdrewadfas");
        } else {
            System.out.println("Sorry, try again!");
        }
    }
    static void Q11() {
        System.out.println("Easy");
    }
    static void Q12() {
        System.out.println("Easy");
    }
    
}
