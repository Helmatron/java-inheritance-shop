package Shop;

public class Cuffie extends Prodotto {
	
	// Attributi delle cuffie
	String color;
	boolean wireless;

	public Cuffie(String name, String brand, double price,
			 String color, boolean wireless) {
		super(name, brand, price);
		this.color = color;
		this.wireless = wireless;
	}
	
	/*
	 *  << GETTER AND SETTER >>
	 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

}
