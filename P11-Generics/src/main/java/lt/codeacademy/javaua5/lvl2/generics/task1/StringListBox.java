package lt.codeacademy.javaua5.lvl2.generics.task1;

import java.util.Arrays;
import java.util.List;

public class StringListBox implements ListBox<String> {

	private List<String> list;

	@Override
	public void addElements(String[] values) {
		list.addAll(Arrays.asList(values));
	}

	@Override
	public void addElement(String value) {
		list.add(value);
	}

	@Override
	public List<String> getElements() {
		return list;
	}
}
