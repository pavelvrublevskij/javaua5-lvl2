package lt.codeacademy.lv2.git;

public class StudentDto {

	private final String name;
	private final String surname;

	public StudentDto(String name, String surname) {
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
