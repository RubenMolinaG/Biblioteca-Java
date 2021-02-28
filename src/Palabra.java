
public class Palabra {
	
	public static String[] crearVector(String palabra) {
		String[] vectorPalabra = palabra.split("");
		return vectorPalabra;
	}

	public static String[] revertirPalabra(String[] palabra) {
		
		int longitud = palabra.length;
		int j = (longitud - 1);
		String[] palabraRevertida = new String[longitud];
		
		for(int k=0; k < longitud; k++) {
			palabraRevertida[k] = palabra[j];
			j--;
		}
		
		return palabraRevertida;
	}
	
	public static void mostrarPalabra(String[] palabra) {
		for(String str: palabra) {
			System.out.printf("%s", str);
		}
		System.out.println();
	}

	public static int numeroVocales(String[] palabra) {
		int suma = 0;
		for(String str: palabra) {
			if(str.equalsIgnoreCase("A") || str.equalsIgnoreCase("E") || str.equalsIgnoreCase("I") || str.equalsIgnoreCase("O") || str.equalsIgnoreCase("U")) {
				suma++;
			}
		}
		return suma;
	}
	
	public static boolean palindroma(String[] palabra) {
		int longitud = palabra.length;
		int j = (longitud - 1);
		boolean palindroma = false;
		
		for(int k=0; k < longitud; k++) {
			if(palabra[k].equals(palabra[j])) {
				palindroma = true;
			} else {
				palindroma = false;
				break;
			}
			j--;
		}		
		return palindroma;
	}

}
