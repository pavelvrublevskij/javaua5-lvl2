package lt.codeacademy.javaua5.lvl2.generics.inheritance;

import java.math.BigDecimal;

import lt.codeacademy.javaua5.lvl2.generics.Box;

public class GenericInheritanceExample {

	public void init() {
		methodGenericInheritance();
		exampleWithFigures();
	}

	private void exampleWithFigures() {
		FigureDrawler drawler = new FigureDrawler();

		drawler.draw(new Square());
		drawler.draw(new Rectangle());
//		drawler.draw(new String());  kompiliavimo klaida
		drawler.draw(new Figure(){});  // pilna abstrakcija turi buti pilnai implementuota

		drawler.drawAsGenericType(new Square());
		drawler.drawAsGenericType(new Rectangle());
		drawler.drawAsGenericType(new Figure(){});
		drawler.drawAsGenericType(new String());

		drawler.drawAsGenericType2(new Square());
		drawler.drawAsGenericType2(new Rectangle());
		drawler.drawAsGenericType2(new Figure(){});
//		drawler.drawAsGenericType2(new String());  // kompiliavimo klaida

//		drawler.drawAsGenericType3(new Box<Square>());  // kompiliavimo klaida
//		drawler.drawAsGenericType3(new Box<Rectangle>()); // kompiliavimo klaida
		drawler.drawAsGenericType3(new Box<Figure>(){});
//		drawler.drawAsGenericType3(new Box<String>()); // kompiliavimo klaida

		drawler.drawAsGenericType4(new Box<Square>());
		drawler.drawAsGenericType4(new Box<Rectangle>());
		drawler.drawAsGenericType4(new Box<Figure>(){});
//		drawler.drawAsGenericType4(new Box<String>()); // kompiliavimo klaida

		drawler.drawAsGenericType5(new Box<Object>());
//		drawler.drawAsGenericType5(new Box<Rectangle>());  // kompiliavimo klaida
		drawler.drawAsGenericType5(new Box<Square>());
	}

	private void methodGenericInheritance() {
		Number value1 = 2;
		Number value2 = new BigDecimal(4.5);

		add(value1);
		add(value2);
	}

	private <T extends Number> void add(T number) {
		System.out.println(number.doubleValue() + 5);
	}

}
