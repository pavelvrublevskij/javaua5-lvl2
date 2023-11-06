package lt.codeacademy.javaua5.lvl2.func.functions;

import java.util.function.Consumer;

public class SumTotal implements IntTotal {

	@Override
	public int calcTotal(int a, int b) {
		return a + b;
	}
}
