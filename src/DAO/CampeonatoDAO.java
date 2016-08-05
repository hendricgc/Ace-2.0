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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public LinkedList<Campeonato> listarTodosCampeonatos() {
        LinkedList<Campeonato> campeonatos = new LinkedList<>();
        String sql_campeonato = "SELECT * FROM campeonatos";
        try {
            PreparedStatement ps = conn.prepareStatement(sql_campeonato);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Campeonato camp = new Campeonato();
                camp.setIdCampeonato(rs.getInt("id"));
                camp.setNome(rs.getString("nome"));
                camp.setAnoCampeonato(rs.getInt("ano"));
                camp.setOrganizador(rs.getString("organizador"));
                
                campeonatos.add(camp);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return campeonatos;
    }  
  
    public Campeonato buscarCampeonatoNome(String nomeCampeonato) throws SQLException{
        String sql_campeonato = "SELECT * FROM campeonatos WHERE nome = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_campeonato);
        ps.setString(1, nomeCampeonato);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            Campeonato campeonato = new Campeonato();
            campeonato.setAnoCampeonato(rs.getInt("ano"));
            campeonato.setIdCampeonato(rs.getInt("id"));
            campeonato.setNome(nomeCampeonato);
            campeonato.setOrganizador(rs.getString("organizador"));
            return campeonato;
        }
        return null;     
    }
}
