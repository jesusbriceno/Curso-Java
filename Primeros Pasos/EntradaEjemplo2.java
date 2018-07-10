import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre:");
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		
		//System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (Integer.parseInt(edad) + 1) + " años.");
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + edad_usuario + " años.");
		//System.out.println();
	}

}
