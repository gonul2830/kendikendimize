package ders3;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// Kullanýcýdan yaþýný, cinsiyetini (E veya K), medeni durumu (E veya H)
		// girmesini
		// ve ardýndan aþaðýdaki kurallarý kullanarak hizmet yerini yazdýrmasýný
		// isteyin.
		// Çalýþan kadýn ise sadece kentsel alanlarda çalýþacaktýr.
		// Çalýþan erkekse ve yaþý 20 ile 40 arasýndaysa herhangi bir yerde çalýþan
		// erkekse
		// ve yaþý 40 ila 60 arasýndaysa o zaman sadece kentsel alanlarda çalýþacaktýr.
		// Ve diðer herhangi bir yaþ girdisi "HATA" yazmalýdýr.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cinsiyetinizi giriniz");
		String cinsiyet = scan.next().toLowerCase();
		System.out.println("lutfen yasýnýzý giriniz");
		int yas = scan.nextInt();

		if (cinsiyet.equals("erkek")) {
			if (yas > 20 && yas < 40) {
				System.out.println("herhangi bir yerde calýsabilir");
			} else if (yas < 60 && yas > 40) {
				System.out.println("sadece kentsel alanda calýsabilir");
			} else {
				System.out.println("HATA");
			}
		} else if(cinsiyet.equals("kadin")){
			System.out.println("sadace kentsel alanda calýsabilir");
		} else {
			System.out.println("HATA");
		}

	}

}
