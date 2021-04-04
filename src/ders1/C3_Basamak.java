package ders1;

import java.util.Scanner;

public class C3_Basamak {

	public static void main(String[] args) {
		// Kullanýcýdan 4 basamaklý bir sayý alýn ve bunu tersten yazdýrýn
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen dort basamaklý bir sayý giriniz");
		int sayi = scan.nextInt();
		
		int birlerbas = sayi%10;
		sayi/=10;
		int onlarbas = sayi%10;
		sayi/=10;
		int yuzlerbas= sayi%10;
		sayi/=10;
		int binlerbas= sayi;
		
		
		System.out.println("sayýnýn tersten yazýlýsý:" +birlerbas+onlarbas+yuzlerbas+binlerbas);
		scan.close();

	}

}
