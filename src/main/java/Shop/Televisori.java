package Shop;

public class Televisori extends Prodotto {

	// Attributi dei Televisori
	private int sizeInch;
	private int base;
	private int heigth;
	private int depth;
	private boolean smart;
	
	public Televisori(String name, String brand, double price,
			int sizeInch, int base, int heigth, int depth, boolean smart) {
		super(name, brand, price);
		
		this.sizeInch = sizeInch;
		this.base = base;
		this.heigth = heigth;
		this.depth = depth;
		this.smart = smart;
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

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	

}
