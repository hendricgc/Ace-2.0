/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Atleta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Hendric
 */
public class AtletaDAO {
        
    protected Connection conn;
            
    public AtletaDAO(){
        //conn = ConnectionFactory.getConnection();
        while(conn == null){
            conn = ConnectionFactory.getConnection();
        }
    }
    
    public boolean inserirAtleta(Atleta a) throws SQLException{
        String sql_atleta = "INSERT INTO pessoa_atleta(nome, data_nasc, rg, cpf, altura, peso, posicao) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_atleta);
            ps.setString(1, a.getNome());
            ps.setDate(2, new Date(a.getDataNasc().getTime()));
            ps.setString(3, a.getRG());
            ps.setString(4, a.getCPF());
            ps.setDouble(5, a.getAltura());
            ps.setDouble(6, a.getPeso());
            ps.setString(7, a.getPosicao());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public boolean atualizarAtleta(Atleta a) throws SQLException{
        String sql_atleta = "UPDATE pessoa_atleta SET nome = ?, data_nasc = ?, rg = ?, cpf = ?, altura = ?, "
                + "peso = ?, posicao = ? WHERE id = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_atleta);

            ps.setString(1, a.getNome());
            ps.setDate(2, new Date(a.getDataNasc().getTime()));
            ps.setString(3, a.getRG());
            ps.setString(4, a.getCPF());
            ps.setDouble(5, a.getAltura());
            ps.setDouble(6, a.getPeso());
            ps.setString(7, a.getPosicao());
            ps.setInt(8, a.getIdPessoa());
            
            System.out.println(ps.toString());

            int result = ps.executeUpdate();

            return result > 0;

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public boolean removerAtleta(Atleta a) throws SQLException{
        String sql_atleta = "DELETE FROM pessoa_atleta WHERE id = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql_atleta);
            ps.setInt(1, a.getIdPessoa());
            
            int result = ps.executeUpdate();
            
            return result > 0;        
        }   
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public LinkedList<Atleta> listarTodosAtletas() throws SQLException{
        LinkedList<Atleta> result = new LinkedList<>();
        String sql_atleta = "SELECT * FROM pessoa_atleta ORDER BY nome ASC";
        
        PreparedStatement ps = conn.prepareStatement(sql_atleta);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Atleta a = new Atleta();
            a.setIdPessoa(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setDataNasc(rs.getTimestamp("data_nasc"));
            a.setRG(rs.getString("rg"));
            a.setCPF(rs.getString("cpf"));
            a.setAltura(rs.getDouble("altura"));
            a.setPeso(rs.getDouble("peso"));
            a.setPosicao(rs.getString("posicao"));
            
            result.add(a);
        }       
        return result;   
        
    }
    
    public Atleta buscarAtletaID(int id) throws SQLException{
        Atleta a = new Atleta();
        
        String sql_atleta = "SELECT * FROM pessoa_atleta WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql_atleta);
        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            a.setIdPessoa(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setCPF(rs.getString("cpf"));
            a.setRG(rs.getString("rg"));
            a.setPeso(rs.getDouble("peso"));
            a.setAltura(rs.getDouble("altura"));
            a.setPosicao(rs.getString("posicao"));
            a.setDataNasc(rs.getTimestamp("data_nasc"));
            
            return a;
        }
        return null;
    }
}