public class BankAccountMain {

    public static void main(String[] args) {
       BankAccount account = new BankAccount(123456, 100);
       System.out.println("Account Info:");
       System.out.println("Account #" + account.getAccountNumber () );
       System.out.println("Money $" + account.getMoney() ); 
       double rememberMoney = account.getMoney();
       
       account.setMoney(250.0);
       System.out.println(account.getMoney() );
       
       double cash = account.getMoney();
       cash+=125;
       account.setMoney(cash);
       System.out.println(account.getMoney() );
    }
    
}
