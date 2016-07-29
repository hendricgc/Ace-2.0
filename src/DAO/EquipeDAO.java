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
import java.sql.SQLException;

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
}
