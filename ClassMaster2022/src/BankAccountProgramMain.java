import java.util.Scanner;

public class BankAccountProgramMain {

    public static void main(String[] args) {
       BankAccount account = new BankAccount(123456, 100);
       System.out.println("Account Info:");
       System.out.println("Account #" + account.getAccountNumber () );
       System.out.println("Money $" + account.getMoney() );
       //a little loop to let user do stuff with the account.  Uses scanner class.
       //you will enter in the output window! watch for cursor there!
       
       Scanner scan = new Scanner(System.in);
       int choice=0;
       int value=0;
       
       do {
           System.out.println("1: details, 2: set money, 3: add money, 4: take out money, 5: exit");
           choice=scan.nextInt();
           if (choice==1) {
                System.out.println("Account Info:");
                System.out.println("Account #" + account.getAccountNumber () );
                System.out.println("Money $" + account.getMoney() );               
           }
           else if (choice==2) {
               System.out.println("Set to?");
               double newMoney=scan.nextDouble();
               account.setMoney(newMoney);
           }
           else if (choice==3) {
               System.out.println("How much to add?");
               double addThis=scan.nextDouble();
               account.addMoney(addThis);
           }
           else if (choice==4) {
               System.out.println("Take out how much?");
               double takeOut=scan.nextDouble();
               account.takeOutMoney(takeOut);
           }
           else if (choice==5) {
               System.out.println("Exitting...");
           }
           else {
               System.out.println("Not valid choice.  Pick again.");
           }
       }while(choice!=5);
      
       
        scan.close();  //close stream when done
       
    }
    
}
