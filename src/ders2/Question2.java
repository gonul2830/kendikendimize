package ders2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// say� isteyin
				// tek ya da cift say� oldugunu yazd�r�n
				Scanner scan =new Scanner (System.in);
				System.out.println("Lutfen bir say� giriniz");
				double sayi =scan.nextDouble();
				
			/*	if (sayi%2==0) {
					System.out.println("girilen sayi cift sayi");
				} else {
					System.out.println("girilen say� tek sayi");
				}  */
				
				if (sayi%2==0) {
					System.out.println("girdiginiz sayi cift say�d�r");
				}
				if (sayi%2==1 || sayi%2==-1) {
					System.out.println("girdiginiz sayi tek sayidir");
				
				}
				
				System.out.println("kat�ld�g�n�z icin tesekkur ederiz");

	}

}
