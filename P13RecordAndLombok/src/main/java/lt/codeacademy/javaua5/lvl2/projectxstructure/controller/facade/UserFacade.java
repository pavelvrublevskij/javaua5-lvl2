package lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade.dto.UserDto;
import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.mapper.UserMapper;
import lt.codeacademy.javaua5.lvl2.projectxstructure.service.UserService;

@RequiredArgsConstructor
public class UserFacade {

	private final UserMapper userMapper;
	private final UserService userService;

	public void setUser(final UserDto userDto) {
		userService.doSomeUserAction(userMapper.mapToDomain(userDto));
	}
}
