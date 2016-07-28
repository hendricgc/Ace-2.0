/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Atleta;
import Model.Comissao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hendric
 */
public class ComissaoDAO {
    
    protected Connection conn;
            
    public ComissaoDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public boolean inserirComissao(Comissao a) throws SQLException{
        String sql_comissao = "INSERT INTO pessoa_comissao(nome, data_nasc, rg, cpf, cargo) VALUES(?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_comissao);

            ps.setString(1, a.getNome());
            ps.setDate(2, new Date(a.getDataNasc().getTime()));
            ps.setString(3, a.getRG());
            ps.setString(4, a.getCPF());
            ps.setString(5, a.getCargo());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public boolean atualizarComissao(Comissao a) throws SQLException{
        String sql_comissao = "UPDATE pessoa_comissao SET nome = ?, data_nasc = ?, rg = ?, cpf = ?, cargo = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_comissao);

            ps.setString(1, a.getNome());
            ps.setDate(2, new Date(a.getDataNasc().getTime()));
            ps.setString(3, a.getRG());
            ps.setString(4, a.getCPF());
            ps.setString(5, a.getCargo());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
