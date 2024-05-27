package enums;

public enum Color {
	AZUL("azul"), ROJO("rojo"), VEIS("veis"), MORADO("morado"), ROSA("rosa"), VERDE("verde"), MARRON("marron"), AMARILLO("amarillo"), NARANJA("naranja");
	
	private String color;
	
	Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
