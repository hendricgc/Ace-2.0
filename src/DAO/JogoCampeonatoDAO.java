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
import java.sql.SQLException;

/**
 *
 * @author Hendric
 */
public class JogoCampeonatoDAO {
    
    protected Connection conn;
        
    public JogoCampeonatoDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public boolean inserirJogo(Equipe a, Equipe b, Campeonato camp) throws SQLException{
        String sql_jogo = "INSERT into jogo_campeonato(id_campeonato, id_mandante, id_visitante) VALUES(?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql_jogo);
        ps.setInt(1, camp.getIdCampeonato());
        ps.setInt(2, a.getIdTime());
        ps.setInt(3, b.getIdTime());
        
        System.out.println(ps.toString());
        
        int result = ps.executeUpdate();
        return result > 0;
    }
}
