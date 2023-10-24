package lt.codeacademy.javaua5.lvl2.json.model;

import java.util.StringJoiner;

public class Person {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("age=" + age)
				.toString();
	}
}
