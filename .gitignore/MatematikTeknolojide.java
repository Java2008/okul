package com.org.nyp;
import java.util.Random;
import javax.swing.JOptionPane;

public class MatematikTeknolojide {
public static void main(String[]args) {
	int i=10;
	Random r=new Random();
	int sayi=r.nextInt(10);
	while(true){
		
		String tahmin=JOptionPane.showInputDialog("Tahmin Gir:");
		int t=Integer.parseInt(tahmin);
		if (t==sayi) {
			String mesaj="Tahmin doğru! - "+i+". tahminde bildiniz";
			JOptionPane.showInputDialog(null,mesaj);
			break;
			
		}
		else
			if (t==sayi) {
				String mesaj="Tahmin yanlış! - "+i+". tahminde bilemediniz";
				JOptionPane.showInputDialog(null,mesaj);
				break;
				
			}
		
}
  }
   }
