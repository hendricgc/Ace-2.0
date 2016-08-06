/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Campeonato;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author  Hendric, Murillo
 */
public class CampeonatoController extends Observable{
    
    protected DAOFactory dao = null;
    /**
     * 
     * @param dao ponteiro pro banco de dados
     */
    public CampeonatoController(DAOFactory dao){
        this.dao = dao;
    }
    
    /**
     * Metodo para cadastrar um campeonato
     * @param campeonato objeto campeonato
     * @return retorna true se o campeonato foi cadastrado com sucesso e false em caso de falha
     * @throws SQLException exception
     */
    public boolean cadastrarCampeonato(Campeonato campeonato) throws SQLException{
        if(campeonato != null){
            if(dao.getCampeonatoDAO().criarCampeonato(campeonato)){
                setChanged();
                notifyObservers();
                return true;
            }         
        }
        return false;
    }
    /**
     * Metodo para listar todos os campeonatos
     * @return retorna lista com todos os campeonatos
     * @throws SQLException exception
     */
    public LinkedList<Campeonato> listarTodosCampeonatos() throws SQLException{
        LinkedList<Campeonato> campeonatos;
        
        campeonatos = dao.getCampeonatoDAO().listarTodosCampeonatos();
        if(campeonatos != null)
            return campeonatos;
        
        return null;
    }         
}
