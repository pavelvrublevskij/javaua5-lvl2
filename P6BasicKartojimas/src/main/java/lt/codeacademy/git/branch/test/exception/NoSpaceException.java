package lt.codeacademy.git.branch.test.exception;

public class NoSpaceException extends RuntimeException {

	private final String msg;

	public NoSpaceException(String msg) {
		this.msg = msg;
	}
}
