package oop.polymorphism;

public class LandCalculator {
    // we need to create a Parameterized Reurn Type Method
    // AccessModifier ReturnType MethodName(ParatermizedValue)
    // During the implement we need to create an Function

    public int areaOfLand(int a, int b) {
        // Create Function
        // return Type and Function Name
        int total = a + b;
        return total;
    } // the parameterized Return Type Method is implemented
    // Copy and paste the same method
    public int areaOfLand(int a, int b, int c, int d) {
        int total = a + b + c + d ;
        return total;
    }
    public int areaOfLand(int a, int b, int c, String LandName){
        int total = a + b;
        return total;
    }


    public int areaOfLand(int a, int b, String LandName){
        int total = a + b;
        System.out.println(LandName+ "is the office space");
        return total;
    }
}
