
public class Library {
     public static void main(String[] args) {
		System.out.println();
		Book.reading.read();
	}
}

class Book{
	static Students reading = new Students();
}

class Students{
	void read() {
		System.out.println("students reading book...");
	}
}
