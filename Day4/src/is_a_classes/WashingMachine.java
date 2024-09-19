package is_a_classes;

import model.HomeAppliance;

public class WashingMachine extends HomeAppliance {
    private int drumCapacity; // in liters

   public  WashingMachine(String brand, int price, String color, int drumCapacity) {
        super(brand, price, color); 
        this.drumCapacity = drumCapacity;
    }

    public WashingMachine() {
        super(); 
        this.drumCapacity = 30; // Default capacity
    }

    public void startWash() {
        System.out.println("The wash cycle has started.");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " Rs");
        System.out.println("Color: " + color);
        System.out.println("Drum Capacity: " + drumCapacity + " liters");
    }
}
