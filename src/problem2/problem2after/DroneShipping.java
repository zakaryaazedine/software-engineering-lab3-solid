package problem2.problem2after;

public class DroneShipping implements ShippingMethod{
    @Override
    public String name(){
        return "Drone";
    }

    @Override
    public double cost(double weightKg){
        if (weightKg > 2) throw new IllegalArgumentException("Too heavy");
        return 80;
    }
}
