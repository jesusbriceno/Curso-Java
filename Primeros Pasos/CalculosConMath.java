
public class CalculosConMath {

	public static void main(String[] args) {
		double raiz = Math.sqrt(9);
		
		System.out.println(raiz);
		
		/*short a, b, c, d = 2;
		short suma = 2 + 2 + 2 + 2;
		System.out.println(suma);*/
		
		double radio = 2;
		double PI = Math.PI;
		double area_circulo_v1 = PI * Math.pow(radio, 2);
		
		System.out.println(area_circulo_v1);
		
		double diametro = 5;
		double area_circulo_v2 = PI * (Math.pow(diametro, 2) / 4);
		
		System.out.println(area_circulo_v2);
		
		float num1 = 5.85F;
		int resultado = Math.round(num1);
		
		System.out.println(num1);
		System.out.println(resultado);
	}

}
