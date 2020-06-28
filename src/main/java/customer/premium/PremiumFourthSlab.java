package customer.premium;

import discount.IDiscount;

public class PremiumFourthSlab implements IDiscount {
    Double startingRange=0.0;
    Double endingRange=0.0;
    Double discountPercent=0.0;

    public PremiumFourthSlab(Double start, Double end,int percentage) {
        startingRange =start;
        endingRange=end;
        discountPercent = (percentage / 100.0);
    }

    @Override
    public boolean evaluate(Double bill) {

        return bill > 12000;
    }

    @Override
    public Double process(Double bill) throws Exception {
        return getDiscount(startingRange,bill,discountPercent);

    }

    @Override
    public boolean isTerminal(Double bill) throws Exception {
        return true;
    }
}
