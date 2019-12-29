package oop.Abstraction;

public class TestPhone {
    public static void main(String[] args) {

        ApplePhone test = new ApplePhone();
        test.phoneCase();
        test.phoneColor();
        test.phoneModel();
        test.phoneOS();
        test.phoneSize();
        System.out.println(test.phoneCase());
    }
}
