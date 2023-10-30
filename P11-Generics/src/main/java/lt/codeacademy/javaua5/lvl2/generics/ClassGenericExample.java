package lt.codeacademy.javaua5.lvl2.generics;

public class ClassGenericExample  {

	public void init() {
		final Box<String> box = new Box<>();
		box.setObject("Tekstas");
		System.out.println(box.getObject());

		final Box<Integer> boxInt = new Box<>();
		boxInt.setObject(10);
		int value = boxInt.getObject();
		System.out.println(value);

		box.setObject("Labas");
		String value2 = box.getObject();  // cia gauname runtime exception
		System.out.println(value2);
	}
}
