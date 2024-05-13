package Shop;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		
		// Test sul setter da input tastiera
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il nome del prodotto");
		String name = input.nextLine();
		
		// test sul costruttore
		Smartphone dati = new Smartphone("Iphone 12 pro", null, 0, 0, 128);
		
		
		dati.setName(name);
		System.out.println(dati.getName());
		System.out.println(dati.getMemorystorage() + " GB");
		// è possibile generare il codice una sola volta alla creazione
		// di un nuovo prodotto e assegnarlo in modo che non muti più?
		// System.out.println(dati.getCode());
	}

	

}
