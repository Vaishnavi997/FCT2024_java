package jungle;

import jungle.river.Frog;
import jungle.tree.Parrot;
import jungle.cave.Tiger;
import jungle.compound.FarmHouse;


public class WildTest {
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.jump();
		
		Parrot parrot = new Parrot();
		parrot.fly();
		
		FarmHouse farmhouse = new FarmHouse();
		farmhouse.relax();
	}

}
