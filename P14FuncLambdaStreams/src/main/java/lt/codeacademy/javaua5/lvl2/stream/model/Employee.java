package lt.codeacademy.javaua5.lvl2.stream.model;

import java.math.BigDecimal;

public record Employee(String name, String surname, BigDecimal salary, int workExperience, String role) implements Comparable<Employee> {

	@Override
	public int compareTo(Employee o) {
		return this.surname.compareTo(o.surname);  // ascending sort
	}
}
