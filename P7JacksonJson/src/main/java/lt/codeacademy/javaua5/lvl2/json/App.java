package lt.codeacademy.javaua5.lvl2.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.javaua5.lvl2.json.model.Person;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) throws IOException {
		final Person person = new Person("Jonas", 25);

		File personJsonFile = new File("person.json");
		ObjectMapper objectMapper = new ObjectMapper();

		// serialization
		objectMapper.writeValue(personJsonFile, person);

		// deserialization
		final Person personDeserialized = objectMapper.readValue(personJsonFile, Person.class);
		System.out.println(personDeserialized);
	}
}
