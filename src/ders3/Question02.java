package ders3;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// Kullan�c�dan4basamaklibirsayigirmesiniisteyin.
		// Girdi�isayi5�eb�l�n�yorsasonrakam�n�kontroledin.
		// Sonrakam�0iseekrana�5�eb�l�nen�iftsay��yazd�r�n.
		// Sonrakam�0de�ilise�5�eb�l�nenteksay��yazd�r�n.
		// Girdi�ipassword5�eb�l�nm�yorsaekrana�Tekrar deneyin�yazd�r�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort basamakl� bir say� giriniz");
		int sayi = scan.nextInt();

		if (sayi < 10000 && sayi >= 1000) {
			if (sayi % 5 == 0) {
				if (sayi % 2 == 0) {
					System.out.println("5 e bolunen cift say�d�r");
				} else {
					System.out.println("5 e bolunen tek say�d�r");
				}
			} else {
				System.out.println("tekrar deneyin");
			}

		} else {
			System.out.println("lutfen dort basamakl� say� giriniz");
		}
	}

}
