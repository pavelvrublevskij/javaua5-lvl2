package lt.codeacademy.git.branch.test.weapon;

import java.math.BigDecimal;

import lt.codeacademy.git.branch.test.interfaces.HasPrice;

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
