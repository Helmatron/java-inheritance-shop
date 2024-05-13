package Shop;

public class Smartphone extends Prodotto {

	// Attributi degli Smartphone

	private long imei;
	private int memorystorage;
	
	public Smartphone() {
		
		imei =  (long) (Math.random() * (999999999 - 1) + 1);
		memorystorage = 0;
	}
	
/*	public Smartphone(String name, String brand, double price, long imei, int memorystorage) {
		super(name, brand, price);
		this.imei = imei;
		this.memorystorage = memorystorage;

	}
	
	// Test costruttore no-args
	public Smartphone(String name, String brand, double price) {
		super(name, brand, price);
		
	}
*/
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

	@Override
	public String toString() {
		
		return "DATI DELLO SMARTPHONE"
		+ "\n"
		+ super.toString()
		+ "\nCodice IMEI: " + getImei()
		+ "\nCapacità: " + getMemorystorage() + " GB";
	}

}
