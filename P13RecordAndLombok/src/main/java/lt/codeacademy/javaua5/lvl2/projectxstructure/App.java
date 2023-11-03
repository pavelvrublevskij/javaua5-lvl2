package lt.codeacademy.javaua5.lvl2.projectxstructure;

import lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade.dto.UserDto;
import lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade.UserFacade;
import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.mapper.UserMapper;
import lt.codeacademy.javaua5.lvl2.projectxstructure.service.UserService;

public class App {

	public static void main(String[] args) {
		final UserDto userDto = UserDto.builder()
				.name("Petras")
				.surname("Petraitis")
				.password("abscd")
				.username("petrpetr")
				.build();

		UserFacade userFacade = new UserFacade(new UserMapper(), new UserService());
		userFacade.setUser(userDto);
	}
}
