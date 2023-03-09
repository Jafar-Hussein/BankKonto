public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("1234567890", "John Doe"); // Skapa en kund med kundnummer och namn
        Account account = new Account("1234567890", 1000, customer); // Skapa ett konto med kontonummer, saldo och kund
        CreditCard creditCard = new CreditCard("1234567890", 1000, customer, 10000); // Skapa ett kreditkort med kontonummer, saldo, kund och kreditgräns

        System.out.println("Bankkonto");
        account.deposit(1000); // Sätt in 1000 kr på kontot
        account.withdraw(500); // Ta ut 500 kr från kontot
        System.out.println(account.getBalance()); // Skriv ut saldo

        System.out.println("Kreditkort");
        creditCard.deposit(1000);
        creditCard.withdraw(1500);
        System.out.println(creditCard.getBalance());
    }
}
