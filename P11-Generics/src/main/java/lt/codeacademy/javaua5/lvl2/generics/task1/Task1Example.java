package lt.codeacademy.javaua5.lvl2.generics.task1;

import lt.codeacademy.javaua5.lvl2.generics.task1.ElementListBox;
import lt.codeacademy.javaua5.lvl2.generics.task1.ListBox;
import lt.codeacademy.javaua5.lvl2.generics.task1.model.Person;

public class Task1Example {

	public void init() {
		saveAndGetPersons();
		saveAndGetStrings();
	}

	private void saveAndGetStrings() {
		final String[] texts = new String[2];
		texts[0] = "Tekstas 1";
		texts[1] = "Tekstas 2";

		final ListBox<String> stringListBox = new ElementListBox<>();
		stringListBox.addElements(texts);
		stringListBox.getElements().forEach(text -> System.out.println(text));
	}

	private static void saveAndGetPersons() {
		final Person[] persons = new Person[2];
		persons[0] = new Person("Vardenis", "Pavardenis");
		persons[1] = new Person("Petras", "Pavardenis");

		final ListBox<Person> personListBox = new ElementListBox<>();
		personListBox.addElements(persons);
		personListBox.getElements().forEach(p -> System.out.println(p));
	}

}
