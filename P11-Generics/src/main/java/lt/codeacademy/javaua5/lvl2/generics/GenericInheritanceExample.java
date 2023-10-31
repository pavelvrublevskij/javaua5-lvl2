package lt.codeacademy.javaua5.lvl2.generics;

import java.math.BigDecimal;

public class GenericInheritanceExample {

	public void init() {
		Number value1 = 2;
		Number value2 = new BigDecimal(4.5);

		add(value1);
		add(value2);
	}

	private <T extends Number> void add(T number) {
		System.out.println(number.doubleValue() + 5);
	}

}
