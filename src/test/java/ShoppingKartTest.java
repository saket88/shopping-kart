import customer.Customer;
import customer.CustomerType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ShoppingKartTest {

    @Test
    public void testRegularCustomerCheckoutFirstSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.REGULAR);
        double netPrice=shoppingKart.checkOut(5000.0,customer);

        assertThat(netPrice,is(5000.0));

    }

    @Test
    public void testRegularCustomerCheckoutSecondSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.REGULAR);
        double netPrice=shoppingKart.checkOut(10000.0,customer);

        assertThat(netPrice,is(9500.0));

    }

    @Test
    public void testRegularCustomerCheckoutThirdSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.REGULAR);
        double netPrice=shoppingKart.checkOut(15000.0,customer);

        assertThat(netPrice,is(13500.0));

    }



    @Test
    public void testPremiumCustomerCheckoutFirstSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.PREMIUM);
        double netPrice=shoppingKart.checkOut(4000.0,customer);

        assertThat(netPrice,is(3600.0));

    }
    @Test
    public void testPremiumCustomerCheckoutSecondSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.PREMIUM);
        double netPrice=shoppingKart.checkOut(8000.0,customer);

        assertThat(netPrice,is(7000.0));

    }
    @Test
    public void testPremiumCustomerCheckoutThirdSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.PREMIUM);
        double netPrice=shoppingKart.checkOut(12000.0,customer);

        assertThat(netPrice,is(10200.0));

    }

    @Test
    public void testPremiumCustomerCheckoutFourthSlab() throws Exception {
        ShoppingKart shoppingKart = new ShoppingKart();
        Customer customer = new Customer(CustomerType.PREMIUM);
        double netPrice=shoppingKart.checkOut(20000.0,customer);

        assertThat(netPrice,is(15800.0));

    }
}

