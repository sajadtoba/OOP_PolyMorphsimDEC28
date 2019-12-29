package oop.polymorphism;

public class TestLandCalculator {
    public static void main(String[] args) {
        LandCalculator call = new LandCalculator();
        System.out.println(call.areaOfLand(10,15));
        System.out.println(call.areaOfLand(10,15, "PNT"));
        System.out.println(call.areaOfLand(10,15,20,25));
        ModernLandCalculator mlc = new ModernLandCalculator();
        System.out.println(mlc.areaOfLand(10,15,20,25));
    }
}
