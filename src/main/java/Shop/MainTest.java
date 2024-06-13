package Shop;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		
		// Test sul setter da input tastiera
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il nome del prodotto");
		String name = input.nextLine();
		System.out.println("Inserire codice imei");
		long imei = input.nextLong();
		
		// Test costruttore con parametri
		Smartphone dati = new Smartphone();
		
		// test sul costruttore no args
		// Smartphone dati = new Smartphone("Iphone 13 pro", null, 120);
		
		dati.setImei(imei);
		dati.setName(name);
		System.out.println(dati.getImei());
		System.out.println(dati.getName());
		System.out.println(dati.getPrice() + " €");
		System.out.println(dati.getMemorystorage() + " GB");
		// è possibile generare il codice una sola volta alla creazione
		// di un nuovo prodotto e assegnarlo in modo che non muti più?
		// System.out.println(dati.getCode());
	}

	

}
