package ders3;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// Kullanýcýdan4basamaklibirsayigirmesiniisteyin.
		// Girdiðisayi5’ebölünüyorsasonrakamýnýkontroledin.
		// Sonrakamý0iseekrana“5’ebölünençiftsayý”yazdýrýn.
		// Sonrakamý0deðilise“5’ebölünenteksayý”yazdýrýn.
		// Girdiðipassword5’ebölünmüyorsaekrana“Tekrar deneyin”yazdýrýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort basamaklý bir sayý giriniz");
		int sayi = scan.nextInt();

		if (sayi < 10000 && sayi >= 1000) {
			if (sayi % 5 == 0) {
				if (sayi % 2 == 0) {
					System.out.println("5 e bolunen cift sayýdýr");
				} else {
					System.out.println("5 e bolunen tek sayýdýr");
				}
			} else {
				System.out.println("tekrar deneyin");
			}

		} else {
			System.out.println("lutfen dort basamaklý sayý giriniz");
		}
	}

}
