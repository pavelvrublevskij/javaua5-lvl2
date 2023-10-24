package lt.codeacademy.javaua5.lvl2.utils;

public final class ConsolePrintUtil {

	private ConsolePrintUtil() {
	}

	public static void printLine() {
		System.out.println("--------------------------------------------------");
	}

	public static void print(String text) {
		System.out.println(text);
	}

	/**
	 * Prints text to console using Formatter
	 * @param args
	 */
	public static void myPrintf(String format, Object... args) {
		System.out.printf(format, args);
	}

	public static void myPrintfln(String format, Object... args) {
		System.out.printf(format + "\n", args);
	}
}
