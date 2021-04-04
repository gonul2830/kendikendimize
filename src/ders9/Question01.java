package ders9;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesini isteyin.
		// Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari
		// yazdirin.
		// Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
		/*
		 * sifrenini gecerli olup olmadigini check eden bir return method yaziniz;
		 * requirements; 1. Sifre en az 6 karakterden olusmali ve bosluk icermemeli
		 * 2.Sifre en az 1 adet buyuk harf icermeli 3. Sifre en az 1 adet kucuk harf
		 * icermeli 4. Sifre en az 1 adet ozel karakter icermeli 5. Sifre en az 1 adet
		 * rakam icermeli Eger tum requiremntslar karsilanirsa method return u true ,
		 * degilse false dondurun.
		 */
		Scanner scan = new Scanner(System.in);
		String sifre = "";
		int sonuc = 0;

		do {
			System.out.println("lutfen sifrenizi giriniz");
			sifre = scan.nextLine();

			sonuc = kucukHarfVarMÝ(sifre) + buyukHarfVarMÝ(sifre) + ozelKarakterVarMi(sifre) + uzunlukUygunMu(sifre)
					+ rakamVarMi(sifre);

		} while (sonuc != 5);

		System.out.println("sifreniz basarý ile kaydedildi");

		scan.close();
	}

	public static int buyukHarfVarMÝ(String sifre) {
		int flagBuyuk = 0;
		int index = 0;
		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'A' && sifre.charAt(index) <= 'Z') {
				flagBuyuk = 1;
			}
			index++;

		}
		if (flagBuyuk == 0) {
			System.out.println("sifre buyuk harf icermelidir");
		}

		return flagBuyuk;

	}

	public static int rakamVarMi(String sifre) {
		int flagrakam = 0;
		int index = 0;
		while (index < sifre.length()) {
			if ((sifre.charAt(index) <= '9') && (sifre.charAt(index) >= '0')) {
				flagrakam = 1;
			}
			index++;
		}
		if (flagrakam == 0) {
			System.out.println("rakam icermeli");
		}
		return flagrakam;
	}

	public static int uzunlukUygunMu(String sifre) {
		int uzunluk = 0;
		if (sifre.length() < 6) {
			System.out.println("Sifre enaz 6 karakter olmalýdýr");
		} else {
			uzunluk = 1;
		}
		return uzunluk;
	}

	public static int ozelKarakterVarMi(String sifre) {
		int flagOzel = 0;
		int index = 0;
		while (index < sifre.length()) {
			if (sifre.charAt(index) >= ' ' && sifre.charAt(index) <= '/') {
				flagOzel = 1;
			}
			index++;

		}
		if (flagOzel == 0) {
			System.out.println("sifre ozel karakter icermelidir");
		}

		return flagOzel;

	}

	public static int kucukHarfVarMÝ(String sifre) {
		int flagKucuk = 0;
		int index = 0;
		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z') {
				flagKucuk = 1;
			}
			index++;

		}
		if (flagKucuk == 0) {
			System.out.println("sifre buyuk harf icermelidir");
		}

		return flagKucuk;

	}

}
