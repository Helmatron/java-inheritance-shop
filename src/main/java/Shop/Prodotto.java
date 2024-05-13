package Shop;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private double price;
	private double ivaPrice;
	private static int IVA22 = 22;

	public Prodotto() {
		code = getCode();
		name = "da definire";
		brand = "da definire";
		price = 0;
		ivaPrice = getIvaPrice(price);
	}
	
	/*
	 * << COSTRUTTORE INUTILE >> public Prodotto(String name, String brand, double
	 * price) { this.code = (int) (Math.random() * (99999999 - 1) + 1); this.name =
	 * name; this.brand = brand; this.price = price; }
	 */

	/*
	 * POTREBBE AVERE SENSO INIZIALIZZARE IL CODICE DIRETTAMETE CON IL COSTRUTTORE
	 */
	// private int setCode() {
	// return this.code = (int) (Math.random() * (99999999 - 1) + 1); }

//	public int getCode() {
//		return this.code;
//	}
	
	public int getCode() {
		return this.code = (int) (Math.random() * (99999999 - 1) + 1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getIVA22() {
		return IVA22;
	}

	public static void setIVA22(int IVA) {
		IVA22 = IVA;
	}

	// Restituzione prezzo iva inclusa
	public double getIvaPrice(double ivaPrice) {
		return ivaPrice = ((price * IVA22) / 100) + price;
	}
	
	public String toString() {
		return "Codice del prodotto: " + getCode()
		+ "\nNome del Prodotto: " + getName()
		+ "\nMarca del prodotto: " + getBrand()
		+ "\nPrezzo iva esclusa: " + getPrice() + " €"
		+ "\nPrezzo iva inclusa: " + getIvaPrice(price) + " €";
	}
}
