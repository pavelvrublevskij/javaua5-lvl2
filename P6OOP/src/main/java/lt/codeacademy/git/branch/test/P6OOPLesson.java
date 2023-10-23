package lt.codeacademy.git.branch.test;

import java.math.BigDecimal;

import lt.codeacademy.git.branch.test.interfaces.HasCaliber;
import lt.codeacademy.git.branch.test.interfaces.IsAutomatic;
import lt.codeacademy.git.branch.test.weapon.Weapon;
import lt.codeacademy.git.branch.test.weapon.gun.Gun;
import lt.codeacademy.git.branch.test.weapon.gun.Pistol;
import lt.codeacademy.git.branch.test.weapon.gun.Rifle;
import lt.codeacademy.git.branch.test.weapon.melle.Knife;
import lt.codeacademy.git.branch.test.weapon.melle.Melee;

/**
 * Hello world!
 */
public class P6OOPLesson {

	public static void main(String[] args) {
		final Pistol pistol = new Pistol("Glock", BigDecimal.valueOf(1000), 9.0f);
		final Melee knife = new Knife("Knife", BigDecimal.valueOf(100));
		final Gun rifle = new Rifle("AK-47", BigDecimal.valueOf(1000), 7.62f);
		final Weapon mp5 = new Rifle("MP5", BigDecimal.valueOf(1000), 9.0f);
		final Gun m15 = new Gun("M15", BigDecimal.valueOf(1000), 5.56f);

		final WeaponManager weaponManager = new WeaponManager();
		weaponManager.add(pistol);
		weaponManager.add(knife);
		weaponManager.add(rifle);
		weaponManager.add(mp5);
		weaponManager.add(m15);

//		for (Weapon weapon : weaponManager.getWeapons()) {
//			System.out.println(weapon.getName() + " " + weapon.getPrice());
//		}

		weaponManager.getWeapons()
				.forEach(weapon -> {
					if (weapon instanceof HasCaliber caliberWeapon) {
						System.out.println(weapon.getName() + " " + weapon.getPrice() + " " + caliberWeapon.getCaliber());
					} else {
						System.out.println(weapon.getName() + " " + weapon.getPrice());
					}
				});

		for (Weapon weapon : weaponManager.getWeapons()) {
			if (weapon instanceof IsAutomatic) {
				System.out.println(weapon.getName() + " is automatic");
			}
		}
	}
}
