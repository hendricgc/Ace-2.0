/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Atleta;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author  Hendric, Murillo
 */
public class AtletaController extends Observable{
    
    protected DAOFactory dao = null;
    
    public AtletaController(DAOFactory dao){
        this.dao = dao;
    }
    /**
     * 
     * @param a
     * @return retorna true se cadastroucom sucesso e false em caso de falha
     * @throws SQLException 
     */
    public boolean cadastrarAtleta(Atleta a) throws SQLException{
        if(a != null){
            if(dao.getAtletaDAO().inserirAtleta(a)){
                setChanged();
                notifyObservers();
                return true;
            }         
        }
        return false;
    }
    
    /**
     * 
     * @param a
     * @return retorna true em caso de sucesso na atualizaçao do atleta e false em caso de falha
     * @throws SQLException 
     */
    public boolean atualizarAtleta(Atleta a) throws SQLException{
        if(a != null){
            if(dao.getAtletaDAO().atualizarAtleta(a)){
                setChanged();
                notifyObservers();
                return true;
            }         
        }
        return false;
    }
    
    /**
     * 
     * @return retora uma lista com todos os atletas
     * @throws SQLException 
     */
    public LinkedList<Atleta> consultarTodosAtletas() throws SQLException{

        LinkedList<Atleta> atletas;
        atletas = dao.getAtletaDAO().listarTodosAtletas();
        if(atletas != null){
            setChanged();
            notifyObservers();
            return atletas;
        }
        return null;
    }
    
    /**
     * 
     * @param id
     * @return retorna um objeto atleta 
     */
    public Atleta buscarAtletaID(int id){
        if(id > 0){
            try {
                Atleta a = dao.getAtletaDAO().buscarAtletaID(id);
                if(a != null){
                    return a;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;    
    }    
}
