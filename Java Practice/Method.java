package aBC;

class Perso {

	String name;
	int age;
	String email;

	void contact() {
		while (name != "Bharath") {
			System.out.println("Hi I'm " + name + " and you can contact me on " + email);
			break;
		}
	}
	
	void greeting() {
		if (name == "Kumar") {
			System.out.println("Hi you've reached to " + name + "'s");
		}
		else {
			System.out.println(name + " isn't available at the moment");
		}
		
	}
}

public class Method {

	public static void main(String[] args) {
		Perso person1 = new Perso();
		person1.name = "Bharath";
		person1.age = 25;
		person1.email = "abc@gmail.com";

		Perso person2 = new Perso();
		person2.name = "Kumar";
		person2.age = 20;
		person2.email = "xyz@gmail.com";

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.email);

		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.email);

		person1.contact();
		person2.contact();
		
		person1.greeting();
		person2.greeting();

	}

 	}
