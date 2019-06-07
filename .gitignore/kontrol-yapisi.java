package com.org.nyp;
import java.util.Scanner;

public class kontrolyapisi {
	
	
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("İlk Sayıyı Giriniz");
		int sayi1=s.nextInt(); //Birinci sayımız
		
		System.out.println("İkinci Sayıyı Giriniz");
		int sayi2=s.nextInt(); //İkinci sayımız
		 
		if(sayi1>sayi2)
			System.out.println(sayi1+","+sayi2+" 'den Büyüktür ");
		else
			System.out.println(sayi1+","+sayi2+" 'den Küçüktür ");
		if(sayi1<=sayi2)
			System.out.println(sayi1+","+sayi2+" 'Eşitir ");
		else
			System.out.println(sayi1+","+sayi2+" Eşit Değil ");
	
	}

}
