package lt.codeacademy.javaua5.lvl2.stream;

import java.math.BigDecimal;
import java.util.List;

import lt.codeacademy.javaua5.lvl2.stream.model.Employee;

import static java.lang.System.*;

public class Task3 {

	private static final List<Employee> EMPLOYEES = List.of(
			new Employee("Jonas", "Jonaitis", BigDecimal.valueOf(1000), 1, "Java Developer"),
			new Employee("Petras", "Petraitis", BigDecimal.valueOf(2000), 2, "Developer"),
			new Employee("Antanas", "Antanaitis", BigDecimal.valueOf(3000), 3, "FE Developer"),
			new Employee("Sona", "Sonaite", BigDecimal.valueOf(4000), 4, "FE Developer"),
			new Employee("Maryte", "Maryte", BigDecimal.valueOf(5000), 5, "Developer"),
			new Employee("Kazys", "Kazaitis", BigDecimal.valueOf(6000), 6, "FE Developer"),
			new Employee("Kestas", "Kestaitis", BigDecimal.valueOf(7000), 7, "Developer"),
			new Employee("Jonas", "Jonaitis", BigDecimal.valueOf(8000), 8, "Java Developer"),
			new Employee("Petras", "Petraitis", BigDecimal.valueOf(9000), 9, "Developer"),
			new Employee("Antanas", "Antanaitis", BigDecimal.valueOf(10000), 10, "Java Developer"),
			new Employee("Ona", "Onaite", BigDecimal.valueOf(11000), 11, "Developer"),
			new Employee("Maryte", "Maryte", BigDecimal.valueOf(12000), 12, "FE Developer"),
			new Employee("Kazys", "Kazaitis", BigDecimal.valueOf(13000), 13, "Manager"),
			new Employee("Kestas", "Kestaitis", BigDecimal.valueOf(14000), 14, "Java Developer"),
			new Employee("Jonas", "Jonaitis", BigDecimal.valueOf(15000), 15, "Developer"),
			new Employee("Petras", "Petraitis", BigDecimal.valueOf(16000), 16, "Developer"),
			new Employee("Antanas", "Antanaitis", BigDecimal.valueOf(17000), 17, "Java Developer"),
			new Employee("Ona", "Onaite", BigDecimal.valueOf(18000), 18, "Developer"),
			new Employee("Maryte", "Maryte", BigDecimal.valueOf(19000), 19, "FE Developer"),
			new Employee("Kazys", "Kazaitis", BigDecimal.valueOf(20000), 20, "Manager"),
			new Employee("Kestas", "Kestaitis", BigDecimal.valueOf(21000), 21, "Java Developer"),
			new Employee("Jonas", "Jonaitis", BigDecimal.valueOf(22000), 22, "FE Developer")
	);

	public Task3() {
/*		EMPLOYEES.stream()
				.filter(employee -> employee.workExperience() > 3)
				.forEach(out::println);

		out.println("=====================================");

		EMPLOYEES.stream()
				.filter(employee -> employee.name().startsWith("A") || employee.name().startsWith("S"))
				.forEach(out::println);

		out.println("=====================================");

		EMPLOYEES.stream()
				.filter(employee -> employee.role().equals("Java Developer"))
				.forEach(out::println);*/

		out.println("=====================================");

		double feDeveloperTotalSalarySum = 0;

		feDeveloperTotalSalarySum = EMPLOYEES.stream()
				.filter(employee -> employee.role().contains("FE"))
				.mapToDouble(employee -> employee.salary().doubleValue())
				.sum();

		out.println("FE Developers total salary sum: " + feDeveloperTotalSalarySum);

		out.println("=====================================");

		feDeveloperTotalSalarySum = EMPLOYEES.stream()
				.filter(employee -> employee.role().contains("FE"))
				.map(employee -> employee.salary().doubleValue())
				.reduce(0d, (total, value) -> total + value, Double::sum);

		out.println("FE Developers total salary sum: " + feDeveloperTotalSalarySum);
	}
}
