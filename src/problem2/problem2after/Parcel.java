package problem2.problem2after;

public class Parcel{
    private final double weightKg;

    public Parcel(double weightKg){
        this.weightKg = weightKg;
    }

    public double shippingCost(ShippingMethod method){
        return method.cost(weightKg);
    }
}
