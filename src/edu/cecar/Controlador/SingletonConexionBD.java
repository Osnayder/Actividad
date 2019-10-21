package edu.cecar.Controlador;

/**
 *
 * Clase: SingletonConexionBD 
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

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SingletonConexionBD {
    
    private static Connection connection;
    
    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = new ConectarMySQL ("localhost","empresa","root","").getConnection();
            } catch (Exception ex) {
                Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return connection;
    }

}
