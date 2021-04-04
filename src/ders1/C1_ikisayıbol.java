package ders1;

import java.util.Scanner;

public class C1_ikisayýbol {

	public static void main(String[] args) {
		//Örnek 4:Kullanýcýdan iki sayý alýn
		//bu iki sayýdan buyuk olaný kücüge bolun
		//sonucunu yazdýrýn

   Scanner scan = new Scanner (System.in);
   System.out.println("lutfen iki sayý giriniz");
   
  double sayi1= scan.nextDouble();
  double sayi2= scan.nextDouble();
  
  
  if (sayi1>sayi2) {
	System.out.println("bolumun sonucu:" + sayi1/sayi2);
} else if(sayi2>sayi1) {
    System.out.println("bolumun sonucu:"+sayi2/sayi1);
} else {
	System.out.println("girdiginiz sayýlar birbirine esittir");
}
		       scan.close();
		        
		    } 
		}

	