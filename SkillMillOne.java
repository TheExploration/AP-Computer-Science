import java.util.*;

public class SkillMillOne {
    public static void main (String[] args) {
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
        
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("1. Enter a number:");


        number = scanner.nextInt();

        System.out.println("I like the number " + number);
    
    }
    
    static void Q2() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("2. Enter a number:");
        number = scanner.nextInt() * 2;
        System.out.println("Doubling that number gives us: " + number);
        
    }
    
    static void Q3() {
        Scanner scanner = new Scanner(System.in);
        int percentage = 0;
        System.out.println("3. How many percentage points do you want to \nbuy from your computer teacher?");
        percentage = scanner.nextInt() * 1000;
        System.out.println("Cost: $" + percentage);
        
        
    }
    static void Q4() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("4. Enter 2 numbers:");
        num1 = scanner.nextInt();
        System.out.println("Enter next number:");
        num2 = scanner.nextInt();
        System.out.println((double)num1/num2);
    }
    static void Q5() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("5. Enter 2 numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("First Number is larger.");
        } else if (num1 == num2) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Second Number is larger.");
        }
    }
    static void Q6() {
        Scanner scanner = new Scanner(System.in);
        int percentage = 0;
        double tax = 0;
        double total = 0;
        System.out.println("6. How many percentage points do you want to \nbuy from your computer teacher?");
        percentage = scanner.nextInt() * 1000;
        tax = (double)percentage*0.15;
        total = tax + percentage;
        
        System.out.println("That will cost $" + percentage);
        System.out.println("Tax will be $" + tax);
        System.out.println("Total will be $" + total + ", don't tell anyone!");
    }
    static void Q7() {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int total;
        System.out.println("5. Enter 2 numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        total = num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + total);

    }
    static void Q8() {
    }
    static void Q9() {
        
    }
    
    static void Q10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cents do you have?");
    }
}
