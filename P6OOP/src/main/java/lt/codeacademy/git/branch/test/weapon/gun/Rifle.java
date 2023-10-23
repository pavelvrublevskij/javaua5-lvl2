package lt.codeacademy.git.branch.test.weapon.gun;

import java.math.BigDecimal;

import lt.codeacademy.git.branch.test.interfaces.IsAutomatic;

public class Rifle extends Gun implements IsAutomatic {

	public Rifle(String name, BigDecimal price, float caliber) {
		super(name, price, caliber);
	}
}
