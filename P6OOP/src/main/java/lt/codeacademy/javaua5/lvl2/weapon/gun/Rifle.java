package lt.codeacademy.javaua5.lvl2.weapon.gun;

import java.math.BigDecimal;

import lt.codeacademy.javaua5.lvl2.interfaces.IsAutomatic;

public class Rifle extends Gun implements IsAutomatic {

	public Rifle(String name, BigDecimal price, float caliber) {
		super(name, price, caliber);
	}
}
