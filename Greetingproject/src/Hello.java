
public class Hello {
 public static void main(String[] args) {
	System.out.println("Java is easy");
	//just a ref= actual obj
	Lion lionking = new Lion();
	Jungle.lionking.roar();
	System.out.println("hi");
}
}

class Jungle{ //system
	//static  Printstream     out
	static Lion lionking = new Lion();// as a king of the jungle resides here
}

class Lion{ //Pritnstream
	void roar() { // acitivity of lion
		System.out.println("Lion is roaring ..");
	}
}