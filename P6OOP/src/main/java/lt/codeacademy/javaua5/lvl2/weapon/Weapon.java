package lt.codeacademy.javaua5.lvl2.weapon;

import java.math.BigDecimal;

import lt.codeacademy.javaua5.lvl2.interfaces.HasPrice;

public abstract class Weapon implements HasPrice {

	private final String name;
	private final BigDecimal price;

	public Weapon(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Weapon{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
