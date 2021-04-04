package ders5;

public class Question01 {

	public static void main(String[] args) {
	 String isim= "kalem";
	 String str="";
	 for (int i = isim.length()-1; i >=0; i--) {

	 str=str+isim.charAt(i);
	
	}
		System.out.println(str);
		
		
		StringBuilder sb =new StringBuilder("kader");
		System.out.println(sb.reverse());
}
}