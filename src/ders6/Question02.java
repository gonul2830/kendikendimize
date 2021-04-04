package ders6;

import java.util.Scanner;

public class Question02 {



	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir sayý giriniz");
		
		int sayi=scan.nextInt();
		
		String sayi1=sayi+"";
		
	
		
		for (int i = sayi1.length()-1; i >=0 ; i--) {
			System.out.print(sayi%10);
			sayi/=10;
	}

}
}
