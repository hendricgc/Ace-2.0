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
     * @param dao ponteiro pro banco de dados
     */
    public EquipeCampeonatoController(DAOFactory dao){
        this.dao = dao;
    }
    /**
     * Metodo para inserir uma equipe em um campeonato
     * @param campeonato objeto campeonato
     * @param equipe objeto equipe
     * @return  retorna true caso a equipe seja adicionada no campeonato e false em caso de falha
     * @throws SQLException exception
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
    /**
     * Metodo para retornar a quantidade de equipes em um campeonato
     * @param campeonato objeto cmapeonato
     * @return retorna a quantidade de equipes em um campeonato
     * @throws SQLException exception
     */
    public int quantEquipesCampeonato(Campeonato campeonato) throws SQLException{
        if(campeonato != null){
            return dao.getEquipeCampeonatoDAO().quantEquipesCampeonato(campeonato);
        }
        return -1;
    }
    
    /**
     * Metodo para listar as equipes de um campeonato
     * @param campeonato objeto campeonato
     * @return retorna uma lista com todas as equipes de um campeonato
     * @throws SQLException exception
     */
    public LinkedList<Equipe> listarEquipesCampeonato(Campeonato campeonato) throws SQLException{
        if(campeonato != null){
            return dao.getEquipeCampeonatoDAO().listarEquipesCampeonato(campeonato);
        }
        return new LinkedList<>();
    }
}
