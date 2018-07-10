import javax.swing.JOptionPane;

public class UsoArrays2 {

	public static void main(String[] args) {
		String[] paises = new String[8];
		
		/*paises[0] = "Venezuela";
		paises[1] = "Chile";
		paises[2] = "Argentina";
		paises[3] = "Peru";
		paises[4] = "Bolivia";
		paises[5] = "Ecuador";
		paises[6] = "Uruguay";
		paises[7] = "Paraguay";*/
		
		//String[] paises = {"Venezuela", "Chile", "Argentina", "Peru", "Bolivia", "Ecuador", "Uruguay", "Paraguay"};
		
		for(int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Ingresa el nombre del pais[" + (i+1) + "]:");
		}
		
		/*for(int i = 0; i < 8; i++) {
			System.out.println("Pais " + (i+1) + ": " + paises[i]);
		}*/
		
		byte contador = 0;
		
		for(String elemento:paises) {
			contador++;
			System.out.println("Pais[" + contador + "]: " + elemento);
		}
	}

}
