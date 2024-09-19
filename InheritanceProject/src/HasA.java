public class HasA {
    
    public static void main(String[] args) {
        WaterPump pump = new WaterPump(50); // 50 liters per minute
        WashingMachine1 washingMachine = new WashingMachine1("Samsung", 30000, "Gray", pump);

        washingMachine.startWash();
        washingMachine.displayDetails();
    }
}

class WaterPump {
    int capacity; 

    WaterPump(int capacity) {
        this.capacity = capacity;
    }

    void pumpWater() {
        System.out.println("Pumping water with capacity: " + capacity + " liters per minute.");
    }

    int getCapacity() {
        return capacity;
    }
}

class WashingMachine1 {
    String brand;
    int price; // in rs
    String color;
    WaterPump waterPump; // "has-a" relationship

    public WashingMachine1(String brand, int price, String color, WaterPump waterPump) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.waterPump = waterPump;
    }

    void startWash() {
        System.out.println("The wash cycle has started.");
        waterPump.pumpWater();
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " Rs");
        System.out.println("Color: " + color);
        System.out.println("Water Pump Capacity: " + waterPump.getCapacity() + " liters per minute");
    }
}
