public class Vector {
	
	public static int[] crearVector(int valores, int numeroInicial, int numeroFinal) {
		int[] vector = new int[valores];
		
		for(int k=0; k < valores; k++) {
			vector[k] = (int)((Math.random() * numeroFinal) + numeroInicial);
		}
		
		return vector;
	}

	public static void mostrarVector(int[] vector) {
		for(int nums: vector) {
			System.out.printf("%d ", nums);
		}
	}

	public static int[] revertirVector(int[] vector) {
		
		int[] vectorCopia = new int[vector.length];
		int j = (vectorCopia.length - 1);
		
		for(int k=0; k < vectorCopia.length; k++) {
			vectorCopia[k] = vector[j];
			j--;
		}		
		return vectorCopia;		
	}

	public static int numeroMayorVector(int[] vector) {
		int numeroMayor = vector[0];
		
		for(int k=0; k < vector.length; k++) {
			if(vector[k] > numeroMayor) {
				numeroMayor = vector[k];
			}
		}
		return numeroMayor;
	}

	public static int numeroMenorVector(int[] vector) {
		int numeroMenor = vector[0];
		
		for(int k=0; k < vector.length; k++) {
			if(vector[k] < numeroMenor) {
				numeroMenor = vector[k];
			}
		}		
		return numeroMenor;
	}

	public static int[] copiarVector(int[] vector) {
		int[] vectorCopia = new int[vector.length];
		
		for(int k=0; k < vectorCopia.length; k++) {
			vectorCopia[k] = vector[k];
		}
		return vectorCopia;
	}

	public static int posicionElemento(int[] vector, int elemento) {
		int posicion = 0, resultado = 0;
		
		for(int nums: vector) {
			if(elemento == nums) {
				resultado = posicion;
			}
			posicion++;
		}
		return resultado;
	}

	public static boolean equals(int[] primerVector, int[] segundoVector) {
		
		boolean equals = false;
		
		if(primerVector.length == segundoVector.length) {			
			for(int k=0; k < primerVector.length; k++) {
				if(primerVector[k] == segundoVector[k]) {
					equals = true;
				} else {
					equals = false;
					break;
				}
			}			
		} else {
			equals = false;
		}
		
		return equals;
	}

	public static int sumaElementosVector(int[] vector) {
		int suma = 0;
		
		for(int k=0; k < vector.length; k++) {
			suma += vector[k];
		}
		
		return suma;
	}

	public static double sumaElementosVector(double[] vector) {
		double suma = 0;
		for(int k=0; k < vector.length; k++) {
			suma += vector[k];
		}
		return suma;
	}
	
	public static int mediaElementosVector(int[] vector) {
		
		int suma = 0, media = 0;
		int longitud = vector.length;
		
		for(int k=0; k < longitud; k++) {
			suma += vector[k];
		}
		
		media = (suma / longitud);
		return media;
	}
	
	public static double mediaElementosVector(double[] vector) {
		
		double suma = 0, media = 0;
		int longitud = vector.length;
		
		for(int k=0; k < longitud; k++) {
			suma += vector[k];
		}
		
		media = (suma / longitud);
		return media;
	}

	
}
