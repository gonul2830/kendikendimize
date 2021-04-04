package ders1;

import java.util.Scanner;

public class C7_Question02 {

	public static void main(String[] args) {
		/* Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
		 * return eden metod yaziniz
		 *
		 * ornek
		 * input  elma  2
		 *        army  3
		 *
		 * output  eaea
		 *         ayayay
*/

		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir kelime giriniz");
		String kelime= scan.nextLine();
		System.out.println("Lutfen bir sayi giriniz");
		int sayi= scan.nextInt();
		olustur(kelime,sayi);
	}

	private static void olustur(String kelime, int sayi) {
		String str ="";
	     for (int i = 0; i < sayi; i++) {
			str+=kelime.charAt(0)+kelime.charAt(kelime.length()-1);
		}
		System.out.println(str);
	}

}
