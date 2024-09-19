// interface 
interface Appliance {
    void turnOn();
    void turnOff();
}

// Abstract class 
abstract class HomeAppliance implements Appliance {
    protected final String brand;
    protected final int price; // in rs
    protected final String color;

    // Static variable 
    private static int applianceCount;

    // Static block 
    static {
        applianceCount = 0;
        System.out.println("Home Appliance system initialized.");
    }

    public HomeAppliance(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        applianceCount++;
    }

    public HomeAppliance() {
        this.brand = "Samsung";
        this.price = 30000;
        this.color = "Gray";
        applianceCount++;
    }

    @Override
    public void turnOn() {
        System.out.println("The appliance is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("The appliance is now OFF.");
    }

    public static int getApplianceCount() {
        return applianceCount;
    }
}


class WashingMachine extends HomeAppliance {
    private final int drumCapacity; // in liters

    public WashingMachine(String brand, int price, String color, int drumCapacity) {
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

class SmartWashingMachine extends WashingMachine {
    private final boolean hasWifi; 
    private final boolean isEnergyEfficient; 

    public SmartWashingMachine(String brand, int price, String color, int drumCapacity, boolean hasWifi, boolean isEnergyEfficient) {
        super(brand, price, color, drumCapacity);
        this.hasWifi = hasWifi;
        this.isEnergyEfficient = isEnergyEfficient;
    }

    public SmartWashingMachine() {
        super();
        this.hasWifi = true; // Default value
        this.isEnergyEfficient = true; // Default value
    }

    public void connectToNetwork() {
        if (hasWifi) {
            System.out.println("Connecting to Wi-Fi network...");
        } else {
            System.out.println("This model does not support Wi-Fi connectivity.");
        }
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Wi-Fi: " + (hasWifi ? "Yes" : "No"));
        System.out.println("Energy Efficient: " + (isEnergyEfficient ? "Yes" : "No"));
    }
}

class Main {
    public static void main(String[] args) {
        SmartWashingMachine smartWashingMachine1 = new SmartWashingMachine("SmartWash", 50000, "Black", 40, true, true);
        smartWashingMachine1.turnOn();
        smartWashingMachine1.connectToNetwork();
        smartWashingMachine1.startWash();
        smartWashingMachine1.displayDetails();
        smartWashingMachine1.turnOff();

        SmartWashingMachine smartWashingMachine2 = new SmartWashingMachine();
        smartWashingMachine2.turnOn();
        smartWashingMachine2.connectToNetwork();
        smartWashingMachine2.startWash();
        smartWashingMachine2.displayDetails();
        smartWashingMachine2.turnOff();

        //total number of appliances
        System.out.println("Total appliances created: " + HomeAppliance.getApplianceCount());
    }
}
