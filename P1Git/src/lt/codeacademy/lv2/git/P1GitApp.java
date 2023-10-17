package lt.codeacademy.lv2.git;

public class P1GitApp {

	public static void main(String[] args) {
		primitiveDataTypes();
		ifExample();
	}

	private static void ifExample() {
		//jei darbo diena - dirbame, jei savaitgalis - ilsemes
		final int dayAsValue = 2;
		if (dayAsValue >= 1 && dayAsValue <= 5) {
			doWork();
		} else {
			doToRest();
		}
	}

	private static void doToRest() {
		System.out.println("I am resting!");
	}

	private static void doWork() {
		System.out.println("I am working!");
	}

	private static void primitiveDataTypes() {
		int a = 5;
		boolean b = true; // true or false
		float c = 5.5f;
		double d = 5.5;

		char e = 'a'; // ASCII table
		// or
		char eDigit = 56; // 56 = 8

		byte f = 127; // from -128 to 127
		long g = 1234567890; //from -2^63 to 2^63-1
		short h = 32767; // from -32768 to 32767

		var digit = 5; // int
		var text = "Hello"; // String
	}

}
