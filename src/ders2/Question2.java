package ders2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// sayý isteyin
				// tek ya da cift sayý oldugunu yazdýrýn
				Scanner scan =new Scanner (System.in);
				System.out.println("Lutfen bir sayý giriniz");
				double sayi =scan.nextDouble();
				
			/*	if (sayi%2==0) {
					System.out.println("girilen sayi cift sayi");
				} else {
					System.out.println("girilen sayý tek sayi");
				}  */
				
				if (sayi%2==0) {
					System.out.println("girdiginiz sayi cift sayýdýr");
				}
				if (sayi%2==1 || sayi%2==-1) {
					System.out.println("girdiginiz sayi tek sayidir");
				
				}
				
				System.out.println("katýldýgýnýz icin tesekkur ederiz");

	}

}
