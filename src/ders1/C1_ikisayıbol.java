package ders1;

import java.util.Scanner;

public class C1_ikisay�bol {

	public static void main(String[] args) {
		//�rnek 4:Kullan�c�dan iki say� al�n
		//bu iki say�dan buyuk olan� k�c�ge bolun
		//sonucunu yazd�r�n

   Scanner scan = new Scanner (System.in);
   System.out.println("lutfen iki say� giriniz");
   
  double sayi1= scan.nextDouble();
  double sayi2= scan.nextDouble();
  
  
  if (sayi1>sayi2) {
	System.out.println("bolumun sonucu:" + sayi1/sayi2);
} else if(sayi2>sayi1) {
    System.out.println("bolumun sonucu:"+sayi2/sayi1);
} else {
	System.out.println("girdiginiz say�lar birbirine esittir");
}
		       scan.close();
		        
		    } 
		}

	