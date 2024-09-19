//interface
interface Light {
    void turnOn(); 
    void turnOff(); 
    void displayType(); 
}


class LEDLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("The LED light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("The LED light is now OFF.");
    }

    @Override
    public void displayType() {
        System.out.println("This is an LED light.");
    }
}

class IncandescentLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("The incandescent light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("The incandescent light is now OFF.");
    }

    @Override
    public void displayType() {
        System.out.println("This is an incandescent light.");
    }
}

// Main class to run the program
 class Main {
    public static void main(String[] args) {
        Light myLED = new LEDLight(); 
        Light myIncandescent = new IncandescentLight(); 
        myLED.displayType();        
        myLED.turnOn();         
        myLED.turnOff();          

        myIncandescent.displayType(); 
        myIncandescent.turnOn();      
        myIncandescent.turnOff();    
    }
}
