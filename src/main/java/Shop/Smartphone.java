package Shop;

public class Smartphone extends Prodotto {

	// Attributi degli Smartphone

	private long imei;
	private int memorystorage;

	public Smartphone(String name, String brand, double price, long imei, int memorystorage) {
		super(name, brand, price);
		this.imei = imei;
		this.memorystorage = memorystorage;

	}

	/*
	 *  << GETTER AND SETTER >>
	 */

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public int getMemorystorage() {
		return memorystorage;
	}

	public void setMemorystorage(int memorystorage) {
		this.memorystorage = memorystorage;
	}

}
