package lt.codeacademy.javaua5.lvl2.projectxstructure.data.entity;

import java.math.BigInteger;

import lombok.Builder;

@Builder
public record UserEntity(BigInteger id, String name, String surname, String nickname, String password, boolean isValid) {}
