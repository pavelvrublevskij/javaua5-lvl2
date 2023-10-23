package lt.codeacademy.git.branch.test;

import java.util.Arrays;

import lt.codeacademy.git.branch.test.pojo.Person;

import static lt.codeacademy.git.branch.test.utils.ConsolePrintUtil.myPrintfln;
import static lt.codeacademy.git.branch.test.utils.ConsolePrintUtil.print;
import static lt.codeacademy.git.branch.test.utils.ConsolePrintUtil.printLine;

/**
 * Hello world!
 */
public class P6BasicKartojimas {

	public static void main(String[] args) {
		final PersonManager manager = new PersonManager();
		print("Hello Person Management!");
		printLine();

		manager.createPerson(new Person(1, "Jonas", "Jonaitis"));
		manager.createPerson(new Person(2, "Petras", "Petraitis"));

		/*for (Person p : manager.getPersons()) {
			if (p != null) {
				myPrintfln("Person (id, name): %d, %s", p.getId(), p.getName());
			}
		}*/

		manager.getPersons()
				.forEach(p -> {  // lambda expression
					if (p != null) {
						myPrintfln("Person (id, name): %d, %s", p.getId(), p.getName());
					}
				});

		printLine();
	}
}
