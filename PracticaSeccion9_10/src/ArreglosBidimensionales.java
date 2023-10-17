
public class ArreglosBidimensionales {
	public static void main(String[] args) {
		int[][] arregloBidimensional1 = { { 5, 4, 1 }, { 1, 6, 2 } };
		int[][] arregloBidimensional2 = { { 8, 7, 10 }, { 13, 17, 3 } };

		int filas = arregloBidimensional1.length;
		int columnas = arregloBidimensional1[0].length;

		int[][] resultado = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resultado[i][j] = arregloBidimensional1[i][j] + arregloBidimensional2[i][j];
			}
		}
		
		System.out.println("Resultado de sumar los dos arreglos:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
	}
}
