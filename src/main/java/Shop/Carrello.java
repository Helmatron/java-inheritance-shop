package Shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scegliere il tipo di prodotto che si vuole inserire tra:"
				+ "\n Smartphone"
				+ "\n Televisore"
				+ "\n Cuffie");
		
		String tipoProdotto = input.nextLine().toLowerCase();
		
		switch (tipoProdotto) {
		case "smartphone": {
			Smartphone s = new Smartphone();
			System.out.println("Inserire nome dello smartphone");
			s.setName(input.nextLine());
			System.out.println("Inserire la Marca dello Smartphone");
			s.setBrand(input.nextLine());
			System.out.println("Inserire il prezzo");
			s.setPrice(input.nextDouble());
			System.out.println("Inserire la Capacità di memoria dello Smartphone");
			s.setMemorystorage(input.nextInt());
			
			System.out.println(s.toString());
			
			break;
		} case "televisore": {
			Televisori t = new Televisori();
			System.out.println("Inserire nome del Televisore");
			t.setName(input.nextLine());
			System.out.println("Inserire la Marca del Televisore");
			t.setBrand(input.nextLine());
			System.out.println("Inserire il prezzo");
			t.setPrice(input.nextDouble());
			System.out.println("Inserire le dimensioni dello schermo");
			t.setSizeInch(input.nextInt());
			System.out.println("Inserire le dimensioni della TV");
			System.out.println("Base");
			t.setBase(input.nextInt());
			System.out.println("Altezza");
			t.setHeigth(input.nextInt());
			System.out.println("Spessore");
			t.setDepth(input.nextInt());
			System.out.println("Il televisore ha funzionalità da smart TV?");
			System.out.println("rispondere 'si' o 'no'");
			t.setSmart(input.nextLine());
			// Ultimo step lo scanner non parte, forse è oltre la memoria disponibile?
			
			System.out.println(t.toString());
			break;
		} case "cuffie": {
			
			Cuffie c = new Cuffie();
			System.out.println("Inserire nome delle Cuffie");
			c.setName(input.nextLine());
			System.out.println("Inserire la Marca delle Cuffie");
			c.setBrand(input.nextLine());
			System.out.println("Inserire il prezzo");
			c.setPrice(input.nextDouble());
			System.out.println("Inserire il colore delle Cuffie");
			c.setColor(input.nextLine());
			System.out.println("Hanno funzionalità Wireless?");
			System.out.println("rispondere 'si' o 'no'");
			c.setWireless(input.nextLine());
			
			System.out.println(c.toString());
			break;
		}
		
		default:
			System.out.println("Il prodotto inserito non è corretto");
		}
		
	}

}
