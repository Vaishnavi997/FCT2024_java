package model;

public class HomeAppliance {
    protected String brand;
    protected int price; // in rs
   protected String color;

    public HomeAppliance(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public HomeAppliance() {
        this.brand = "Samsung";
        this.price = 30000;
        this.color = "Gray";
    }

   public void turnOn() {
        System.out.println("The appliance is now ON.");
    }

    public void turnOff() {
        System.out.println("The appliance is now OFF.");
    }
}

