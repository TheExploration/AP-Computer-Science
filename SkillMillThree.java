
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SkillMillThree {
    public static void main(String[] args) throws InterruptedException {
        int question = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Question Number:");
        if (scanner.hasNextInt()) {
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
        } else {
            System.out.println("Not a number.");
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
        System.out.println("Enter a new password:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Re-enter password for confirmation:");
        String confirmpassword = scanner.nextLine();
        if (password.equals(confirmpassword)) {
            System.out.println("New password set!");
        } else {
            System.out.println("Not the same.");
        }
    }
    static void Q7() {
        System.out.println("Easy");
    }
    static void Q8() {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter a second, larger, number");
        int num2 = scanner.nextInt();
        if (num1 <= num2) {
            System.out.println("Multiples of 7:");
            for (int i = num1; i <= num2; i++) {
                if (i % 7 == 0) {
                    System.out.println(i);
                    
                }
            }
            
        } else {
            System.out.println("First number is not larger then second number!");
        }
        
   
    }
    static void Q9() {
        System.out.println("Easy");
    }
    static void Q10() {
      
    }
    static void Q11() {
        System.out.println("Easy");
    }
    static void Q12() {
        System.out.println("Easy");
    }
    
}
