package lt.codeacademy.javaua5.lvl2.generics;

public class ClassGenericExample {

	private Box boxOfString = new Box();

	public void init() {
		boxOfString.setText("Tekstas");

		System.out.println(getBox().getText());
	}

	private Box getBox() {
		return boxOfString;
	}
}
