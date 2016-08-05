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
import java.util.LinkedList;

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
    
    public LinkedList<Atleta> getAtletasEquipe(Equipe e) throws SQLException{
        
        LinkedList<Atleta> atletas = new LinkedList<>();
        String sql_atleta_equipe = "SELECT * FROM (atleta_equipe INNER JOIN pessoa_atleta ON atleta_equipe.id_atleta = pessoa_atleta.id)"
                + " WHERE id_equipe = ? ORDER BY nome";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        ps.setInt(1, e.getIdTime());
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Atleta a = new Atleta();
            a.setIdPessoa(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setCPF(rs.getString("cpf"));
            a.setDataNasc(rs.getTimestamp("data_nasc"));
            a.setRG(rs.getString("rg"));
            a.setPeso(rs.getDouble("peso"));
            a.setAltura(rs.getDouble("altura"));
            a.setPosicao(rs.getString("posicao"));
            
            atletas.add(a);
        }
        return atletas;
    }
    
    public int getQuantAtletasEquipe(Equipe e) throws SQLException{
        String sql_atleta_equipe = "SELECT COUNT(id_atleta) FROM atleta_equipe WHERE id_equipe = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        ps.setInt(1, e.getIdTime());
        ResultSet rs = ps.executeQuery();
        
        int result = 0;
        if(rs.next())
            result = rs.getInt(1);
        
        return result;
    }
    
    public LinkedList<Atleta> getAtletasSemEquipe() throws SQLException{
        
        LinkedList<Atleta> atletasSemEquipe = new LinkedList<>();
        String sql_atleta_equipe = "SELECT * FROM (atleta_equipe FULL OUTER JOIN pessoa_atleta ON atleta_equipe.id_atleta = pessoa_atleta.id)"
                + " WHERE id_equipe IS NULL ORDER BY nome";
              
        PreparedStatement ps = conn.prepareStatement(sql_atleta_equipe);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Atleta a = new Atleta();
            a.setIdPessoa(rs.getInt("id"));
            a.setAltura(rs.getDouble("altura"));
            a.setCPF(rs.getString("cpf"));
            a.setDataNasc(rs.getTimestamp("data_nasc"));
            a.setNome(rs.getString("nome"));
            a.setPeso(rs.getDouble("peso"));
            a.setPosicao(rs.getString("posicao"));
            a.setRG(rs.getString("rg"));
                       
            atletasSemEquipe.add(a);
        }
        return atletasSemEquipe;
    }
}
