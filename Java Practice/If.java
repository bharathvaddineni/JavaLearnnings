package aBC;

public class If {

	public static void main(String[] args) {

		int i = 0;

		while (i++ < 5) {
			System.out.println("Looping: " + i);

			if (i == 5) {
				break;
			}

			System.out.println("Running");
		}

	}

}
