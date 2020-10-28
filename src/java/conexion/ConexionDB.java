package conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvarado Montes
 */

import java.sql.Connection;
import java.sql.DriverManager;
        
public class ConexionDB {
     public static final String DRIVER_DB = "org.postgresql.Driver";
    public static final String URL_DB ="jdbc:postgresql://localhost:5432/midatabase";
    public static final String USER_DB = "postgres";
    public static final String PASSWORD_DB = "12345";
    public static Connection conn;
    static{
        try {
            Class.forName(DRIVER_DB);
            conn=DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);   
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+ e.getMessage());
        }
            System.out.println("La conexion se realizo correctamente");
    
    }
}
