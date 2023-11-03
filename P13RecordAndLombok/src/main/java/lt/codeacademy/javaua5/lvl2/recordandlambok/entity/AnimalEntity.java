package lt.codeacademy.javaua5.lvl2.recordandlambok.entity;

// immutable data class
// what we can do with this class:
// * do sort
// * create object
// * assign via constructor data
// * get data using get...() methods
// * inherit class
// * implement interfaces
// * do overrides, do overloads
public class AnimalEntity {

	private final int age;
	private final String name;
	private final String number;

	public AnimalEntity(int age, String name, String number) {
		this.age = age;
		this.name = name;
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
}
