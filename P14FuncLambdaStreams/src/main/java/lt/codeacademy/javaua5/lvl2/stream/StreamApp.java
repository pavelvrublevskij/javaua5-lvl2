package lt.codeacademy.javaua5.lvl2.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

	public static void main(String[] args) {
		final List<String> texts = List.of("Labas", "namas", "java", "php", "c++", "academy");

		texts.stream()
				.filter(text -> text.contains("a"))
				.filter(text -> text.contains("s"))
				.forEach(text -> System.out.println(text));
	}
}
