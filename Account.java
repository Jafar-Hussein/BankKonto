public class Account {
    protected String accountNumber;
    protected  double balance;
    protected Customer customer;
    public Account(String accountNumber, double balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double balance){
        if (balance<0){
            System.out.println("Can't deposit a negative number");
        }else {
            this.balance += balance;
        }
    }
    public void withdraw(double balance){
        if (this.balance - balance<0){
            System.out.println("Not enough money");
        }else {
            this.balance -= balance;
        }
    }
}
