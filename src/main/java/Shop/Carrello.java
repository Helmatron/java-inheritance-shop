package Shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
	}

}
