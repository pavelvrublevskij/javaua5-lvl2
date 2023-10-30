package lt.codeacademy.javaua5.lvl2.generics;

public class ClassGenericExample {

	private Box box = new Box();

	public void init() {
		box.setObject("Tekstas");
		System.out.println(getBox().getObject());

		box.setObject(10);
		System.out.println(getBox().getObject());
	}

	private Box getBox() {
		return box;
	}
}
