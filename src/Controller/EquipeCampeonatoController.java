/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Campeonato;
import Model.Equipe;
import java.sql.SQLException;
import java.util.Observable;

/**
 *
 * @author Hendric
 */
public class EquipeCampeonatoController extends Observable{
    
    protected DAOFactory dao = null;
    
    public EquipeCampeonatoController(DAOFactory dao){
        this.dao = dao;
    }
    
    public boolean inserirEquipeCampeonato(Campeonato campeonato, Equipe equipe) throws SQLException{
        if(campeonato != null){
            if(dao.getEquipeCampeonatoDAO().inserirEquipeCampeonato(campeonato, equipe)){
                setChanged();
                notifyObservers();
                return true;
            }         
        }
        return false;
    }
}
