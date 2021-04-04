package ders4;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// // kullanicidan alinan stringin karakterleri indexleri kadar yazalim
		//ornek
		// ali= alliii
		//java= jaavvvaaaa
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String name = scan.next();
		int tekrar= scan.nextInt();
	/*
	for (int i = 0; i < name.length(); i++) {
		for (int j = 0; j <=i; j++) {
		 System.out.print(name.charAt(i));
		}
	}
	*/
		//kullanicidan bir string alin ve bu stringi kullanicinin istedigi kadar tekrar yazin
	System.out.println();

	for (int i = 0; i < tekrar; i++) {
		System.out.print(name);
		
		
	}
	

	
	
	
	
	}

}
