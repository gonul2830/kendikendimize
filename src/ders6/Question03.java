package ders6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
//Kullan�c�dan bir say� al�n ve say�s� tersten yazd�r�n
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir say� giriniz");
		
		int sayi=scan.nextInt();
		
		String sayi1=sayi+"";
		
		String ters="";
		
		for (int i = sayi1.length()-1; i >=0 ; i--) {
			//List<Character>list = new ArrayList<>();	
		ters+=sayi1.charAt(i);
		//list.add(sayi1.charAt(i));
		//System.out.print(list);
		}
		
               System.out.println(ters);
	
		
		
	}

}
