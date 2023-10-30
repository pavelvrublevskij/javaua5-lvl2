package lt.codeacademy.javaua5.lvl2.generics;

public class ClassGenericExample {

	private Box box = new Box();

	public void init() {
		box.setObject("Tekstas");
		System.out.println(getBox().getObject());

		box.setObject(10);
		int value = (int) box.getObject();
		System.out.println(value);

		box.setObject("Labas");
		int value2 = (int) box.getObject();  // cia gauname runtime exception
		System.out.println(value2);
	}

	private Box getBox() {
		return box;
	}
}
