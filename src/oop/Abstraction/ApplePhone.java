package oop.Abstraction;

public  class ApplePhone extends SmartPhone implements Phone  {

    public void phoneColor() {
        System.out.println("The phone color is black");
    }
    public void phoneModel() {
        System.out.println("The model of this phone is 11 Pro");

    }

    public void phoneOS() {
        System.out.println("The name of the OS verison is IOS 11.02");
    }
    public String phoneCase(){
        String phoneCase = "iphoneCase";
        return phoneCase;
    }
}
