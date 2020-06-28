package customer.regular;

import discount.IDiscount;

public class RegularThirdSlab implements IDiscount {
    Double startingRange=0.0;
    Double discountPercent=0.0;

    public RegularThirdSlab(Double start, int percentage) {
        startingRange = start;
        discountPercent= percentage/100.0;
    }

    @Override
    public boolean evaluate(Double bill) {
        return bill >10000;
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
