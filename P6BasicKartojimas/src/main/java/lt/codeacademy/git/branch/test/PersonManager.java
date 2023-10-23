package lt.codeacademy.git.branch.test;

import java.util.LinkedList;
import java.util.List;

import lt.codeacademy.git.branch.test.exception.NoSpaceException;
import lt.codeacademy.git.branch.test.pojo.Person;

//C.R.U.D.  - Create, Read, Update, Delete
public class PersonManager {

	private List<Person> persons = new LinkedList<>();   //null, null, null

	public void createPerson(final Person person) {
		persons.add(person);
	}

	public void updatePerson(final int personId, final Person person) {
		persons.forEach(p -> { // lambda expression
			if (p.getId() == personId) {
				p.setName(person.getName());
				p.setSurname(person.getSurname());
			}
		});
	}

	public void deletePerson(final int personId) {
		/*Person person = null;
		for (Person p: persons) {
			if (p.getId() == personId) {
				person = p;
				break;
			}
		}

		persons.remove(person);*/

		persons.removeIf(p -> p.getId() == personId); // simple way using lambda expression instead above commented code
	}

	public List<Person> getPersons() {
		return persons;
	}
}
