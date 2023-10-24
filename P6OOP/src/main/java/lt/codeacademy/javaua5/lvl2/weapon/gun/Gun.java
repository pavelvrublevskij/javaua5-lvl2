package lt.codeacademy.javaua5.lvl2.weapon.gun;

import java.math.BigDecimal;

import lt.codeacademy.javaua5.lvl2.interfaces.HasCaliber;
import lt.codeacademy.javaua5.lvl2.weapon.Weapon;

public class Gun extends Weapon implements HasCaliber {

	private float caliber;

	public Gun(String name, BigDecimal price, float caliber) {
		super(name, price);
		this.caliber = caliber;
	}

	@Override
	public float getCaliber() {
		return caliber;
	}

}
