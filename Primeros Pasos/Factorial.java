/* NOTA: Desbordamiento luego de ingresar un n�mero > 20 */

import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		Long resultado = 1L;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
		
		for(int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.println("El factorial del numero " + numero + " es " + resultado);
	}

}
