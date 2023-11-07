package lt.codeacademy.javaua5.lvl2.func.lambdatask;

import java.util.HashMap;
import java.util.Map;

public class Translator {

	static Map<String, String> translations = new HashMap<>();

	public Translator() {
		translations.put("hello", "Welcome to out app");
		translations.put("entry_added", "Entry has been added");
		translations.put("logout", "Logout");
	}

	public String toLocale(String key) {
		return translations.get(key);
	}
}
