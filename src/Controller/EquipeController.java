/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Factory.DAOFactory;
import Model.Atleta;
import Model.Equipe;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Observable;

/**
 *
 * @author  Hendric, Murillo
 */
public class EquipeController extends Observable{
    
    protected DAOFactory dao = null;
    /**
     * 
     * @param dao 
     */
    public EquipeController(DAOFactory dao){
        this.dao = dao;
    }
    
    /**
     * 
     * @param a
     * @return retorna true em caso de sucesso no cadastro da equipe e false em caso de falha
     * @throws SQLException 
     */
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
    
    /**
     * 
     * @returnretorna uma lsita com todas as equipes cadastradas
     * @throws SQLException 
     */
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

    /**
     * 
     * @param nomeEquipe
     * @return retorna uma Equipe
     * @throws SQLException 
     */
    public Equipe procurarEquipeNome(String nomeEquipe) throws SQLException {
        
        Equipe e = dao.getEquipeDAO().procurarNomeEquipe(nomeEquipe);
        if(e != null){
            setChanged();
            notifyObservers();
            return e;
        }
        return null;
    }
    
    /**
     * 
     * @param e
     * @return retorna uma lista com os atletas de uma equipe
     * @throws SQLException 
     */
    public LinkedList<Atleta> getAtletasEquipe(Equipe e) throws SQLException {
        
        LinkedList<Atleta> atletas;
        atletas = dao.getAtletaEquipeDAO().getAtletasEquipe(e);
        if(atletas != null){
            setChanged();
            notifyObservers();
            return atletas;
        }
        return null;
    }
    
    /**
     * 
     * @return retorna uma lista com os atletas nao associados a uma equipe
     * @throws SQLException 
     */
    public LinkedList<Atleta> getAtletasSemEquipe() throws SQLException {
        
        LinkedList<Atleta> atletas;
        atletas = dao.getAtletaEquipeDAO().getAtletasSemEquipe();
        if(atletas != null){
            setChanged();
            notifyObservers();
            return atletas;
        }
        return null;
    }
    
    /**
     * 
     * @param e
     * @return retorna a quantidade de atletas em uma equipe
     * @throws SQLException 
     */
    public int getQuantAletasEquipe(Equipe e) throws SQLException {
        
        return dao.getAtletaEquipeDAO().getQuantAtletasEquipe(e);
    }
}
