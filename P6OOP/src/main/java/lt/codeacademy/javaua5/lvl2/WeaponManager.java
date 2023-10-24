package lt.codeacademy.javaua5.lvl2;

import java.util.LinkedList;
import java.util.List;

import lt.codeacademy.javaua5.lvl2.weapon.Weapon;

//C.R.U.D.  - Create, Read, Update, Delete
public class WeaponManager {

	private List<Weapon> weapons = new LinkedList<>();   //null, null, null

	public void add(final Weapon weapon) {
		weapons.add(weapon);
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}
}
