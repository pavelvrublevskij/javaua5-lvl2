package lt.codeacademy.javaua5.lvl2.projectxstructure.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Builder
@RequiredArgsConstructor
@Getter
public class User {

	private final String fullName;
	private final String nickname;
	private final String secret;

	@Setter
	private boolean isValid;
}
