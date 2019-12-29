package oop.polymorphism;

public class ModernLandCalculator extends LandCalculator {
    public int areaOfLand(int a, int b, int c, int d) {
        int total = a + b + c + d - 1;
        return total;
    }
}
