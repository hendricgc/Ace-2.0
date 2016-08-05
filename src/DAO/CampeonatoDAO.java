/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Atleta;
import Model.Campeonato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hendric
 */
public class CampeonatoDAO {
    
    protected Connection conn;
            
    public CampeonatoDAO(){
        //conn = ConnectionFactory.getConnection();
        while(conn == null){
            conn = ConnectionFactory.getConnection();
        }
    }
    
        public boolean criarCampeonato(Campeonato campeonato) throws SQLException{
        String sql_campeonato = "INSERT INTO campeonatos(nome, organizador, ano) VALUES(?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_campeonato);
            ps.setString(1, campeonato.getNome());
            ps.setString(2, campeonato.getOrganizador());
            ps.setInt(3, campeonato.getAnoCampeonato());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
}
