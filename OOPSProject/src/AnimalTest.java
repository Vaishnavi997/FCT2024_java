
public class AnimalTest {

	 public static void main(String[] args) {
	        Animal animal = new Animal();

	        animal.makeSound();
	        animal.makeSound("bark");
	        animal.makeSound("meow", 5);
	       
	    }
	
}
class Animal {
    public void makeSound() {
        System.out.println("animal sound");
    }

    public void makeSound(String sound) {
        System.out.println("The animal makes a " + sound + " sound");
    }

    public void makeSound(String sound, int volume) {
        System.out.println("The animal makes a " + sound + " at volume level " + volume);
    }
    
   
}


