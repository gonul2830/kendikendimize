package ders4;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// bir string alalim string 3 karakterden fazla ise ilk 3karakteri kullanicinin
		// istedigi kadar yan yana yazdiralim3 den az ise
		// yine kullanicinin istedigi kadar yan yana yazdiralim (for ile)
		// java 5 tekrar=>javjavjavjavjav
		// run 2 tekra=> runrun
		// al 4 tekrar => alalalal

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
		String str = scan.next();
		System.out.println("kac defa tekrar edilsin");
		int tekrar = scan.nextInt();

		if (str.length() > 3) {

			
				for (int j = 0; j < tekrar; j++) {
					System.out.print(str.substring(0, 3));
				}
			
		} else {
			
				for (int j = 0; j < tekrar; j++) {
					System.out.print(str);
				}
		

		}

	}

}
