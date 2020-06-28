package customer;

public class Customer {
    private final CustomerType customerType;

     public CustomerType getCustomerType() {
        return customerType;
    }

     public Customer(CustomerType customerType) {
        this.customerType =  customerType;
    }
}
