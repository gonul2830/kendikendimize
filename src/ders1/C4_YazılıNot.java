package ders1;

import java.util.Scanner;

public class C4_YazýlýNot {

	public static void main(String[] args) {
		//Kullanýcýdan rakam olarak notunu alýp;
		//  0-50 kaldý (1)
		// 60dan kucuk ise gecer (2)
		// 70 den kucuk orta (3)
        // 85 den kucuk iyi (4)       
		// 100 den kucuk pekiiyi (5)
		
		Scanner scan= new Scanner (System.in);
		System.out.println("lutfen notunuzu giriniz");
		double not = scan.nextDouble();
		
		if (not<0) {
			System.out.println("gecersiz not girdiniz");
		}else if(not<50) {
			System.out.println("Aldýgýnýz not kaldý(1)");
		}else if(not<60) {
			System.out.println("Aldýgýnýz not gecer (2)");
		}else if(not<70) {
			System.out.println("Aldýgýnýz not orta (3)");
		}else if (not<85) {
			System.out.println("Aldýgýnýz not iyi(4)");
		}else if(not<100) {
			System.out.println("Aldýgýnýz not pekiyi(5)");
		} else {
			System.out.println("gecersiz not girdiniz");
		}
		
		
		
		
		
	}

}
