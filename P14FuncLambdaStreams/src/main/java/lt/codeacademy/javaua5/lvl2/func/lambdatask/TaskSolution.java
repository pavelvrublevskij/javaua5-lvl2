package lt.codeacademy.javaua5.lvl2.func.lambdatask;

public class TaskSolution {

	public TaskSolution() {
/*		final Starter starter = new Startup();
		String startupper = starter.start("JavaApp", "Pavel & Co");
		System.out.println(startupper);
		starter.progress();
		System.out.println(Starter.finish());

		final Starter anonimStarter = (startupName, founderName) -> startupName.concat(" - ").concat(founderName);
		startupper = anonimStarter.start("JavaApp", "Pavel & Co");
		System.out.println(startupper);
		anonimStarter.progress();
		System.out.println(Starter.finish());*/

		SpeechEngine speechEngine = new SpeechEngine(new InjectableTranslator());
		System.out.println(speechEngine.speak("entry_added"));
	}
}
