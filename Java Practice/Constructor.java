package aBC;

class School {
	private String name;
	private int year;

	public School() {
		
		this("Viswam", 1992);
		System.out.println("School details have been repoted");

	}

	public School(String name, int year) {
		this.name = name;
		this.year = year;
		System.out.println(name + " school is established in the year " + year);
	}
}

public class Constructor {

	public static void main(String[] args) {
		new School();
		new School("St.Johns", 1973);
	}

}
