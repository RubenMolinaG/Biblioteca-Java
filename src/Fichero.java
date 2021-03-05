package bibliotecajava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {

	// Crear un fichero:
	public static File crearFichero(String nombreFichero) {
		
		// Primero vemos que el fichero no este ya creado. En caso de no estar, lo creamos.
		File file = new File(nombreFichero);
		
		if(file.exists()) {
			System.out.println("El fichero que ha pasado por parámetros ya existe.");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		return file;
	}
	
	// Leer un fichero:
	public static void leerFichero(File nombreFichero) {
		
		BufferedReader bf = null;
		
		try {			
			
			bf = new BufferedReader(new FileReader(nombreFichero));			
			while(bf.ready()) {
				System.out.println(bf.readLine());
			}
			
		} catch(IOException e) {
			System.out.println("No tienes permisos para leer el fichero.");
			
		} finally {			
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();				
			}
		}		
	}
	
	// Escribir un fichero:
	public static void escribirFichero(File nombreFichero) {
		
		BufferedWriter bw = null;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el texto: ");
		String texto = reader.nextLine();
		
		try {
			bw = new BufferedWriter(new FileWriter(nombreFichero));
			bw.write(texto);
		
		} catch (IOException e) {
			System.out.println("No tiene permisos de escritura sobre el fichero.");
		
		} finally {
			reader.close();
			
			try {
				bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// Copiar contenido de un fichero a otro:
	public static void copiarContenidoFichero(File ficheroOriginal, File ficheroDestino) {
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		if(ficheroOriginal.exists() && ficheroDestino.exists()) {
			try {
				br = new BufferedReader(new FileReader(ficheroOriginal));
				bw = new BufferedWriter(new FileWriter(ficheroDestino));
				
				while(br.ready()) {
					String nuevaLinea = br.readLine();
					bw.write(nuevaLinea);					
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("Fichero Origen, no encontrado.");				
			} catch (IOException e) {
				System.out.println("No tienes permisos para leer el fichero.");			
			} finally {				
				try {
					br.close();
					bw.close();				
				} catch (IOException e) {
					System.out.println("No hemos podido cerrar el fichero con exito.");
				}
				System.out.println("Contenido del fichero copiado con exito.");
			} 
		} else {
			System.out.println("Alguno de los ficheros no existe.");
		}		
	}
	
	// Ejemplo de uso:
	public static void main(String[] args) {
		
		// Creamos dos ficheros:
		File primerFichero = crearFichero("Notas.txt");
		File segundoFichero = crearFichero("SegundoFichero.txt");
		
		// Escribimos en el primer fichero:
		escribirFichero(primerFichero);
		
		// Lo pasamos al segundo fichero:
		copiarContenidoFichero(primerFichero, segundoFichero);
		
		// Leemos el contenido del segundo fichero:
		leerFichero(segundoFichero);
		
	}
}
