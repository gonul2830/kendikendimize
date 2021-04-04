package ders4;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/* kullanicidan bir string alin ve her karakteri kullanicinin istedigi
		* kadar yazdiralim
		bir string de Her karakteri n kez yineleyen bir method oluşturun.
		Örnekler
		repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
		repeat("hello", 3) ➞ "hhheeellllllooo"
		repeat("stop", 1) ➞ "stop"
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String name = scan.next();
		System.out.println("lutfen tekrar sayısını giriniz");
		int tekrar= scan.nextInt();
		
		
		for (int i = 0; i <name.length(); i++) {
			for (int j = 0; j < tekrar; j++) {
				System.out.print(name.charAt(i));
			}
			
		}
		
	
		
	}

}
