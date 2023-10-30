package lt.codeacademy.javaua5.lvl2.generics.task1;

import java.util.List;

/**
 * @version 1.0
 * @implNoteGenerics Task-1
 * @implSpecCreateany implementation regarding this interface
 */
public interface ListBox<E> {
    /**
     * Should be implementation from simple array to collection
     *
     * @param values array of {@link E} values
     */
    void addElements(E[] values);

    /**
     * Should be implementation to add single element
     *
     * @param value
     */
    void addElement(E value);

    /**
     * Should be implementation to get collection with/without values
     *
     * @return a Collection
     */
    List<E> getElements();

	E getIndex(int index);
}
