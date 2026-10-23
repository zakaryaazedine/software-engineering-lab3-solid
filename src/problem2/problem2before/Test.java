package problem2.problem2before;

public class Test{
    public static void main(String[] args){
        ShippingCalculator calculator = new ShippingCalculator();

        System.out.println("Standard (2 kg): " + calculator.cost("STANDARD", 2) + " MAD");
        System.out.println("Express (2 kg): " + calculator.cost("EXPRESS", 2) + " MAD");
        System.out.println("Drone (2 kg): " + calculator.cost("DRONE", 2) + " MAD");
        System.out.println("Pickup (2 kg): " + calculator.cost("PICKUP", 2) + " MAD");
        System.out.println("Pickup (4.99 kg): " + calculator.cost("PICKUP", 4.99) + " MAD");
        System.out.println("Pickup (5 kg): " + calculator.cost("PICKUP", 5) + " MAD");
        System.out.println("Pickup (5.01 kg): " + calculator.cost("PICKUP", 5.01) + " MAD");
    }
}
