import java.util.*;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre_usuario = entrada.nextLine();
		
		System.out.print("\nIntroduce tu edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El ano que viene tendras " + (edad + 1) + " anos.");
		
		entrada.close();
	}

}
