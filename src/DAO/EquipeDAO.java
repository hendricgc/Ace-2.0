 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
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
public class EquipeDAO {
    
    protected Connection conn;
            
    public EquipeDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public boolean inserirEquipe(Equipe a) throws SQLException{
        String sql_equipe = "INSERT INTO equipes(nome, cor1, cor2, ano_fundacao) VALUES(?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_equipe);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getCor1());
            ps.setString(3, a.getCor2());
            ps.setInt(4, a.getAnoFundacao());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public boolean atualizarEquipe(Equipe a) throws SQLException{
        String sql_equipe = "UPDATE equipes SET nome = ?, cor1 = ?, cor2 = ?, ano_fundacao = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_equipe);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getCor1());
            ps.setString(3, a.getCor2());
            ps.setInt(4, a.getAnoFundacao());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public boolean removerEquipe(Equipe a) throws SQLException{
        String sql_equipe = "DELETE FROM equipes WHERE id = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_equipe);

            ps.setInt(1, a.getIdTime());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public LinkedList<Equipe> listarTodasEquipes() throws SQLException{
        LinkedList<Equipe> equipes = new LinkedList();
        String sql_equipe = "SELECT * FROM equipes ORDER BY nome ASC";
        
        PreparedStatement ps = conn.prepareStatement(sql_equipe);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Equipe equipe = new Equipe();
            equipe.setIdTime(rs.getInt("id"));
            equipe.setNome(rs.getString("nome"));
            equipe.setCor1(rs.getString("cor1"));
            equipe.setCor2(rs.getString("cor2"));
            equipe.setAnoFundacao(rs.getInt("ano_fundacao"));
            
            equipes.add(equipe);
        }
        return equipes;
    }
    
    public Equipe procurarNomeEquipe(String nomeEquipe) throws SQLException{
        String sql_equipe = "SELECT * FROM equipes WHERE nome = ?";

        PreparedStatement ps = conn.prepareStatement(sql_equipe);
        ps.setString(1, nomeEquipe);
            
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            Equipe equipe = new Equipe();
            equipe.setIdTime(rs.getInt("id"));
            equipe.setNome(rs.getString("nome"));
            equipe.setCor1(rs.getString("cor1"));
            equipe.setCor2(rs.getString("cor2"));
            equipe.setAnoFundacao(rs.getInt("ano_fundacao"));
            
            return equipe;
        }
        return null;
    }
}
