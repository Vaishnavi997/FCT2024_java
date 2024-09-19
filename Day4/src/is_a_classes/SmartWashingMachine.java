package is_a_classes;

public class SmartWashingMachine extends WashingMachine {
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


