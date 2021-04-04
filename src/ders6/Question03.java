package ders6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
//Kullanıcıdan bir sayı alın ve sayısı tersten yazdırın
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir sayı giriniz");
		
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
