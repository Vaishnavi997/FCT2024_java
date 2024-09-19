package utilzationLayer;

import is_a_classes.SmartWashingMachine;

public class HomeAppliancesTest {
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
