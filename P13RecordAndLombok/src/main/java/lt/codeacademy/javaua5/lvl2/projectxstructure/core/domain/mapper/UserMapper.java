package lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.mapper;

import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.User;
import lt.codeacademy.javaua5.lvl2.projectxstructure.controller.facade.dto.UserDto;

public class UserMapper {

	public User mapToDomain(final UserDto userDto) {
		return User.builder()
				.nickname(userDto.getUsername())
				.secret(userDto.getPassword()) //????
				.fullName(userDto.getName() + " " + userDto.getSurname())
				.build();
	}

	public UserDto mapToDto(final User user) {
		final String[] fullName = user.getFullName().split(" ");
		return UserDto.builder()
				.username(user.getNickname())
				.name(fullName[0].trim())
				.surname(fullName[1].trim())
				.build();
	}

}
