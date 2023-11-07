package lt.codeacademy.javaua5.lvl2;

import java.util.Comparator;

import lt.codeacademy.javaua5.lvl2.stream.model.Employee;

public class EmployeeSurnameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.surname().compareTo(o2.surname());
	}
}
