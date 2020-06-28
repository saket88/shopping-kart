package customer;

import discount.DiscountRangeRate;
import discount.GenerateDiscount;

public enum CustomerType implements ICustomerTypes {


    REGULAR {
        public Double grossBill(Double bill) throws Exception {
            GenerateDiscount generateDiscount = new GenerateDiscount();
            generateDiscount.addRanges(new DiscountRangeRate(0.0,5000.0,0));
            generateDiscount.addRanges(new DiscountRangeRate(5000.0,10000.0,10));
            generateDiscount.addRanges(new DiscountRangeRate(10000.0,0.0,20));
            Double discount = generateDiscount.execute(bill);
            return bill - discount;
        }
    },
    PREMIUM {
        public Double grossBill(Double bill) throws Exception {
            GenerateDiscount generateDiscount = new GenerateDiscount();
            generateDiscount.addRanges(new DiscountRangeRate(0.0,4000.0,10));
            generateDiscount.addRanges(new DiscountRangeRate(4000.0,8000.0,15));
            generateDiscount.addRanges(new DiscountRangeRate(8000.0,12000.0,20));
            generateDiscount.addRanges(new DiscountRangeRate(12000.0,0.0,30));
            Double discount = generateDiscount.execute(bill);
            return bill - discount;
        }
    }
}
