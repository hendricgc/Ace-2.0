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
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author  Hendric, Murillo
 */
public class EquipeCampeonatoController extends Observable{
    
    protected DAOFactory dao = null;
    /**
     * 
     * @param dao 
     */
    public EquipeCampeonatoController(DAOFactory dao){
        this.dao = dao;
    }
    /**
     * 
     * @param campeonato
     * @param equipe
     * @return  retorna true caso a equipe seja adicionada no campeonato e false em caso de falha
     * @throws SQLException 
     */
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
    
    public int quantEquipesCampeonato(Campeonato campeonato) throws SQLException{
        if(campeonato != null){
            return dao.getEquipeCampeonatoDAO().quantEquipesCampeonato(campeonato);
        }
        return -1;
    }
    
    public LinkedList<Equipe> listarEquipesCampeonato(Campeonato campeonato) throws SQLException{
        if(campeonato != null){
            return dao.getEquipeCampeonatoDAO().listarEquipesCampeonato(campeonato);
        }
        return new LinkedList<>();
    }
}
