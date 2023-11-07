package lt.codeacademy.javaua5.lvl2.func.lambdatask;

public class Startup implements Starter {

	@Override
	public String start(String startupName, String founderName) {
		return startupName + " - " + founderName;
	}
}
