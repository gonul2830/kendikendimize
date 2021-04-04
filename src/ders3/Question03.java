package ders3;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// NestedIfkullanarakasagidakisoruyucozenkoduyaziniz.
		// Kullanicidanbirsifregirmesiniisteyin
		// Egerilkharfbuyukharfise“A”olupolmadiginikontroledin.IlkharfAise“GecerliSifre”degilse“GecersizSifre”yazdirin.
		// Egerilkharfkucukharfise“z”olupolmadiginikontroledin.Ilkharfzise“GecerliSifre”degilse“GecersizSifre”yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sifre giriniz");
		String sifre = scan.next();
		if (sifre.charAt(0) <= 'Z' && sifre.charAt(0) >= 'A') {
			if (sifre.substring(0, 1).equals("A")) {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}
		} else if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
			if (sifre.substring(0, 1).equals("z")) {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}

		}  else {
			System.out.println("lutfen tekrar giriniz");
		}

	}

}
