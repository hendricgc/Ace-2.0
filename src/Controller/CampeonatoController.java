/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Campeonato;
import java.sql.SQLException;
import java.util.Observable;

/**
 *
 * @author  Hendric, Murillo
 */
public class CampeonatoController extends Observable{
    
    protected DAOFactory dao = null;
    /**
     * 
     * @param dao 
     */
    public CampeonatoController(DAOFactory dao){
        this.dao = dao;
    }
    
    /**
     * 
     * @param campeonato
     * @return retorna true se o campeonato foi cadastrado com sucesso e false em caso de falha
     * @throws SQLException 
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
}
