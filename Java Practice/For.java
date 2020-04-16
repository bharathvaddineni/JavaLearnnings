package aBC;

public class For {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {

			System.out.printf("17 * %d = %d\n", i, 17 * i);
		}

		for (int k = 1; k < 3; k++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(k + "*" + j + "=" + k * j);
			}
			System.out.println();
		}
	}
}
