package lt.codeacademy.javaua5.lvl2.generics;

import java.util.LinkedList;
import java.util.List;

import lt.codeacademy.javaua5.lvl2.generics.task1.model.Person;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
//		new ClassGenericExample().init();
//		new Task1Example().init();


		List<Integer> result = getEverySecondValueList(List.of(1, 2, 3, 4, 5, 6, 7, 8));
		result.forEach(r -> System.out.println(r));

		List<Float> result2 = getEverySecondValueList(List.of(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f));
		result2.forEach(r -> System.out.println(r));

		List<String> result3 = getEverySecondValueList(List.of("a", "b", "c", "d"));
		result3.forEach(r -> System.out.println(r));
	}

	private static <T> List<T> getEverySecondValueList(List<T> values) {
		final List<T> newList = new LinkedList<>();
		int step = 0;
		for (T value: values) {
			if (step % 2 == 0) {
				newList.add(value);
			}
			step++;
		}

		return newList;
	}
}
