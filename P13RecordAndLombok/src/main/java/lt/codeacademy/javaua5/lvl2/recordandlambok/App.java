package lt.codeacademy.javaua5.lvl2.recordandlambok;

import lt.codeacademy.javaua5.lvl2.recordandlambok.entity.Animal;
import lt.codeacademy.javaua5.lvl2.recordandlambok.entity.AnimalRecord;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		var animalRerord = new AnimalRecord(2, "Liutas", "0001");
		System.out.println(animalRerord);

		System.out.println(animalRerord.name());

		System.out.println("---------------- lombok --------------");
		var animal = new Animal(2, "Liutas", "0001");
		System.out.println(animal);
	}
}
