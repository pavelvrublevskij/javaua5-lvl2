package lt.codeacademy.javaua5.lvl2.generics.task1.model;

public class Person {

	private final String name;
	private final String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
}
