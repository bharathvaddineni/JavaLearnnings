package aBC;

public class ArrayOfStrings {

	public static void main(String[] args) {
		
		String[] words = new String[3];

		words[0] = "I'm";
		words[1] = "learining";
		words[2] = "Java";

		
		System.out.println(words[2]);
		
		String[] fruits = { "apple", "banana", "pear", "kiwi" };
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}	
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		texts[0] = "one";
		System.out.println(texts[0]);

	}

}
