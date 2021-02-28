
public class Main {

	public static void main(String[] args) {

		String palabra = "Ejemplo";
		String[] vectorPalabra = Palabra.crearVector(palabra);
		String[] palabraRevertida = Palabra.revertirPalabra(vectorPalabra);
		Palabra.mostrarPalabra(vectorPalabra);
		Palabra.mostrarPalabra(palabraRevertida);
		String[] pal = {"1", "2", "2", "1"};
		
		boolean palindroma = Palabra.palindroma(palabraRevertida);
		boolean palindroma2 = Palabra.palindroma(pal);
		
		System.out.printf("\n%b\n%b", palindroma, palindroma2);

	}
}
