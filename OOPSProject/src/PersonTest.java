
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        
//		Class	refToObj   allocator	constructor
		Person person1 	= 	new 		Person('F',"Asawari",20);
		Person person2 	= 	new 		Person('M',"Prakash",23);
		Person person3 	= 	new 		Person('F',"Mayuri",19);
		Person person4 	= 	new 		Person('M',"Avinash",22);
		Person person5 	= 	new 		Person('F',"Sonali",21);
		
		person1.think();
		person1.walking(500);
		person2.walking(150);
		person3.walking(250);
		person4.walking(300);
		person5.walking(350);
		
		float caloriesBurnt = person1.workout(90);
		System.out.println("\tCalories burnt : "+caloriesBurnt);
		
		int pagesRead = person1.bookReading();
		System.out.println("\tPerson read "+pagesRead+" PAGES...");
		person1.bookReading();
		person2.bookReading();
		person3.bookReading();
		person4.bookReading();
		person5.bookReading();
		
		float travels = person1.travel(10, 2);
		System.out.println("\tperson travel " +travels);
		person1.travel(20, 3);
		
	
      
        person.think();
       
    }
}


class Person
{
	
	    // private char gender;
		private String name;
		private int age;
		
		Person() {
			System.out.println("Person constructor....invoked....");
		}
		
		Person(char g, String n, int a) {
			System.out.println("Person(char,String,int) constructor....invoked....");
			//gender = g;
			name = n;
			age = a;
		}
		
	//1. function WITHOUT argument | WITHOUT return type
	
	//returnType				without arugment
	void 				think(    ) {
		System.out.println("1.Person is thinking....");
	}
	
	//use your imagination to make a similar function of category 1
	//MAKE IT HERE
	
	void sleep() {
		System.out.println("Person is sleeping...");
	}
	
	
	//2. function WITH argument | BUT WITHOUT return type
	void walking(int steps)
	{
		System.out.println("2.Person is walking "+steps+" STEPS...");
	}
	//use your imagination to make a similar function of category 2
	//MAKE IT HERE
	
	void study(String subject) {
	    System.out.println("Person is studying " + subject + "...");
	}
	
	//3. function WITH arguments | AND WITH return type [ int here ]
	float workout(int minutes)
	{
		System.out.println("3.Person doing workout for "+minutes+" MINUTES");
		return minutes*3.5f; // x calories burnt out
	}
	
	//use your imagination to make a similar function of category 3
	//MAKE IT HERE
	
	float travel(float speed, int time) {
	    return speed * time; // speed in km and timw in hrs
	}
		
	
	//4. function WITHOUT argument | BUT WITH return type
	int bookReading() {
		System.out.println("4.Person read the book .....");
		return 30; //number of pages read | or time took in mnts to read
	}
	
	//use your imagination to make a similar function of category 4
	//MAKE IT HERE
		
	int getAge() {
	    System.out.println("Person's age...");
	    return 30; 
	}

}