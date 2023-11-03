package lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDto {

	String name;
	String surname;
	String username;
	String password;
}
