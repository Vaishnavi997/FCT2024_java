class Appliance {
    String brand;
    int price; // in rs
    String color;

    void turnOn() {
        System.out.println("The appliance is now ON.");
    }

    void turnOff() {
        System.out.println("The appliance is now OFF.");
    }
}

class Refrigerator extends Appliance { // isA
    Compressor compressor = new Compressor(); // hasA
    int capacityInLiters;
    int currentTemperature;

    void store(FoodItem foodItem) { // usesA
        if (foodItem == null) {
            System.out.println("Error: No food item provided.");
           
        }
        System.out.println("Storing " + foodItem.name + " in the refrigerator.");
    }

    void setTemperature(int temperature) { 
        currentTemperature = temperature;
        System.out.println("Refrigerator temperature set to " + temperature + "°C.");
    }

    void showDetails() {
        System.out.println("Refrigerator Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " rs");
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacityInLiters + " liters");
        System.out.println("Current Temperature: " + currentTemperature + "°C");
        System.out.println("Compressor Power: " + compressor.powerInWatts + " watts");
    }
}

class Compressor {
    int powerInWatts;

    void start() {
        System.out.println("The compressor starts.");
    }

    void stop() {
        System.out.println("The compressor stops.");
    }
}

class FoodItem {
    String name;
    String type;
    int quantity; // Quantity in units
    double weight; // Weight in kilograms

    void showDetails() {
        System.out.println("Food Item Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity + " units");
        System.out.println("Weight: " + weight + " kg");
    }
}

class Test {
    public static void main(String[] args) {
      
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.brand = "Samsung";
        refrigerator.price = 30000; //  price in rs
        refrigerator.color = "Silver";
        refrigerator.capacityInLiters = 300;
        refrigerator.compressor.powerInWatts = 150; //  power in watts

  
        FoodItem foodItem = new FoodItem();
        foodItem.name = "Milk";
        foodItem.type = "Dairy";
        foodItem.quantity = 1;
        foodItem.weight = 2.0; // Weight in kilograms

        refrigerator.turnOn();
        refrigerator.setTemperature(4);
        refrigerator.store(foodItem);
        refrigerator.showDetails(); 
        foodItem.showDetails(); 
        refrigerator.turnOff();
    }
}
