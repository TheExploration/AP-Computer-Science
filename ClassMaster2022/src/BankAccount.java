public class BankAccount {
    
    private int accountNumber;
    private double money;
    
    public BankAccount(int accountNumber, double money) {
        this.accountNumber=accountNumber;
        this.money=money;
    }
    
    public int getAccountNumber() {
        return(accountNumber);
    }
    
    public double getMoney() {
        return(money);
    }
    
    public void setMoney(double amount) {
        if (amount>=0)
            money=amount;
        else 
            System.out.println("cannot set below zero");
    }
    
    public void addMoney(double amount) {
        if (amount>0)
            money+=amount;
        else
            System.out.println("can only add positive amount");
    }
    
    public void takeOutMoney(double amount) {
        if (amount<=money)
            money-=amount;
        else
            System.out.println("Cannot take out more than you have!");
    }
    
    
}
