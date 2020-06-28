package customer.regular;

import discount.IDiscount;

public class RegularFirstSlab implements IDiscount {
    Double startingRange=0.0;
    Double endingRange=0.0;
    Double discountPercent=0.0;
    public RegularFirstSlab(Double start, Double end, int percentage) {
        startingRange =start;
        endingRange =  end ;
        discountPercent = (percentage / 100.0);
    }

    @Override
    public boolean evaluate(Double bill) {
        return bill>0;
    }

    @Override
    public Double process(Double bill) throws Exception {
        return getDiscount(startingRange,bill,discountPercent);
    }


    @Override
    public boolean isTerminal(Double bill) throws Exception {
        return bill<=5000;
    }
}
