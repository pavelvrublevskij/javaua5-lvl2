package lt.codeacademy.lv2.git;

public class P1GitApp {

	public static void main(String[] args) {
		primitiveDataTypes();
		ifExample();
	}

	private static void ifExample() {
		int result = 0;

		if (5 > 3) {
			result = 5;
		} else {
			result = 3;
		}
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
