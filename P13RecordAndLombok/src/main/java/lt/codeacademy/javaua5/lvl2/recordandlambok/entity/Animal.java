package lt.codeacademy.javaua5.lvl2.recordandlambok.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@ToString
public class Animal {

	int age;
	String name;
	String number;
}
