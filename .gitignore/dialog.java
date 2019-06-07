import javax.swing.JOptionPane;

public class dialog {

	public static void main (String[]args) {
		
		int a=200;
		
		int b=190;
		
		int c=680;
		
		System.out.println(a + b + c);
		if(a + b + c>1000) {
			JOptionPane.showMessageDialog(null,"Bu Yüksek Bir Rakam");
		}
		else
			if(a + b + c<1000) {
				JOptionPane.showMessageDialog(null,"Bu düşük Bir Rakam");
			}
		
	}
	
}
