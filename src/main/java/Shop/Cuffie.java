package Shop;

public class Cuffie extends Prodotto {
	
	// Attributi delle cuffie
	private String color;
	private String wireless;

	public Cuffie() {
		
		this.color = null;
		this.wireless = null;
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

	public String getWireless() {
		return wireless;
	}

	public void setWireless(String wireless) {
		this.wireless = wireless;
	}

	@Override
	public String toString() {
		
		return "DATI DELLE CUFFIE"
		+ "\n" + super.toString()
		+ "\nColore: " + getColor()
		+ "\nFuzionalità Wireless: " + getWireless();
	}

}
