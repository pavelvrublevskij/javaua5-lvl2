package lt.codeacademy.javaua5.lvl2.func.lambdatask;

public class SpeechEngine {

	private final InjectableTranslator injectableTranslator;

	public SpeechEngine(InjectableTranslator translator) {
		this.injectableTranslator = translator;
	}

	public String speak(String key) {
		return injectableTranslator.andThen(String::toUpperCase).apply(key);
	}

}
