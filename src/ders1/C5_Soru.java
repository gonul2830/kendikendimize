package ders1;

public class C5_Soru {

	public static void main(String[] args) {
		String kelime1 = "ali okula gel, veli git";
		String kelime2 ="GeleteSerey";
		// 
		System.out.print ("GeleteSerey".replace("e","a"));
		
		System.out.println("");
		
		System.out.println(kelime1.equals(kelime2));
		System.out.println();
		
		System.out.println(kelime1.charAt(5));
		System.out.println("$$$$$$");
		
		//System.out.println(kelime1.charAt(kelime1.length()));
		System.out.println(" ");
		System.out.println(kelime1.length());
		
		System.out.println("&&&");
		
		//Aþaðýdaki komut satýrlarýndan hangisi ile tek karakterlik bir veri okunabilir?
			//	a) next()
			//	b) nextByte()
			//	c) next().charAt(0)
			//	d) nextInt()
			//	e) nextChar();
		
		
		System.out.println(kelime1.equalsIgnoreCase(kelime2));
		System.out.println(kelime1.indexOf("l, "));
		
		System.out.println(" ||||||");
		System.out.println(kelime1.lastIndexOf('i',20));
		
	System.out.println("%%%%%%%%%%%%");
	
	
	
		
	}

}
