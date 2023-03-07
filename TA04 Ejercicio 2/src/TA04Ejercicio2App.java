
public class TA04Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		int N = 8;
		double A = 5.5;
		char C = 'c';
		double Resultado;
		
		//Impresión del valor de las variables
		System.out.println("N = "+ N);
		System.out.println("A = "+ A);
		System.out.println("C = "+ (int) C);
		System.out.println("");
		
		//Suma de N + A
		Resultado = N + A;
		System.out.println("La suma de " + N + " + " + A + " es " + (Resultado));
		
		//Diferencia de A - N
		Resultado = A - N;
		System.out.println("La diferencia de " + A + " - " + N + " es " + (Resultado));
		
		//Valor numérico de C
		Resultado = C;
		System.out.println("El valor numérico de " + C + " es " + ((int) Resultado));
		System.out.println("");
	}

}
