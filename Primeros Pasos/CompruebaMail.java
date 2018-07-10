import javax.swing.*;
public class CompruebaMail {

	public static void main(String[] args) {
		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Introduce tu mail: ");
		
		for(int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i) == '@') {
				arroba = true;
			}
		}
		
		if(arroba == true) {
			System.out.println("El email ingresado es correcto.");
		}else {
			System.out.println("El email ingresado no es correcto.");
		}
		
	}

}
