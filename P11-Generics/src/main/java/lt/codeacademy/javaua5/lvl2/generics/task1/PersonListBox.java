package lt.codeacademy.javaua5.lvl2.generics.task1;

import java.util.Arrays;
import java.util.List;

import lt.codeacademy.javaua5.lvl2.generics.task1.model.Person;

public class PersonListBox implements ListBox<Person> {

	private List<Person> list;

	@Override
	public void addElements(Person[] values) {
		list.addAll(Arrays.asList(values));
	}

	@Override
	public void addElement(Person value) {
		list.add(value);
	}

	@Override
	public List<Person> getElements() {
		return list;
	}
}
