package lt.codeacademy.javaua5.lvl2.func.functions.predicate;

import java.util.function.Predicate;

import lt.codeacademy.javaua5.lvl2.func.domain.Person;
import lt.codeacademy.javaua5.lvl2.func.service.AddressRetrieverService;

public class PredicateExample {

	public void demo() {
		final Person person = Person.builder()
				.firstName("Petras")
				.lastName("Petraitis")
				.build();

		Predicate<Person> hasPhoneNumber = p -> p.getPhone() != null;

		if (hasAddressPredicate()
				.and(hasPhoneNumber)
				.test(person)) {
			System.out.println("Address & Phone available!");
		} else {
			System.out.println("Address & Phone not available!");
		}
	}

	private Predicate<Person> hasAddressPredicate() {
		return p -> {
			final AddressRetrieverService addressRetrieverService = new AddressRetrieverService();
			final String personAddress = addressRetrieverService.getAddressFromRCByPerson(p);

			return personAddress != null;
		};
	}

}
