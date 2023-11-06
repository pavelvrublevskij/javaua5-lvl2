package lt.codeacademy.javaua5.lvl2.func.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Person {

	private String firstName;
	private String lastName;
	private String phone;
	private String address;
}
