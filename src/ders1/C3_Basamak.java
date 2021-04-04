package ders1;

import java.util.Scanner;

public class C3_Basamak {

	public static void main(String[] args) {
		// Kullanıcıdan 4 basamaklı bir sayı alın ve bunu tersten yazdırın
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen dort basamaklı bir sayı giriniz");
		System.out.println("ikinci degisiklik yapıldı");
		int sayi = scan.nextInt();
		
		int birlerbas = sayi%10;
		sayi/=10;
		int onlarbas = sayi%10;
		sayi/=10;
		int yuzlerbas= sayi%10;
		sayi/=10;
		int binlerbas= sayi;
		
		
		System.out.println("sayının tersten yazılısı:" +birlerbas+onlarbas+yuzlerbas+binlerbas);
		scan.close();

		
		
		System.out.println("son degisiklik");
	}

}
