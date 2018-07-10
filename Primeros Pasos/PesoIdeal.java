import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {
		String genero = "";
		int altura = 0;
		
		do {
			genero = JOptionPane.showInputDialog("Intrudoce tu genero: (H/M)");
		}while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		do {
			altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm: "));
		}while(altura <= 0);
		
		int peso_ideal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			peso_ideal = altura - 110;
		} else if(genero.equalsIgnoreCase("M")) {
			peso_ideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es " + peso_ideal + " kg.");
	}

}
