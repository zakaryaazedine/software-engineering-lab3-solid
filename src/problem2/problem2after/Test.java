package problem2.problem2after;

import java.util.List;

public class Test{
    public static void main(String[] args){
        Parcel parcel = new Parcel(2);
        List<ShippingMethod> methods = List.of(
                new StandardShipping(),
                new ExpressShipping(),
                new DroneShipping(),
                new PickupShipping()
        );

        for (int i = 0; i < methods.size(); i++) System.out.printf("%s: %.2f MAD%n", methods.get(i).name(), parcel.shippingCost(methods.get(i)));
    }
}
