package discount;

public interface IDiscount {

    boolean evaluate(Double bill);

    Double process(Double bill) throws Exception;

    boolean isTerminal(Double bill) throws Exception;

    default double getDiscount(Double a, Double b, Double percent) {
        return (b - a)*percent;
    }
}
