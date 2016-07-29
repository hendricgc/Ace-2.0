/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Atleta;
import Model.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hendric
 */
public class AtletaEquipeDAO {
    
    protected Connection conn;
            
    public AtletaEquipeDAO(){
        //conn = ConnectionFactory.getConnection();
        while(conn == null){
            conn = ConnectionFactory.getConnection();
        }
    }
    
    public boolean inserirAtletaEquipe(Atleta a, Equipe e) throws SQLException{
        
        String sql_atleta_equipe = "INSERT INTO atleta_equipe VALUES (?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        
        ps.setInt(1, a.getIdPessoa());
        ps.setInt(2, e.getIdTime());
        ps.setInt(3, a.getNumeroCamisa());
        
        int result = ps.executeUpdate();
        
        return result > 0;      
    }    
    
    public boolean removerAtletaEquipe(Atleta a) throws SQLException{
        
        String sql_atleta_equipe = "DELETE FROM atleta_equipe WHERE id_atleta = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        
        ps.setInt(1, a.getIdPessoa());
        
        int result = ps.executeUpdate();
        
        return result > 0;      
    }    
    
    public boolean isAtletaEquipe(Atleta a) throws SQLException{
        
        String sql_atleta_equipe = "SELECT * FROM atleta_equipe WHERE atleta_id = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        
        ResultSet rs;
        return false;
    }
}
