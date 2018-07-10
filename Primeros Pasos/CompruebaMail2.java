import javax.swing.JOptionPane;
public class CompruebaMail2 {

	public static void main(String[] args) {
		int arroba = 0;
		String mail = JOptionPane.showInputDialog("Introduce tu mail: ");
		boolean punto = false;
		
		for(int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i) == '@') {
				arroba++;
			}
			
			if(mail.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true) {
			System.out.println("El email ingresado es correcto.");
		}else {
			System.out.println("El email ingresado no es correcto.");
		}
		
	}

}