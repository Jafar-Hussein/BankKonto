public class CreditCard extends Account{
    protected double creditLimit;
    public CreditCard(String accountNumber, double balance, Customer customer, double creditLimit) {
        super(accountNumber, balance, customer);
        this.creditLimit = creditLimit;
    }
 @Override
    public void withdraw(double balance){
        if (this.getBalance() -balance < - creditLimit){
            System.out.println("Not enough money on account");
        }else {
            super.withdraw(balance);
        }
 }

}
