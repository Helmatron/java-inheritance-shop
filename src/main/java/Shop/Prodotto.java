package Shop;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private double price;
	private static int IVA22 = 22;

	public Prodotto(String name, String brand, double price) {
		this.code = (int) (Math.random() * (99999999 - 1) + 1);
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	/*
	 * POTREBBE AVERE SENSO INIZIALIZZARE IL CODICE DIRETTAMETE CON IL COSTRUTTORE
	 */
	// private int setCode() {
	// return this.code = (int) (Math.random() * (99999999 - 1) + 1); }

	public int getCode() {
		return this.code;
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

}
