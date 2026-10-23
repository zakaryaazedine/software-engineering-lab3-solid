package problem2.problem2after;

public class ExpressShipping implements ShippingMethod{
    @Override
    public String name(){
        return "Express";
    }

    @Override
    public double cost(double weightKg){
        return 50 + 8 * weightKg;
    }
}
