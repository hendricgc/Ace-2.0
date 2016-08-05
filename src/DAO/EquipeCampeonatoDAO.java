/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Campeonato;
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
public class EquipeCampeonatoDAO {
    
    protected Connection conn;
            
    public EquipeCampeonatoDAO(){
        //conn = ConnectionFactory.getConnection();
        while(conn == null){
            conn = ConnectionFactory.getConnection();
        }
    }
    
    public boolean inserirEquipeCampeonato(Campeonato campeonato, Equipe equipe) throws SQLException{
        String sql_equipe_campeonato = "INSERT INTO equipe_campeonato(id_equipe, id_campeonato) VALUES(?, ?)";
        String sql_campeonato = "SELECT id FROM campeonatos WHERE nome = ? AND organizador = ? AND ano = ?";
        String sql_equipe = "SELECT id FROM equipes WHERE nome = ? AND cor1 = ? AND cor2 = ? AND ano_fundacao = ?";
        int id_equipe;
        int id_campeonato;
        try{
            PreparedStatement ps = conn.prepareStatement(sql_campeonato);
            ps.setString(1, campeonato.getNome());
            ps.setString(2, campeonato.getOrganizador());
            ps.setInt(3, campeonato.getAnoCampeonato());

            ResultSet rs = ps.executeQuery();
            if(rs.first())  id_campeonato = rs.getInt("id");
            else            return false;
            
            ps.close();
            rs.close();
            
            ps = conn.prepareStatement(sql_equipe);
            ps.setString(1, equipe.getNome());
            ps.setString(2, equipe.getCor1());
            ps.setString(3, equipe.getCor2());
            ps.setInt(4, equipe.getAnoFundacao());
            
            rs = ps.executeQuery();
            if(rs.first())  id_equipe = rs.getInt("id");
            else            return false;
            
            ps.close();
            rs.close();
            
            ps = conn.prepareStatement(sql_equipe_campeonato);
            ps.setInt(1, id_equipe);
            ps.setInt(2, id_campeonato);
            
            int result = ps.executeUpdate();
            
            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
        
    public boolean isEquipeInscrita(Equipe equipe) throws SQLException{
        String sql_equipe = "SELECT * FROM equipe_campeonato WHERE id_equipe = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_equipe);
        ResultSet rs = ps.executeQuery();
        
        return rs.first();
    }
        
    public LinkedList<Equipe> listarEquipesCampeonato(Campeonato campeonato) throws SQLException{
        
        LinkedList<Equipe> equipes = new LinkedList<>();
        String sql_equipe = "SELECT * FROM equipes WHERE equipes.id = equipe_campeonato.id AND equipe_campeonato.id = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql_equipe);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Equipe equipe = new Equipe();
            equipe.setIdTime(rs.getInt("id"));
            equipe.setNome(rs.getString("nome"));
            equipe.setCor1(rs.getString("cor1"));
            equipe.setCor2(rs.getString("cor2"));
            equipe.setAnoFundacao(rs.getInt("ano_fundacao"));
        }
                
        
        return null;
    }
}
