import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		short opcion = entrada.nextShort();
		
		switch(opcion) {
			case 1:
				System.out.print("\n\n\n\n\n");
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los lados del cuadrado:"));
				
				System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			break;
			
			case 2:
				System.out.print("\n\n\n\n\n");
				int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:"));
				
				System.out.println("El area del rectangulo es " + (base * altura));
			break;
			
			case 3:
				System.out.print("\n\n\n\n\n");
				base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:"));
				
				System.out.println("El area del triangulo es " + ((base * altura) / 2));
			break;
			
			case 4:
				System.out.print("\n\n\n\n\n");
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio:"));
				
				System.out.print("El area del circulo es ");
				System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			break;
			
			default:
				System.out.println("La opcion no es correcta.");
			break;
		}
		
		entrada.close();
	}

}
