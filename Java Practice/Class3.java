package aBC;

class Person {

	String name;
	int age;
	String email;

}

public class Class3 {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Bharath";
		person1.age = 25;
		person1.email = "abc@gmail.com";

		Person person2 = new Person();
		person2.name = "Kumar";
		person2.age = 20;
		person2.email = "xyz@gmail.com";

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.email);

		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.email);
	}

}