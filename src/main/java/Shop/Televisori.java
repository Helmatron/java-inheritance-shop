package Shop;

public class Televisori extends Prodotto {

	// Attributi dei Televisori
	private int sizeInch;
	private int base;
	private int heigth;
	private int depth;
	private String smart;
	
	public Televisori() {
		
		this.sizeInch = 0;
		this.base = 0;
		this.heigth = 0;
		this.depth = 0;
		this.smart = null;
	}
	
	/*
	 *  << GETTER AND SETTER >>
	 */

	public int getSizeInch() {
		return sizeInch;
	}

	public void setSizeInch(int sizeInch) {
		this.sizeInch = sizeInch;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public String getSmart() {
		return smart;
	}

	public void setSmart(String smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {

		return "DATI DEL TELEVISORE"
		+ "\n" + super.toString()
		+ "\nDimensione schermo: " + getSizeInch() + " pollici"
		+ "\nDimensioni: " + getBase() + " x " + getDepth() + " x h" + getHeigth() + " cm"
		+ "\nFunzionalità Smart: " + getSmart();
	}

	

}
