import customer.Customer;

class ShoppingKart {
     double checkOut(Double bill, Customer customer) throws Exception {
        return customer.getCustomerType().grossBill(bill);
    }
}
