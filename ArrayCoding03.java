import java.util.Arrays;
import java.util.Scanner;

public class ArrayCoding03 {
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

    }
    static void Q8() {
        System.out.println("Easy");
    }
    static void Q9() {
       int preval = 0;
       int val = 1;
       int[] fibonacci = new int[25];
       for (int i = 0; i < fibonacci.length; i++) {

           fibonacci[i] = val;
           val = preval+val;
           preval = val-preval;

       } 
       System.out.println(Arrays.toString(fibonacci));
    }
    static void Q10() {
        System.out.println("Easy");
        
    }
    static void Q11() {
        System.out.println("Easy");
    }
    static void Q12() {
        System.out.println("Easy");
    }
}
