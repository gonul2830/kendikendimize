package ders1;

import java.util.Scanner;

public class C3_Basamak {

	public static void main(String[] args) {
		// Kullan�c�dan 4 basamakl� bir say� al�n ve bunu tersten yazd�r�n
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen dort basamakl� bir say� giriniz");
		int sayi = scan.nextInt();
		
		int birlerbas = sayi%10;
		sayi/=10;
		int onlarbas = sayi%10;
		sayi/=10;
		int yuzlerbas= sayi%10;
		sayi/=10;
		int binlerbas= sayi;
		
		
		System.out.println("say�n�n tersten yaz�l�s�:" +birlerbas+onlarbas+yuzlerbas+binlerbas);
		scan.close();

	}

}
