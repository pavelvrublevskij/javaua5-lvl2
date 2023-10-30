package lt.codeacademy.javaua5.lvl2.generics;

/**
 * Pagal Java konvenciją sutarta,
 * kad generic tipo parametro vardas turi būti viena didžioji.
 * Dažniausiai naudojami vardai:
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 *
 * @param <T>
 */
public class Box<T> {

	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
