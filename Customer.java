public class Customer {
    String customerNumber;
    String name;

    public Customer(String customerNumber, String name) {
       this.customerNumber = customerNumber;
       this.name = name;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }
    public String getName(){
        return name;
    }
}
