
public class ManipulaCadenas {

	public static void main(String[] args) {
		String nombre = "Jesus";
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0));
		
		int ultima_letra = nombre.length() - 1;
		
		System.out.println("Y la ultima letra es la '" + nombre.charAt(ultima_letra) + "'");
	}

}
