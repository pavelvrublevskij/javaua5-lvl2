package lt.codeacademy.git.branch.test.weapon.gun;

import java.math.BigDecimal;

import lt.codeacademy.git.branch.test.interfaces.HasCaliber;
import lt.codeacademy.git.branch.test.weapon.Weapon;

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
