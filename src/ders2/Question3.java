package ders2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanýcýdan gün isminin ilk harfini isteyin ve harfe uygun olan gün isimlerini yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bicinde oldugunuz gün ün ilk Harfini giriniz");
		
		char ilkHarf =scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("PAZARTESÝ,PAZAR,PERSEMBE");
		}
		if (ilkHarf=='S') {
			System.out.println("SALÝ");
		}
		if (ilkHarf=='C') {
			System.out.println("CARSAMBA,CUMA,CUMARTESÝ");
		}
		
		
		
		
	}

}
