import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre:");
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		
		//System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (Integer.parseInt(edad) + 1) + " a�os.");
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + edad_usuario + " a�os.");
		//System.out.println();
	}

}
