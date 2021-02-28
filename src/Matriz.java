
public class Matriz {

	public static int[][] crearMatriz(int filas, int columnas){

		int[][] matriz = new int[filas][columnas];

		for(int fila = 0; fila < filas; fila++) {
			for(int columna = 0; columna < columnas; columna++) {
				matriz[fila][columna] = (int)(Math.random() * 10);
			}
		}		
		return matriz;		
	}

	public static void mostrarMatriz(int[][] matriz) {
		for(int filas=0; filas < matriz.length; filas++) {
			System.out.println();
			for(int cols=0; cols < matriz[0].length; cols++) {
				System.out.printf("%d ", matriz[filas][cols]);
			}
		}
	}

	public static int[][] copiarMatriz(int[][] matriz){
		int[][] matrizCopia = new int[matriz.length][matriz[0].length];

		for(int filas=0; filas < matrizCopia.length; filas++) {
			for(int columnas = 0; columnas < matrizCopia[0].length; columnas++) {
				matrizCopia[filas][columnas] = matriz[filas][columnas];
			}
		}

		return matrizCopia;
	}

	public static int[][] trasponerMatriz(int[][] matriz){
		int filas = matriz.length;
		int columnas = matriz[0].length;

		int[][] matrizCopia = new int[filas][columnas];

		for(int fila=0; fila < filas; fila++) {
			for(int col=0; col < columnas; col++) {
				matrizCopia[fila][col] = matriz[col][fila];
			}
		}		
		return matrizCopia;
	}	

	public static int[][] diagonalMatriz(int[][] matriz){
		int filas = matriz.length;
		int columnas = matriz[0].length;
		int[][] matrizCopia = new int[filas][columnas];

		for(int fila=0; fila < filas; fila++) {
			for(int col=0; col < columnas; col++) {
				if(fila == col) {
					matrizCopia[fila][col] = 1;
				} else {
					matrizCopia[fila][col] = 0;
				}
			}
		}
		return matrizCopia;
	}

	public static int[][] sumaMatrices(int[][] primeraMatriz, int[][] segundaMatriz){
		
		int filas = primeraMatriz.length;
		int columnas = primeraMatriz[0].length;
		
		int[][] matrizResultado = new int[filas][columnas];
		
		for(int f=0; f < filas; f++) {
			for(int c=0; c < columnas; c++) {
				matrizResultado[f][c] = primeraMatriz[f][c] + segundaMatriz[f][c]; 
			}
		}
		return matrizResultado;		
	}
	
	public static int[][] productoMatrices(int[][] primeraMatriz, int[][] segundaMatriz){
		
		int filas = primeraMatriz.length;
		int columnas = primeraMatriz[0].length;
		
		int[][] matrizResultado = new int[filas][columnas];
		
		for(int f=0; f < filas; f++) {
			for(int c=0; c < columnas; c++) {
				matrizResultado[f][c] = primeraMatriz[f][c] * segundaMatriz[f][c]; 
			}
		}
		return matrizResultado;		
	}

	

}
