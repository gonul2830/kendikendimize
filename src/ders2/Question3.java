package ders2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullan�c�dan g�n isminin ilk harfini isteyin ve harfe uygun olan g�n isimlerini yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bicinde oldugunuz g�n �n ilk Harfini giriniz");
		
		char ilkHarf =scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("PAZARTES�,PAZAR,PERSEMBE");
		}
		if (ilkHarf=='S') {
			System.out.println("SAL�");
		}
		if (ilkHarf=='C') {
			System.out.println("CARSAMBA,CUMA,CUMARTES�");
		}
		
		
		
		
	}

}
