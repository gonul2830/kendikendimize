package ders3;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// Kullan�c�dan ya��n�, cinsiyetini (E veya K), medeni durumu (E veya H)
		// girmesini
		// ve ard�ndan a�a��daki kurallar� kullanarak hizmet yerini yazd�rmas�n�
		// isteyin.
		// �al��an kad�n ise sadece kentsel alanlarda �al��acakt�r.
		// �al��an erkekse ve ya�� 20 ile 40 aras�ndaysa herhangi bir yerde �al��an
		// erkekse
		// ve ya�� 40 ila 60 aras�ndaysa o zaman sadece kentsel alanlarda �al��acakt�r.
		// Ve di�er herhangi bir ya� girdisi "HATA" yazmal�d�r.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cinsiyetinizi giriniz");
		String cinsiyet = scan.next().toLowerCase();
		System.out.println("lutfen yas�n�z� giriniz");
		int yas = scan.nextInt();

		if (cinsiyet.equals("erkek")) {
			if (yas > 20 && yas < 40) {
				System.out.println("herhangi bir yerde cal�sabilir");
			} else if (yas < 60 && yas > 40) {
				System.out.println("sadece kentsel alanda cal�sabilir");
			} else {
				System.out.println("HATA");
			}
		} else if(cinsiyet.equals("kadin")){
			System.out.println("sadace kentsel alanda cal�sabilir");
		} else {
			System.out.println("HATA");
		}

	}

}
