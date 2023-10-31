package lt.codeacademy.javaua5.lvl2.generics.inheritance.task1;

public interface Tree {

    String has();

    default String get() {
		// class reflection
        return this.getClass().getSimpleName() + " " + has();
    }
}
