package lt.codeacademy.javaua5.lvl2.projectxstructure.service;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.User;
import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.mapper.UserMapper;
import lt.codeacademy.javaua5.lvl2.projectxstructure.data.entity.repository.UserRepository;
import lt.codeacademy.javaua5.lvl2.projectxstructure.data.mapper.UserEntityMapper;

@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;
	private final UserEntityMapper userEntityMapper;

	public void doSomeUserAction(final User user) {
		// kazkokia logika, bla bla bla
		if (true) {
			user.setValid(true);
		}

		// turime perduoti i DB arba faila
		userRepository.save(userEntityMapper.mapToEntity(user));
	}
}
