package lt.codeacademy.javaua5.lvl2;

import java.util.StringJoiner;

public class Person {
	private String name;
	private String surname;
	private int age;

	public Person name(String name) {
		this.name = name;

		return this;
	}

	public Person age(int age) {
		this.age = age;

		return this;
	}

	public Person surname(String surname) {
		this.surname = surname;

		return this;
	}

	public static Person builder() {
		return new Person();
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("surname='" + surname + "'")
				.add("age=" + age)
				.toString();
	}
}
