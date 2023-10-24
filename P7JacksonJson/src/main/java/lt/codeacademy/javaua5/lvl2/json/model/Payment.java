package lt.codeacademy.javaua5.lvl2.json.model;

import java.util.StringJoiner;

public class Payment {

	private Sender sender;
	private Receiver receiver;

	public Payment() {
	}

	public Payment(Sender sender, Receiver receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	public Sender getSender() {
		return sender;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Payment.class.getSimpleName() + "[", "]")
				.add("sender=" + sender)
				.add("receiver=" + receiver)
				.toString();
	}
}
