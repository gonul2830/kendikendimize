package ders1;

import java.util.Scanner;

public class C1_ikisayıbol {

	public static void main(String[] args) {
		//Örnek 4:Kullanıcıdan iki sayı alın
		//bu iki sayıdan buyuk olanı kücüge bolun
		//sonucunu yazdırın

   Scanner scan = new Scanner (System.in);
   System.out.println("lutfen iki sayı giriniz");
	System.out.println("uzak sunucudaki kodum");	// GitHub daki degisiklik
   
  double sayi1= scan.nextDouble();
  double sayi2= scan.nextDouble();
  
  
  if (sayi1>sayi2) {
	System.out.println("bolumun sonucu:" + sayi1/sayi2);
} else if(sayi2>sayi1) {
    System.out.println("bolumun sonucu:"+sayi2/sayi1);
} else {
	System.out.println("girdiginiz sayılar birbirine esittir");
}
		       scan.close();
		        
		    } 
		}

	
