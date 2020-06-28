package customer.regular;

import discount.IDiscount;

public class RegularSecondSlab implements IDiscount {

    Double startingRange=0.0;
    Double endingRange=0.0;
    Double discountPercent=0.0;


    public RegularSecondSlab(Double start, Double end, int percentage) {
        startingRange = start;
        endingRange = end;
        discountPercent= percentage / 100.0;
    }



    @Override
    public boolean evaluate(Double bill) {
        return bill>5000;
    }

    @Override
    public Double process(Double bill) throws Exception {
        double discount = getDiscount(startingRange,bill,discountPercent);
        double maximumDiscount = getDiscount(startingRange,endingRange,discountPercent);
        return (discount > maximumDiscount) ? maximumDiscount : discount;
    }

    @Override
    public boolean isTerminal(Double bill) throws Exception {
        return bill<=10000;
    }
}
