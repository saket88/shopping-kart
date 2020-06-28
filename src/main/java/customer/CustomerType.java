package customer;

import discount.GenerateDiscount;
import customer.premium.PremiumFirstSlab;
import customer.premium.PremiumFourthSlab;
import customer.premium.PremiumSecondSlab;
import customer.premium.PremiumThirdSlab;
import customer.regular.RegularFirstSlab;
import customer.regular.RegularSecondSlab;
import customer.regular.RegularThirdSlab;

public enum CustomerType implements ICustomerTypes {


    REGULAR {
        public Double grossBill(Double bill) throws Exception {
            GenerateDiscount generateDiscount = new GenerateDiscount();
            generateDiscount.addCalculator(new RegularFirstSlab(0.0,5000.0,0));
            generateDiscount.addCalculator(new RegularSecondSlab(5000.0,10000.0,10));
            generateDiscount.addCalculator(new RegularThirdSlab(10000.0,20));
            Double discount = generateDiscount.execute(bill);
            return bill - discount;
        }
    },
    PREMIUM {
        public Double grossBill(Double bill) throws Exception {
            GenerateDiscount generateDiscount = new GenerateDiscount();
            generateDiscount.addCalculator(new PremiumFirstSlab(0.0,4000.0,10));
            generateDiscount.addCalculator(new PremiumSecondSlab(4000.0,8000.0,15));
            generateDiscount.addCalculator(new PremiumThirdSlab(8000.0,12000.0,20));
            generateDiscount.addCalculator(new PremiumFourthSlab(12000.0,0.0,30));
            Double discount = generateDiscount.execute(bill);
            return bill - discount;
        }
    }
}
