package lt.codeacademy.javaua5.lvl2.json;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.javaua5.lvl2.json.config.Config;
import lt.codeacademy.javaua5.lvl2.json.model.Person;
import lt.codeacademy.javaua5.lvl2.json.utils.ResourceUtil;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) throws IOException, URISyntaxException {
		System.out.println("--------------------------------------------------");
		readFromConfig();
		System.out.println("--------------------------------------------------");

		final Person person = new Person("Jonas", 25);

		File personJsonFile = new File("person.json");
		ObjectMapper objectMapper = new ObjectMapper();

		// serialization
		objectMapper.writeValue(personJsonFile, person);

		// deserialization
		final Person personDeserialized = objectMapper.readValue(personJsonFile, Person.class);
		System.out.println(personDeserialized);
	}

	public static void readFromConfig() throws URISyntaxException, IOException {
		File configFile = ResourceUtil.getFileFromResource("config.json");
		ObjectMapper objectMapper = new ObjectMapper();
		final Config configResult = objectMapper.readValue(configFile, Config.class);
		System.out.println(configResult);
	}
}
