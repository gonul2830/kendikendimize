package ders8;

public class Question01 {

public static void countEgg(int numOfEgg){		

		try {

			if(numOfEgg<0) {		

				throw new IllegalArgumentException();	

			}else {		

				System.out.println(numOfEgg);		

			}

		}catch(IllegalArgumentException e) {

			System.out.println("Yumurta sayisi negatif olamaz");

		}	

}
}		
	

