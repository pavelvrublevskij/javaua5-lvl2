package lt.codeacademy.javaua5.lvl2.json.task1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.javaua5.lvl2.json.model.Payment;
import lt.codeacademy.javaua5.lvl2.json.model.Person;
import lt.codeacademy.javaua5.lvl2.json.model.Receiver;
import lt.codeacademy.javaua5.lvl2.json.model.Sender;

public class Task1Iml {

	public static void main(String[] args) throws IOException {
		final Sender sender = new Sender("Jonas", 25);
		final Receiver receiver = new Receiver("Petras", 30);
		final Payment payment = new Payment(sender, receiver);

		final ObjectMapper objectMapper = new ObjectMapper();

		File paymentJsonFile = new File("payment.json");

		// serialization
		objectMapper.writeValue(paymentJsonFile, payment);

		// deserialization
		final Payment paymentDeserialized = objectMapper.readValue(paymentJsonFile, Payment.class);
		System.out.println(paymentDeserialized);
	}

}
