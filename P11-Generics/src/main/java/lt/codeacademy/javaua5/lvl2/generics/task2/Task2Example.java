package lt.codeacademy.javaua5.lvl2.generics.task2;

public class Task2Example {

	//skaičiaus tipo elementai
	private Integer[] digits = {1, 2, 3};

	//eilutės tipo elementai
	private String[] words = {"Hello", "World"};

	public void init() {
		printArray(digits);
		printArray(words);
	}

	private <E> void printArray(E[] values) {
		for (E value: values) {
			System.out.println(value);
		}
	}

/*	private void printArray(int[] values) {
		for (int value: values) {
			System.out.println(value);
		}
	}

	private void printArray(String[] values) {
		for (String value: values) {
			System.out.println(value);
		}
	}*/

}
