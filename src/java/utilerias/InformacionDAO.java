package utilerias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvarado Montes
 */

import conexion.ConexionDB;
import modelo.Individual;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InformacionDAO {
     public List<Individual> getDBIndividual(){
        List<Individual> individuales = new ArrayList<Individual>();
        try {
            Statement statement = ConexionDB.conn.createStatement();
            String consulta = " SELECT  nombre, apellido, direccion, dpi"+
                              " FROM individuales";
            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next()){
                individuales.add(new Individual(rs.getString("nombre"), rs.getInt("apellido"), rs.getInt("direccion"), rs.getInt("dpi")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return individuales;
    }
     
      public void guardarIndividual(Individual individual){
        try {
            Statement statement = ConexionDB.conn.createStatement();
            String dml = "INSERT INTO carreras(codigo,nombre) VALUES("+
                        individual.getNombre()+ ",'" + individual.getApellido()+ "')" + individual.getDireccion()+ ",´" + individual.getDpi()+ ",´";
            System.out.println("dml = " + dml);
            statement.executeUpdate(dml);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
}
