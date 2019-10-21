/**
 *
 * Clase: ConectarMySQL
 * 
 * @version: 0.1
 *  
 * @since: 5/08/2019
 * 
 * Fecha de Modificaci�n:
 * 
 * @author: Jhon Jaime Mendez
 * 
 * Copyright: CECAR
 */


package edu.cecar.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectarMySQL {

	private Connection connection;

	public ConectarMySQL(String servidorBD, String nombreBD, String usuario, String password) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			String url= "jdbc:mysql://" + servidorBD + "/" + nombreBD+
                                    "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
			connection=DriverManager.getConnection(url, usuario, password);
                        System.out.println("Conexión exitosa");
		}catch  (Exception e) {
			System.out.println("Error al conectar: "+e);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void cerrarConexion()  {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
