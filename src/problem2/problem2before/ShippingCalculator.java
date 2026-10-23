package problem2.problem2before;

public class ShippingCalculator{
    public double cost(String carrier, double weightKg){
        if (carrier.equals("STANDARD")) return 20 + 5 * weightKg;
        else if (carrier.equals("EXPRESS")) return 50 + 8 * weightKg;
        else if (carrier.equals("DRONE")){
            if (weightKg > 2) throw new IllegalArgumentException("Too heavy");
            return 80;
        } else if (carrier.equals("PICKUP")){
            if (weightKg < 5) return 0;
            return 10;
        }
        throw new IllegalArgumentException("Unknown carrier: " + carrier);
    }
}
