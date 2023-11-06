package lt.codeacademy.javaua5.lvl2.func.functions.consumer;

import java.util.function.Consumer;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.javaua5.lvl2.func.domain.Person;
import lt.codeacademy.javaua5.lvl2.func.service.AddressRetrieverService;

@RequiredArgsConstructor
public class ConsumerExample {

	private final AddressRetrieverService addressRetrieverService;

	public void demo() {
		final Person person = Person.builder()
				.firstName("Petras")
				.lastName("Petraitis")
				.build();

		final Consumer<Person> personEnricher = (Person p) -> {
			p.setAddress(addressRetrieverService.getAddressFromRCByPerson(p));
			p.setPhone("002");
		};

		System.out.println(person);
		personEnricher.accept(person);
		System.out.println(person);
	}

}
