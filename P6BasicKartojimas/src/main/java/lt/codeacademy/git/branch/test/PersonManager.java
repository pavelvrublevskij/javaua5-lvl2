package lt.codeacademy.git.branch.test;

import lt.codeacademy.git.branch.test.exception.NoSpaceException;
import lt.codeacademy.git.branch.test.pojo.Person;

//C.R.U.D.  - Create, Read, Update, Delete
public class PersonManager {

	private Person[] persons = new Person[3];   //null, null, null

	public void createPerson(final Person person) {
		for (int i = 0; i < persons.length; i++) {
			Person p = persons[i];
			if (p == null) {
				persons[i] = person;
				return;
			}
		}

		throw new NoSpaceException("No spaece available for new person");
	}

	public void updatePerson(final int personId, final Person person) {
		for (Person p: persons) {
			if (p.getId() == personId) {
				p = person;
				return;
			}
		}
	}

	public void deletePerson(final Person person) {
		//TODO
	}

	public Person[] getPersons() {
		return persons;
	}
}
