package discount;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GenerateDiscount {
    private List<IDiscount> billCalculators = new LinkedList<>();

    public void addRanges(IDiscount handler) {
        billCalculators.add(handler);
    }

    public Double execute(Double bill) throws Exception {

        double discount = 0.0;
        for (IDiscount calculator : billCalculators) {
            if (calculator != null && calculator.evaluate(bill)) {
                discount += calculator.process(bill);
            }

            if (Objects.requireNonNull(calculator).isTerminal(bill))
                break;
        }
        return discount;
    }
}
