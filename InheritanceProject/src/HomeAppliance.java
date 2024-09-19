
public class HomeAppliance {
    protected String brand;
    protected int price; // in rs
   protected  String color;

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

class WashingMachine extends HomeAppliance {
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

class SmartWashingMachine extends WashingMachine {
    boolean hasWifi; 
    boolean isEnergyEfficient; 

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
	public
    void displayDetails() {
        
        super.displayDetails();
        
        System.out.println("Has Wi-Fi: " + (hasWifi ? "Yes" : "No"));
        System.out.println("Energy Efficient: " + (isEnergyEfficient ? "Yes" : "No"));
    }

  
}


class Main {
    public static void main(String[] args) {
     
        SmartWashingMachine smartWashingMachine1 = new SmartWashingMachine("smartWash", 50000, "Black", 40, true, true);
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
    }
}
