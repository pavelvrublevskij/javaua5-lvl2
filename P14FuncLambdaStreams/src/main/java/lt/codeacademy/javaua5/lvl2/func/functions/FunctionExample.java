package lt.codeacademy.javaua5.lvl2.func.functions;

public class FunctionExample {

	public FunctionExample() {
		System.out.println(new IntTotal() {

			@Override
			public int calcTotal(int a, int b) {
				return a + b;
			}
		}.calcTotal(2, 5));
	}
}