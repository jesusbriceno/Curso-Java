import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		/*double x = 10000.0;
		
		System.out.printf("%1.2f", x / 3);*/
		
		String num1 = JOptionPane.showInputDialog("Ingrese un numero: ");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz cuadrada de " + num2 + " = ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
