package aBC;

class Men {
	private String name;
	private int age;
	String profession;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setProf(String profession) {
		this.profession = profession;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}

public class SetterAndThis {

	public static void main(String[] args) {
		Men man1 = new Men();
		Men man2 = new Men();

		man1.setName("Ajay");
		man1.setAge(24);
		man1.setProf("Engineer");

		man2.setName("Kumar");
		man2.setAge(19);

		String name = man1.getName();
		System.out.println(name);

		name = man2.getName();
		int age = man2.getAge();
		System.out.println(name);
		System.out.println(age);
	}

}
