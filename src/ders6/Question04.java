package ders6;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir sayý giriniz");
		
		int sayi1=scan.nextInt();
		System.out.println("lutfen bir kuvvet giriniz");
		int sayi2= scan.nextInt();
		
		int sonuc=1;
		for (int i = 0; i < sayi2; i++) {
			//sonuc=sonuc*sayi1;
			sonuc*=sayi1;
		}
		
System.out.println(sonuc);
	}

}
