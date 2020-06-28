package discount;

public class DiscountRangeRate implements IDiscount {
    Double startingRange=0.0;
    Double endingRange=0.0;
    Double discountPercent=0.0;
    public DiscountRangeRate(Double start, Double end, int percentage) {
        startingRange =start;
        endingRange =  end ;
        discountPercent = (percentage / 100.0);
    }

    @Override
    public boolean evaluate(Double bill) {
        return bill>startingRange;
    }

    @Override
    public Double process(Double bill) throws Exception {
        double discount = getDiscount(startingRange,bill,discountPercent);
        double maximumDiscount = getDiscount(startingRange,endingRange,discountPercent);
        if (endingRange.equals(0.0))
            return discount;
        return (discount > maximumDiscount) ? maximumDiscount : discount;
    }


    @Override
    public boolean isTerminal(Double bill) throws Exception {
        return endingRange.equals(0.0) || bill <= endingRange;
    }
}
