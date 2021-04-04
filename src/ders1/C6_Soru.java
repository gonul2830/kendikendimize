package ders1;

import java.util.Scanner;

public class C6_Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
		yazdiran bir java programi yaziniz
		Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        */
		//  calisan erkekse 65 yasindan buyukse emekli olabilir.
	Scanner scan = new Scanner (System.in);
     System.out.println("lutfen cinsiyetinizi giriniz");
     String cins = scan.nextLine();
     System.out.println("lutfen yasýnýzý giriniz");
     int yas= scan.nextInt();

     
     
     if (cins.equalsIgnoreCase("kadin")) {
		if(yas>=60) {
			System.out.println("emekli olabilirsin");
		} else {
			System.out.println("emekli olamazsýn");
		}
    	 
    	 
	} else if(cins.equalsIgnoreCase("erkek")) {
         if(yas>=65) {
        	System.out.println("emekli olabilirsin"); 
         }
         System.out.println("emekli olamazsýn");
	} else  {
		System.out.println("gecersiz sayý girdiniz");
	}
		
		
		
		
	}

}
