import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave = "Jesus";
		String pass = "";
		byte contador = 0;
		
		while(clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Ingresa la contraseña:");
			if(clave.equals(pass) == false) {
				System.out.println("Incorrecto");
			}
			
			contador++;
			if(contador == 5) {
				System.out.println("Has superado el numero de intentos. El programa se dejara de ejecutar.");
				System.exit(1);
			}
		}
		
		System.out.println("\n\nBienvenido(a) al sistema.");
	}

}
