package lt.codeacademy.javaua5.lvl2;

import java.math.BigDecimal;

import lt.codeacademy.javaua5.lvl2.interfaces.HasCaliber;
import lt.codeacademy.javaua5.lvl2.interfaces.IsAutomatic;
import lt.codeacademy.javaua5.lvl2.weapon.Weapon;
import lt.codeacademy.javaua5.lvl2.weapon.gun.Gun;
import lt.codeacademy.javaua5.lvl2.weapon.gun.Pistol;
import lt.codeacademy.javaua5.lvl2.weapon.gun.Rifle;
import lt.codeacademy.javaua5.lvl2.weapon.melle.Knife;
import lt.codeacademy.javaua5.lvl2.weapon.melle.Melee;

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
				.stream()
				.filter(weapon -> weapon instanceof HasCaliber)
				.filter(weapon -> weapon.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0)
				.forEach(weapon -> System.out.println(weapon.getName() + " " + weapon.getPrice() + " " + ((HasCaliber) weapon).getCaliber()));

		for (Weapon weapon : weaponManager.getWeapons()) {
			if (weapon instanceof IsAutomatic) {
				System.out.println(weapon.getName() + " is automatic");
			}
		}

		// builder pattern, pagal GOF knyga
		Person person = Person
				.builder()
				.name("")
				.age(20)
				.surname("Tomaitis");

		System.out.println(person);
	}
}
