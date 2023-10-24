package lt.codeacademy.javaua5.lvl2;

import lt.codeacademy.javaua5.lvl2.pojo.Person;

import static lt.codeacademy.javaua5.lvl2.utils.ConsolePrintUtil.myPrintfln;
import static lt.codeacademy.javaua5.lvl2.utils.ConsolePrintUtil.print;
import static lt.codeacademy.javaua5.lvl2.utils.ConsolePrintUtil.printLine;

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
