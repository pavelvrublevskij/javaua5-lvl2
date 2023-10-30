package lt.codeacademy.javaua5.lvl2.generics.task1;

import java.util.Arrays;
import java.util.List;

import lt.codeacademy.javaua5.lvl2.generics.task1.model.Person;

public class ElementListBox<E> implements ListBox<E> {

	private List<E> list;

	@Override
	public void addElements(E[] values) {
		list.addAll(Arrays.asList(values));
	}

	@Override
	public void addElement(E value) {
		list.add(value);
	}

	@Override
	public List<E> getElements() {
		return list;
	}

	@Override
	public E getIndex(int index) {
		return list.get(index);
	}
}
