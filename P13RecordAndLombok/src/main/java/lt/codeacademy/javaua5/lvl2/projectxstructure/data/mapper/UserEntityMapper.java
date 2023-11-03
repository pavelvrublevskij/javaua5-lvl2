package lt.codeacademy.javaua5.lvl2.projectxstructure.data.mapper;

import java.math.BigInteger;
import java.util.Random;

import lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain.User;
import lt.codeacademy.javaua5.lvl2.projectxstructure.data.entity.UserEntity;

public class UserEntityMapper {

	public UserEntity mapToEntity(final User user) {
		Random random = new Random();
		final String[] fullName = user.getFullName().split(" ");
		return UserEntity.builder()
				.id(BigInteger.valueOf(random.nextLong()))
				.isValid(user.isValid())
				.name(fullName[0].trim())
				.surname(fullName[1].trim())
				.nickname(user.getNickname())
				.password(user.getSecret())
				.build();
	}

}
