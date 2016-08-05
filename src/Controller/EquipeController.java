/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Equipe;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author Hendric
 */
public class EquipeController extends Observable{
    
    protected DAOFactory dao = null;
    
    public EquipeController(DAOFactory dao){
        this.dao = dao;
    }
    
    public boolean cadastrarEquipe(Equipe a) throws SQLException{
        if(a != null){
            if(dao.getEquipeDAO().inserirEquipe(a)){
                setChanged();
                notifyObservers();
            }
            return true;
        }
        return false;
    }
    
    public LinkedList<Equipe> listarTodasEquipes() throws SQLException{
        
        LinkedList<Equipe> equipes;
        equipes = dao.getEquipeDAO().listarTodasEquipes();
        
        if(equipes != null){
            setChanged();
            notifyObservers();
            return equipes;
        }
        return null;
    }
}
