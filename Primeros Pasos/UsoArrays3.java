public class UsoArrays3 {

	public static void main(String[] args) {
		int[] vector_aleatorios = new int[150];
		
		for(int i = 0; i < 150; i++) {
			vector_aleatorios[i] = (int)(Math.random() * 100);
		}
		
		byte contador = 0;
		
		for(int elemento:vector_aleatorios) {
			contador++;
			System.out.print(elemento + " ");
			
			if(contador == 50) {
				System.out.print("\n");
			}
			
			if(contador == 100) {
				System.out.print("\n");
			}
		}
	}

}
