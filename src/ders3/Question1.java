package ders3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//Bilgisayara negatif olmayan bir say� girildi�inde bu say�n�n karek�k�n� hesaplayan,
		//negatif bir say� girildi�inde ise kullan�c�y� uyaran bir Java program� yazal�m.
  //Scanner scan = new Scanner (System.in);
//// Kullanicidan iki basamakli uc adet tam sayi aliniz.
		// Alinan sayilardan en az ikisinin birler basamagi ayni ise
		// ekrana true yoksa false yazdiriniz.
		// (Orn 52,72,93 => true 36,57,78 => false)
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir say� giriniz");
		int sayi = scan.nextInt();
		if (sayi>0) {
			System.out.println(sayi>1/2);
		} else {
           System.out.println("lutfen dogru say� giriniz");
		}
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen uc say� giriniz");
		int sayi1 = scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		
		int sayi1bir= sayi1%10;
		int sayi2bir = sayi2%10;
		int sayi3bir= sayi3%10;
		
		if (sayi1bir==sayi2bir || sayi2bir==sayi3bir || sayi1bir==sayi3bir) {
			System.out.println("true");
		} else {
             System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
}
}