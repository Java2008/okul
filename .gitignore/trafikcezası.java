package com.org.nyp;

public class trafikcezası {
public static void main(String[]args) {
	
	int hiz=1000;
	if (hiz>90) {
		System.out.println("!Yavaş! Radara Girdiniz");
		if (hiz>=90 && hiz<120)
			System.out.println("Cezanız 2000TL");
		else if (hiz>=120)
			System.out.println("Cezanız 4000TL");
	}
	else
		System.out.println("Hızınız Normal Teşekürederiz");
}
}
