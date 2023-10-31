package lt.codeacademy.javaua5.lvl2.generics.inheritance;

import lt.codeacademy.javaua5.lvl2.generics.Box;

public class FigureDrawler {

	public void draw(Figure figure) {
		//
	}

	public <T> void drawAsGenericType(T figure) {
		//
	}

	public <T extends Figure> void drawAsGenericType2(T figure) {
		//
	}

	public void drawAsGenericType3(Box<Figure> figure) {
		//
	}

	// same as:
	// public <T extends Figure> void drawAsGenericType4(Box<T> figure)
	public void drawAsGenericType4(Box<? extends Figure> figure) {
		//
	}

	public void drawAsGenericType5(Box<? super Square> figure) {
		//
	}

}
