package lt.codeacademy.javaua5.lvl2.recordandlambok.entity;

import java.beans.Transient;
import java.io.Serializable;

// immutable data class
// * sort
// * create object
// * assign via constructor data
// * get data using variable name as methods
// * no inheritance
// * implement interfaces
// * do overrides, do overloads
public record AnimalRecord(int age, @Transient String name, String number) implements Serializable {

//	@Override
//	public String toString() {
//		return "As perrasytas record'e!";
//	}
}
