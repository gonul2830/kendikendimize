package ders1;

import java.util.Scanner;

public class C2_NePo {

	public static void main(String[] args) {
		//Kullanýcýnýn Girdiði Sayýnýn Negatif mi, Pozitif mi Olduðunu Bul
		//kullanýcýnýn karakter girmedigini düsünelim
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir sayý giriniz");
		int sayi= scan.nextInt();
		
		if(sayi<0) {
			System.out.println("girdiginiz sayý negatiftir ");
		} else if (sayi>0) {
			System.out.println("girdiginiz sayi pozitiftir");
		} else if(sayi==0) {
			System.out.println("girdiginiz sayi sýfýra esittir");
		} else {
			System.out.println("lutfen gecerli bir sayý giriniz");
		}
		
		
		
scan.close();
	}

}
