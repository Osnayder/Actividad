package edu.cecar.Controlador;

/**
 *
 * Clase: SingletonConexionBD 
 * 
 * @version: 0.1
 *  
 * @since: 21/10/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Osnayder Conde Rodriguez, Jader Arcia Baldovino, Calor Beltran Guzman
 * 
 * Copyright: CECAR
 */

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SingletonConexionBD {
    
    private static Connection connection;
    
    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = new ConectarMySQL ("localhost","empresa","3307","root","").getConnection();
            } catch (Exception ex) {
                Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return connection;
    }

}
