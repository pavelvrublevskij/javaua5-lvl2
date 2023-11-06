package lt.codeacademy.javaua5.lvl2.func.functions;

import java.util.function.IntBinaryOperator;

public class FunctionExample {

	public FunctionExample() {
/*
		System.out.println(new IntTotal() {

			@Override
			public int calcTotal(int a, int b) {
				return a + b;
			}
		}.calcTotal(2, 5));
*/

		final IntTotal myFirstLambdaFunction = Integer::sum;
		final IntTotal myFirstLambdaFunction2 = (a, b) -> a + b * 2;
		System.out.println(myFirstLambdaFunction2.calcTotal(2, 5));

		final IntBinaryOperator myBiFunc = (a, b) -> a + b;
		System.out.println(myBiFunc.applyAsInt(2, 5));
	}
}
