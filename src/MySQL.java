import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

	/*IMPORTANTE: Tiene que tener el 'JDBC MySQL' importado en el proyecto para que los métodos funcionen.*/

	// Conexion a base de datos:
	public static Connection conectarBaseDatos(String url, String user, String password) {

		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(url, user, password);
			System.out.println("Conexion establecida con exito.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexion;
	}
	
	// Crear una base de datos:
	public static void crearBaseDatos(Connection conexion, String nombre) {
		
		Statement stmt = null;
		
		try {
			stmt = conexion.createStatement();
			stmt.executeUpdate("CREATE DATABASE " + nombre);
			System.out.printf("Base de datos, %s, creada con exito.\n", nombre);
		} catch (SQLException e) {
			System.err.printf("No se ha podido crear la base de datos: %s\n", nombre);
			e.printStackTrace();
		}
		
	}
	
	// Borrar una base de datos:
	public static void borrarBaseDatos(Connection conexion , String nombre) {
		
		Statement stmt = null;
		
		try {
			stmt = conexion.createStatement();
			stmt.executeUpdate("DROP DATABASE " + nombre);
			System.out.printf("Base de datos, %s, ha sido borrada con exito.\n", nombre);
		} catch (SQLException e) {
			System.err.println("No se ha podido borrar la Base de Datos");
			e.printStackTrace();
		}		
	}
	
	// Crear una tabla:
	public static void crearTabla(Connection conexion, String consulta) {
				
		Statement stmt = null;
						
		try {
			stmt = conexion.createStatement();
			stmt.execute(consulta);
			System.out.println("Tabla creada con exito.");
		} catch (SQLException e) {
			System.err.println("Error al crear la tabla.");	
			e.printStackTrace();
		}				
	} 

	// Borrar una tabla:
	public static void borrarTabla(Connection conexion, String tabla) {
		
		Statement stmt = null;		
		String consulta = "DROP TABLE " + tabla;
		
		try {
			stmt = conexion.createStatement();
			stmt.executeUpdate(consulta);
			System.out.println("Tabla borrada con exito.");
		} catch (SQLException e) {
			System.err.println("La Tabla no ha podido ser borrada.");
			e.printStackTrace();
		}		
	}

	
}
