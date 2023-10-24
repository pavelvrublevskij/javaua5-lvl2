package lt.codeacademy.javaua5.lvl2.exception;

public class NoSpaceException extends RuntimeException {

	private final String msg;

	public NoSpaceException(String msg) {
		this.msg = msg;
	}
}
