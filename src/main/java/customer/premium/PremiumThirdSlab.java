package customer.premium;

import discount.IDiscount;

public class PremiumThirdSlab implements IDiscount {
    Double startingRange=0.0;
    Double endingRange=0.0;
    Double discountPercent=0.0;

    public PremiumThirdSlab(Double start, Double end, int percentage) {
        startingRange =start;
        endingRange =  end ;
        discountPercent = (percentage / 100.0);
    }

    @Override
    public boolean evaluate(Double bill) {

        return bill>8000;
    }

    @Override
    public Double process(Double bill) throws Exception {
        double maximumLimit= getDiscount(startingRange,endingRange,discountPercent);
        double discount = getDiscount(startingRange,bill,discountPercent);
        return (maximumLimit < discount ) ? maximumLimit : discount;

    }

    @Override
    public boolean isTerminal(Double bill) throws Exception {
        return bill <=12000;
    }
}
