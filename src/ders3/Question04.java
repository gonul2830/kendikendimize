package ders3;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// kullanicidan cinsiyetini kilosunu ve yasini isteyin
		// kadin 20 yas ustu ve 50 kilodan fazla 120 kilodan az ise kan verebilir
		// erkek18 yas ustu v 70 kilodan fazla 130 kilodan az ise kan verebilir
		// kiriterlere uymuyorsa kan veremez

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen istenilenleri giriniz");
		String cinsiyet = scan.next().toLowerCase();
		int yas = scan.nextInt();
		int kilo = scan.nextInt();

		if (cinsiyet.equals("kadin")) {
			if (kilo >= 50 && kilo < 120  && yas>20) {
				System.out.println("kan verebilir");
			} else {
				System.out.println("kan veremez");
			}
		} else if (cinsiyet.equals("erkek") ) {
			if (kilo >= 70 && kilo < 130 && yas>18) {
				System.out.println("kan verebilir");
			} else {
				System.out.println("kan veremez");
			}
		} else {
			System.out.println("degerler yanlıs");
		}
		{

		}

	}

}
