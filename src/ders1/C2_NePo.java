package ders1;

import java.util.Scanner;

public class C2_NePo {

	public static void main(String[] args) {
		//Kullan�c�n�n Girdi�i Say�n�n Negatif mi, Pozitif mi Oldu�unu Bul
		//kullan�c�n�n karakter girmedigini d�s�nelim
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir say� giriniz");
		int sayi= scan.nextInt();
		
		if(sayi<0) {
			System.out.println("girdiginiz say� negatiftir ");
		} else if (sayi>0) {
			System.out.println("girdiginiz sayi pozitiftir");
		} else if(sayi==0) {
			System.out.println("girdiginiz sayi s�f�ra esittir");
		} else {
			System.out.println("lutfen gecerli bir say� giriniz");
		}
		
		
		
scan.close();
	}

}
